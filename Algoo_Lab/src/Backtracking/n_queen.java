package Backtracking;
import java.util.*;
public class n_queen {
    public static void main(String[] args) {
        int n=8;
        int[][] board={{0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0}};
        queen(board,0,n);
//        if(queen(board,0,n)==false){
//            System.out.println("Does exits");
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }    
    }
    public static boolean queen(int[][] board,int col,int n) {
        if(col>=n)
            return true;
        for (int i = 0; i < n; i++) {
            if(isSafe(board,i,col,n)){
                board[i][col]=1;
                if(queen(board,col+1,n)==true)
                     return true;
                 board[i][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board,int row,int col,int n) {
        for (int i = 0; i <col ; i++) {
            if(board[row][i]==1)
                return false;
        }
        for (int i = row,j=col; i >=0&& j>=0; i--,j--) {
            if(board[i][j]==1)
                return false;
        }
        for (int i = row,j=col; i <n&&j>=0; i++,j--) {
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
}
