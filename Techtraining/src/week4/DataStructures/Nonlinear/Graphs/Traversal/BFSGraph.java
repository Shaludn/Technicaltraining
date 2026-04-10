package week4.DataStructures.Nonlinear.Graphs.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList) {
        List<Integer> bfs = new ArrayList<>();//this is our answer.
        boolean visited[] = new boolean[V + 1]; //Works for 0 or 1.
        Queue<Integer> q = new LinkedList<>();
        //Start the BFS from node 1
        visited[1] = true;
        q.add(1);
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node); //we are storing the output one by one.
            //Who are your neighbours[Adjacency List]
            //Traverse all of its neighbours if not visited.
            for (int neighbour : adjList.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
 public class BFSGraph{
            public static void main(String[] args) {
                int V = 5;
                List<List<Integer>> adjList = new ArrayList<>();
                for (int i = 0; i <= V; i++) {
                    adjList.add(new ArrayList<>());
                }
                addEdge(adjList, 1, 2);
                addEdge(adjList, 1,3);
                addEdge(adjList, 2, 3);
                addEdge(adjList, 3, 4);
                addEdge(adjList, 4, 5);
                addEdge(adjList, 2, 5);

                GraphBFS g=new GraphBFS();
                List<Integer> ans=g.bfsGraph(V, adjList);
                printBFS(ans);

            }
                public  static void addEdge(List<List<Integer>> adjList, int u, int v){
                    adjList.get(u).add(v);
                    adjList.get(v).add(u);
            }
            //method to prit the BFS result
                public static void printBFS(List<Integer> ans){
                    for(int num: ans){
                        System.out.print(num +  " ");
                    }
                    System.out.println();
                }
 }


