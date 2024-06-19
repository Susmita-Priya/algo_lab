package graph;
import java.util.*;
public class BellmanFord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        int[][] graph=new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j]=s.nextInt();
            }
        }
        bellman(graph,V,0);
    }
    public static void bellman(int[][] graph,int V,int src) {
        int[] dis=new int[V];
        int c=0;
        for (int i = 0; i < V; i++) {
         dis[i]=Integer.MAX_VALUE;   
        }
        dis[src]=0;
        for (int i = 0; i < V; i++) {
            for (int u = 0; u < V; u++) {
                for (int v = 0; v < V; v++) {
                    if(graph[u][v]!=0&&(dis[v]>dis[u]+graph[u][v])){
                        dis[v]=dis[u]+graph[u][v];
                    }
                }
            }
        }
        for (int u = 0; u < V; u++) {
            for (int v = 0; v < V; v++) {
                if(graph[u][v]!=0&&(dis[v]>dis[u]+graph[u][v])){
                     c=-1;
                     System.out.println("Negative cycle");
                     break;
                }
            }
        }
        print(dis,V,c);
    }
    public static void print(int[] dis,int V,int c) {
        if(c!=-1)
            for (int i = 0; i < V; i++) {
            {
                System.out.println(dis[i]);
            }
        }
    }
}
