package DP;
import java.util.*;
public class LIS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int L=s.nextInt();
        int[] array=new int[L+1];
        int[] Len=new int[L+1];
        array[0]=0;
        Len[0]=0;
        for (int i = 1; i <= L; i++) {
            array[i]=s.nextInt();  
        }
        lis(array,Len,L);
        seq(array,Len,L,Integer.MIN_VALUE);
     }
public static void lis(int[] array,int[] len,int L) {
    for (int i = 1; i <= L; i++) {
        for (int j = 0; j < i; j++) {
            if(array[i]>array[j]&& len[j]+1>len[i]){
                len[i]=len[j]+1;
            }
        }
    }
    for (int i = 0; i <= L; i++) {
        System.out.print(len[i]+" ");
    }
    System.out.println("");
 }
    public static void seq(int[] array,int[] len,int L,int max) {
        int n=0,mx=Integer.MIN_VALUE;
        for (int i = 0; i <= L; i++) {
            if(len[i]>max)
            {
                max=len[i];
                n=i;
            }
        }
        System.out.println("Lenght of subsequence is = "+max);
        for (int i =L; i >0; i--) {
           if(len[i]== max){
               System.out.print(array[i]+", "); 
               max=max-1;
           } 
        }
    }
}