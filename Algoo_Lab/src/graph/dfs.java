package graph;
import java.util.*;
public class dfs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int[][] graph=new int[v][v];
        int[] visited=new int[v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < v; i++) {
            visited[i]=0;
        }
        dfs(graph,visited,v,0);
    }
    public static void dfs(int[][] graph,int[] visited,int v,int src) {
        System.out.print((src+1)+" ,");
        visited[src]=1;
        for (int i = 0; i < v; i++) {
                if(visited[i]==0 && graph[src][i]!=0)
                {
                    dfs(graph,visited,v,i);
                }
        }
    }
}
