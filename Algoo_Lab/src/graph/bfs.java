package graph;
import java.util.*;
public class bfs {
    static Queue<Integer> q=new LinkedList<>();
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
        int src=0;
       
        q.add(src);
        visited[src]=1;
        System.out.println(src+",");
        bfs(graph,visited,v,src);
    }
    public static void bfs(int[][] graph,int[] visited,int v,int src) {
        for (int i = 0; i < v; i++) {
            if(visited[i]==0 && graph[src][i]!=0)
            {
                q.add(i);
                visited[i]=1;
                System.out.println(i+" ");
            }
        }
        int n=q.poll();
        while(q.size()!=0){
            bfs(graph,visited,v,n);
        }
        
    }
}
