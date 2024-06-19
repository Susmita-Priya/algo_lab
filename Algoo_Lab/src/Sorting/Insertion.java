package Sorting;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        int j;
        for (int i = 1; i < n; i++) {
            int key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if(i!=(n-1))
                System.out.print(",");
        }
        
    }
}

