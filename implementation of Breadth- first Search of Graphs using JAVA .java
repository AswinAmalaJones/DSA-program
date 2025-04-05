//implementation of Breadth- first Search of Graphs using JAVA 13
import java.util.*;
import java.util.Queue;
public class Main{
   public static void bfs(int startVertex, List<List<Integer>>adjList, int vertices){
    // Array to keep track of visited vertices
    boolean[] visited = new boolean[vertices];

    //Create a queue for BFS
    Queue <Integer> queue = new LinkedList<>();

    //Mark the starting vertex as visited and exqueue it 
    visited[startVertex]=true;
    queue.add(startVertex);

    //perform BFS
    while(!queue.isEmpty()){
        //Dequeue a vertex from the queue and print it
        int vertex = queue.poll();
        System.out.print(vertex + "");

        //Get all adjacent vertices of the dequeue vertex 
        //If an adjacent vertex has not been visited,mark it visited and emqueue it
        for(int neighbor : adjList.get(vertex)){
            if(!visited[neighbor]){
                visited[neighbor]=true;
                queue.add(neighbor);
            }
        }
    }
   }
   public static void main(String[]args){
    //Number of vertices
    int vertices = 6;

    //Hardcoded adjacency list representing the graph
    List<List<Integer>>adjList = new ArrayList<>();
    for(int i =0; i<vertices; i++){
       adjList.add(new ArrayList<>()); 
    }
    //Add edges (for undiected graph)
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

    //Hardcoded starting vertex for NFS
    int startVertex = 0;

    System.out.println("Breadth-First Search Starting from vertex"+startVertex+":");
    //perform BFS
    bfs(startVertex,adjList,vertices);
   }
}