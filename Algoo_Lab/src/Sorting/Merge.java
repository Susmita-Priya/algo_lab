package Sorting;
import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n= s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        divided(a,0,n-1);
        print(a,n);
    }
    public static void divided(int array[],int first,int last){
        if(first<last){
        int mid=(first+last)/2;
        divided(array,first,mid);
        divided(array,mid+1,last);
        
        merge(array,first,mid,last);
        }
    }
    
    public static void merge(int array[],int first,int mid,int last)
    {
        int f_n=mid-first+1;
        int l_n=last-mid;
       
        int[] left=new int[f_n];
        int[] right=new int[l_n];
        
        for (int i = 0; i < f_n; i++) {
            left[i]=array[i+first];
        }
        for (int i = 0; i < l_n; i++) {
            right[i]=array[i+mid+1];
        }
        
        int i=0,j=0;
        int k=first;
        
        while(i<f_n && j<l_n){
            if(left[i]<right[j])
            {
                array[k]=left[i];
                i++;
            }
            else{
                array[k]=right[j];
                j++;
            }
            k++;
        }
        
        while(i<f_n){
            array[k]=left[i];
            i++;
            k++;
        }
        while(j<l_n){
            array[k]=right[j];
            j++;
            k++;
        }
    }
    public static void print(int array[],int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if(i!=n)
                System.out.print(",");
        }
        
    }
}
