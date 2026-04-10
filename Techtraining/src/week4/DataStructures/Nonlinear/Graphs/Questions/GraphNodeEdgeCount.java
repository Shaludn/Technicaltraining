package week4.DataStructures.Nonlinear.Graphs.Questions;
import java.util.*;
public class GraphNodeEdgeCount {
    static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges(List<List<Integer>> adjList){
        int edges=0;
        for(List<Integer> neighbor: adjList){
            edges+=neighbor.size();
        }
        return edges/2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList=new ArrayList<>();
        //Manually adding the adjacency list representation
        adjList.add(Arrays.asList(1,2));
        adjList.add(Arrays.asList(0,2, 3));
        adjList.add(Arrays.asList(0,1,4));
        adjList.add(Arrays.asList(1,4));
        adjList.add(Arrays.asList(2,3));

        int nodes=countNodes(adjList);
        System.out.println("No of nodes: "+ nodes);
        int edge=countEdges(adjList);
        System.out.println("No of edges is :"+ edge);
    }
}
