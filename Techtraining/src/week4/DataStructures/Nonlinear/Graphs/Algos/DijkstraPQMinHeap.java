package week4.DataStructures.Nonlinear.Graphs.Algos;

import java.util.*;

public class DijkstraPQMinHeap {
    public static List<Integer> dijkstra(int V, List<List<Pair>> adj, int S) {
        //Sorting the pq code according to the miniimum distance
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        //Initially the distance array has all large value(unreachable
        List<Integer> distTo = new ArrayList<>(
                Collections.nCopies(V, Integer.MAX_VALUE));
        //distance to hte source node is 0
        distTo.set(S, 0);
        pq.offer(new Pair(S, 0));
        //If we get a better distance- we take it, this is known as Relaxation.
        while (!pq.isEmpty()) {
            Pair curr = pq.poll(); //{dist, node}
            int node = curr.node;
            int dist = curr.distance;
            for (Pair neighbour : adj.get(node)) {
                int v = neighbour.node;
                int w = neighbour.distance;
                if (dist + w < distTo.get(v)) {
                    distTo.set(v, dist + w); //Relaxation of edges
                    pq.offer(new Pair(v, dist + w));
                }
            }
        }
        return distTo;
    }

    static class Pair {
        int node, distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int V = 6, S = 0;
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>()); //ading empty arrays for storage.
        }
        //Undirected weighte graph
        adj.get(0).add(new DijkstraPQMinHeap.Pair(1, 4));
        adj.get(0).add(new DijkstraPQMinHeap.Pair(2, 4));
        adj.get(1).add(new DijkstraPQMinHeap.Pair(0, 4));
        adj.get(1).add(new DijkstraPQMinHeap.Pair(2, 2));
        adj.get(2).add(new DijkstraPQMinHeap.Pair(0, 4));
        adj.get(2).add(new DijkstraPQMinHeap.Pair(1, 2));
        adj.get(2).add(new DijkstraPQMinHeap.Pair(3, 3));
        adj.get(2).add(new DijkstraPQMinHeap.Pair(4, 1));
        adj.get(2).add(new DijkstraPQMinHeap.Pair(5, 6));
        adj.get(3).add(new DijkstraPQMinHeap.Pair(2, 3));
        adj.get(3).add(new DijkstraPQMinHeap.Pair(5, 2));
        adj.get(4).add(new DijkstraPQMinHeap.Pair(2, 1));
        adj.get(4).add(new DijkstraPQMinHeap.Pair(5, 3));
        adj.get(5).add(new DijkstraPQMinHeap.Pair(2, 6));
        adj.get(5).add(new DijkstraPQMinHeap.Pair(3, 2));
        adj.get(5).add(new DijkstraPQMinHeap.Pair(4, 3));
        System.out.println(dijkstra(V, adj, S));
    }
}