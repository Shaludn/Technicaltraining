package week4.DataStructures.Nonlinear.Graphs.Traversal;

import java.util.*;

class GraphDFS{
    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> ans){
        visited[node]=true;
        ans.add(node);
        //Traverse the neighbors if not visited and do a dfs call
        for(int neighbour: adjList.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, adjList, visited, ans);
            }
        }
    }
    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList){
        boolean[] visited=new boolean[V+1]; //For both 0 and 1.
        List<Integer> ans=new ArrayList<>();
        int start=1; //Only our example.
        dfs(start, adjList, visited, ans);
        return ans;
    }
}
public class DFSGraph {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 2, 5);
        addEdge(adjList, 4, 5);

        GraphDFS g=new GraphDFS();
        List<Integer> ans=g.dfsGraph(V, adjList);
        printDFS(ans);

    }
    public  static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    //method to prit the BFS result
    public static void printDFS(List<Integer> ans){
        for(int num: ans){
            System.out.print(num +  " ");
        }
        System.out.println();
    }
}
