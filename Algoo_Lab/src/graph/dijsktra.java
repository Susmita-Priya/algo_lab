package graph;
import java.util.*;
public class dijsktra {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int[][] graph=new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j]=s.nextInt();
            }  
        }
        dijk(graph,v,0); 
    }
    public static void dijk(int[][] graph,int V,int src) {
        int[] dis=new int[V];   
        for (int i = 0; i < V; i++) {
            dis[i]=Integer.MAX_VALUE;
        }
        dis[src]=0;
        for (int i = 0; i < V; i++) {
            for (int u = 0; u < V; u++) {
                for (int v = 0; v < V; v++) {
                    if( graph[u][v]!=0 && (dis[v]>dis[u]+graph[u][v]))
                    {
                        dis[v]=dis[u]+graph[u][v];
                    }
                }
            }
        }
        print(graph,dis,V);
    }
    public static void print(int[][] graph,int[] dis,int v) {
        System.out.println("vertex    Min distance from source");
        for (int i = 0; i <v ; i++) {
            System.out.print(i+"   ");
            System.out.println(dis[i]); 
        }
    }
}
