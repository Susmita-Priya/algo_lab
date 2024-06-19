package graph;
import java.util.*;
public class Warshall {
    static int max=9999;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        int[][] graph=new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j]=s.nextInt();
            }
        }
        warshal(graph,V);
    }
    public static void warshal(int[][] graph,int V) {
        int[][] matrix=new int[V][V];
        int[][] parent=new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                matrix[i][j]=graph[i][j];
            }
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if(i!=j&&matrix[i][j]==0){
                    matrix[i][j]=max;
                }
            }
        }
        
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if(matrix[i][j]!=max&&(matrix[i][k]+matrix[k][j])<matrix[i][j]){
                        matrix[i][j]=matrix[i][k]+matrix[k][j];
                        parent[i][j]=parent[k][j];
                    }
                }
            }
        }
        print(matrix,V);
    }
    public static void print(int[][] matrix,int V) {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if(matrix[i][j]==max){
                    System.out.print("Inf ");
                }
                else{
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println("");
        }
        
    }
}
