package Sorting;
import java.util.*;
public class radix {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),mx=Integer.MIN_VALUE;
        int[] a=new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
            mx=Integer.max(mx, a[i]);
        }
        for (int i = 1; mx/i>0 ; i=i*10) {
            radix(a,n,i);
        } 
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void radix(int[] a,int n,int digit) {
        int[] b=new int[n];
        int[] c=new int[100];
        Arrays.fill(c, 0);
        for (int i = 0; i < n; i++) {
            c[(a[i]/digit)%10]++;
        }
        for (int i = 1; i <10; i++) {
            c[i]=c[i]+c[i-1];
        }
        
        for (int i = n-1; i >= 0; i--) {
            b[c[(a[i]/digit)%10]-1]=a[i];
            c[(a[i]/digit)%10]--;
        }
        for (int i = 0; i <n ; i++) {
            a[i]=b[i];
        }
    }
}
