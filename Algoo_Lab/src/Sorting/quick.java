package Sorting;

import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n= s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        quick(a,0,n-1);
        print(a,n);
    }
    public static void quick(int array[],int first,int last) {
        if(first<last){
            int pivot=piv(array,first,last);
            
            quick(array,first,pivot-1);
            quick(array,pivot+1,last);
        }
    }
    
    public static int piv(int array[],int first,int last) {
      int pivot=array[last];
      int i=(first-1),temp;
      
        for (int j = first; j < last; j++) {
            if(array[j]<=pivot)
            {
                i++;
                
               temp=array[i];
               array[i]=array[j];
               array[j]=temp;
            }
        }
        temp=array[i+1];
        array[i+1]=array[last];
        array[last]=temp;
        return (i+1);
                
    }
     public static void print(int array[],int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if(i!=n-1)
                System.out.print(",");
        }
        
    }
     
}
