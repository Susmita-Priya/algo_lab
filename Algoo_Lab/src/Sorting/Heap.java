package Sorting;
import java.util.*;
public class Heap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] array=new int[n+1];
        for (int i = 0; i < n; i++) {
            array[i]=s.nextInt();
        }
        heapsort(array,n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void heapsort(int[] array,int n) {
        int e=(n/2)-1;
        for (int i = e; i >= 0; i--) {
            heapfy(array,n,i);
        }
        for (int i = n-1; i > 0; i--) {
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            heapfy(array,i,0);
        }
    }
    public static void heapfy(int[] array,int n,int i) {
        int largest=i;
        int L=2*i+1;
        int r=2*i+2;
        if(L<n&&array[L]>array[largest]){
            largest=L;
        }
        if(r<n&&array[r]>array[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=array[i];
            array[i]=array[largest];
            array[largest]=temp;
            heapfy(array,n,largest);
        }
    }
}
