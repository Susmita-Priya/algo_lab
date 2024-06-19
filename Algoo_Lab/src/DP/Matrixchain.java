package DP;
import java.util.*;
public class Matrixchain {
    static int[][] key=new int[10000][10000];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] matrix=new int[n];
        
        for (int i = 0; i < n; i++) {
            matrix[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                key[i][j]=Integer.MAX_VALUE;
            }
        }
        System.out.println(chain(matrix,1,n-1));
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(key[i][j]!=Integer.MAX_VALUE)
                System.out.print(key[i][j]+" ");
                else
            System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
    public static int chain(int[] matrix,int i,int j) {
        if(i==j){
            key[i][j]=0;
        }
        for (int k = i; k < j; k++) {
            key[i][j]=Integer.min(key[i][j],chain(matrix,i,k)+chain(matrix,k+1,j)+matrix[i-1]*matrix[j]*matrix[k]);
        }
        return key[i][j];
    }
}
