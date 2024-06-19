package DP;
import java.util.*;
public class knapsack_1_0 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] weight=new int[n];
        int[] value=new int[n];
        int wt=s.nextInt();
        for (int i = 0; i < n; i++) {
            weight[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i]=s.nextInt();
        }
        knapsack(weight,value,n,wt);
    }
    public static void knapsack(int[] weight,int[] value,int n,int wt) {
        int[][] table=new int[n+1][wt+1];
        int[] item=new int[n+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= wt; j++) {
                if(i==0||j==0)
                    table[i][j]=0;
                else if(weight[i-1]<=j){
                    table[i][j]=Integer.max(value[i-1]+table[i-1][j-weight[i-1]],table[i-1][j]);
                }
                else
                    table[i][j]=table[i-1][j];
            }
        }
        
        for (int i = n; i > 0;) {
            for (int j = wt;j>0 ;) {
                if(table[i][j]!=table[i-1][j]){
                    item[i]=i;
                       j=j-weight[i-1];
                }
                else{
                    j=j;
                }  
                i=i-1;
            }
        }
        for (int i = 0; i <=n; i++) {
            if(item[i]!=0)
            System.out.print(item[i]+", ");
        }
        System.out.println("");
        System.out.println(table[n][wt]);
    }
}
