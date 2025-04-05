// implementation of Depth-First Search of Graphs using JAVA 12
import java.util.*;

public class Main{
    //Method to perform DFS traversal
    public static void dfs(int v, boolean[] visited ,List<List<Integer>>adjList){
        //Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+"");

        //Recur for all adjacent vertices
        for(int neighbor : adjList.get(v)){
            if(!visited[neighbor]){
                dfs(neighbor, visited, adjList);
            }
        }
    }
    public static void main(String[]args){
        //Number of vertices
        int vertices = 6;

        // Hardcoded adjacency list representing the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i<vertices; i++){
            adjList.add(new ArrayList<>());
        }
        //Add edges (for undirected graph)
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(0);
        adjList.get(1).add(3);
        adjList.get(1).add(4);
        adjList.get(2).add(0);
        adjList.get(2).add(5);
        adjList.get(3).add(1);
        adjList.get(4).add(1);
        adjList.get(5).add(2);

        //Array to keeo track of visited vertices
        boolean[] visited = new boolean[vertices];

        //Hardcoded starting vertex for DFS
        int startVertex = 0;
        System.out.println("Depth-first Search starting from vertex"+startVertex+":");
        //Perform DFS
        dfs(startVertex,visited, adjList);
    }
}