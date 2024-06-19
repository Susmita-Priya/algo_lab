package spanning_tree;
import java.util.*;
public class kruskal {
    static int min=Integer.MAX_VALUE,x=0,y=0;
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
        visited[src]=1;
        kruskal(graph,visited,v);
    }
    public static void kruskal(int[][] graph,int[] visited,int v) {
        int[][] m=new int[v][v];
        for (int k = 0; k < v-1; k++) {
            for (int i = 0; i < v; i++) {
                if(visited[i]!=0)
                for (int j = 0; j < v; j++) {
                    if(visited[j]==0 && graph[i][j]!=0 && min> graph[i][j]){
                        min=graph[i][j];
                        x=i;
                        y=j;
                        
                    }
                }
            }
            System.out.println((x+1)+"-"+(y+1)+" : "+min);
            visited[y]=1;
           // m[x][y]=min;
            min=Integer.MAX_VALUE;x=0;y=0;
        }
       
    }
}
