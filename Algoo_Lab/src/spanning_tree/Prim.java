package spanning_tree;
import java.util.*;
public class Prim {
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
        prim(graph,visited,v,0);
    }
    public static void prim(int[][] graph,int[] visited,int v,int src) {
        for (int i = 0; i < v-1; i++) {
            for (int j = 0; j < v; j++) {
                if(visited[j]!=0)
                 for (int k = 0; k < v; k++) {
                    if(visited[k]==0 && graph[j][k]!=0 && min>graph[j][k]){
                        min=graph[j][k];
                        x=j;
                        y=k;
                    }
                 }
            }
            System.out.println(x+"-"+y+"  "+min);
            visited[y]=1;
            x=0;y=0;
            min=Integer.MAX_VALUE;
        }
    }
}
