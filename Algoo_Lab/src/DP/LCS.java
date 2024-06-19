package DP;
import java.util.*;
public class LCS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
  
        char[] x=s1.toCharArray();
        char[] y=s2.toCharArray();
        
        int L1=x.length;
        int L2=y.length;
        System.out.print("String1 = "+s1+" String2 = "+s2+" LCS is = ");
        lcs(x,y,L1,L2);
    }
    public static void lcs(char[] x,char[] y,int m,int n) {
        int[][] table=new int[m+1][n+1];
        char[] lc=new char[m+1];
        
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==0 || j==0)
                    table[i][j]=0;
                else if(x[i-1]==y[j-1]){
                    table[i][j]=table[i-1][j-1]+1;
                    lc[i-1]=x[i-1];
                }
                else
                    table[i][j]=Integer.max(table[i-1][j],table[i][j-1]);
            }
        }
        for (int i = 0; i <= m; i++) {
            if(lc[i]!=0){
                System.out.print(lc[i]);
            }
        }
        System.out.println(" And the Length of LCS is = "+table[m][n]);
    }
}
