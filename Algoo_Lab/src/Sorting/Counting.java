package Sorting;
import java.util.*;
public class Counting {
    static int[] c=new int[1000];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),mx=Integer.MIN_VALUE;
        int[] a=new int[n];
        int[] b=new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
            mx=Integer.max(mx, a[i]);
        }
        
        count(a,b,n,mx);
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
    public static void count(int[] a,int[] b,int n,int mx) {
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }  
        for (int i = 1; i <= mx; i++) {
            c[i]=c[i]+c[i-1];
        }
        
        for (int i = n-1; i >= 0; i--) {
            b[c[a[i]]-1]=a[i];
            c[a[i]]--;
        }
    }
}
