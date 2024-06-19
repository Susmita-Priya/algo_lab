package Divided_Conquere;
import java.util.*;
public class Counting_inversion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=s.nextInt();
        }
        System.out.println(divided(array,0,n-1));
        
    }
    public static int divided(int[] array,int first,int last) {
        int count=0;
        if(first<last){
            int mid=(first+last)/2;
            count=count+divided(array,first,mid);
            count=count+divided(array,mid+1,last);
            
            count=count+conquer(array,first,mid,last);
        }
        return count;
    }
    public static int conquer(int[] array,int first,int mid,int last) {
        int[] left=Arrays.copyOfRange(array, first, mid+1);
        int[] right=Arrays.copyOfRange(array, mid+1, last+1);
        int i=0,j=0,k=first,swap=0;
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                array[k]=left[i];
                i++;
                k++;
            }
            else{
                array[k]=right[j];
                j++;
                k++;
                swap=swap+(mid+1)-(first+i);
            }
        }
        while(i<left.length){
            array[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            array[k]=right[j];
            j++;
            k++;
        }
        return swap;
    }
}
