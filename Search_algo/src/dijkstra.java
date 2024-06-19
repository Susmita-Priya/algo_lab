 import java.util.*;  
import java.io.*; 

public class dijkstra {
     
    static final int Vertices = 6; 
    int minDistance(int dis[], Boolean visited[])   { 
        int min = Integer.MAX_VALUE, min_index = -1; 
        for (int v = 0; v < Vertices; v++) 
            if (visited[v] == false && dis[v] <= min) { 
                min = dis[v]; 
                min_index = v; 
            } 
        return min_index; 
    } 
    void printMinpath(int dis[])   { 
        System.out.println("Vertex \t Minimum Distance from Source"); 
        for (int i = 0; i < Vertices; i++) 
            System.out.println(i + " \t\t\t " + dis[i]); 
    }
    void algo_dijkstra(int graph[][], int src)  {  
        int dis[] = new int[Vertices]; 
        Boolean visited[] = new Boolean[Vertices]; 
  
        for (int i = 0; i < Vertices; i++) { 
            dis[i] = Integer.MAX_VALUE; 
            visited[i] = false; 
        } 
        dis[src] = 0; 
        for (int count = 0; count < Vertices ; count++) { 
            int u = minDistance(dis, visited); 
            visited[u] = true; 
            for (int v = 0; v < Vertices; v++)    
                
              if (!visited[v] && graph[u][v] != 0 && dis[u] != Integer.MAX_VALUE  && dis[u] + graph[u][v] < dis[v])
                      dis[v] = dis[u] + graph[u][v]; 
        } 
       
        printMinpath(dis); 
    } 
}
class Main{
    public static void main(String[] args) 
    { 
        int graph[][] = new int[][] { { 0, 4, 2, 0, 0, 0}, 
                                      { 4, 0, 1, 5, 0, 0}, 
                                      { 2, 1, 0, 8, 10, 0}, 
                                      { 0, 5, 8, 0, 2, 6}, 
                                      { 0, 0, 10, 2, 0, 5}, 
                                      { 0, 0, 0, 6, 5, 0} }; 
        dijkstra g = new dijkstra(); 
        g.algo_dijkstra(graph, 0); 
    } 
}

