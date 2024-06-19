package Divided_Conquere;
import java.util.*;
public class max_subarray {
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
        int max=0;
        if(first<last){
            int mid=(first+last)/2;
         max=Integer.max(Integer.max(divided(array,first,mid),divided(array,mid+1,last)),conquer(array,first,mid,last));
        }
        return max;
    }
    public static int conquer(int[] array,int first,int mid,int last) {
        int left_sum=Integer.MIN_VALUE,sum1=0;
        int right_sum=Integer.MIN_VALUE,sum2=0;
        for (int i = mid; i >= first; i--) {
            sum1=sum1+array[i];
            left_sum=Integer.max(left_sum, sum1);
        }
        for (int i = mid+1; i <= last; i++) {
            sum2=sum2+array[i];
            right_sum=Integer.max(right_sum, sum2);
        }
        return Integer.max(Integer.max(left_sum, right_sum),(left_sum+right_sum));
    }
}
