package Sorting;
import java.util.*;
public class Bucket {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        float[] array=new float[n];
        for (int i = 0; i < n; i++) {
            array[i]=s.nextFloat();
        }
        bucket(array,n);
        for (int i = 0; i < n; i++) {
           System.out.print(array[i]+" ");
        }
    }
    public static void bucket(float[] array,int n) {
//        if(n<=0)
//            return;
        ArrayList<Float>[] bckt=new ArrayList[n];
        for (int i = 0; i < n; i++) {
            bckt[i]=new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int index=(int)(array[i]*n);
            bckt[index].add(array[i]);
        }
        for (int i = 0; i < n; i++) {
            bckt[i].sort(null);
        }
        int k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bckt[i].size(); j++) {
                array[k]=bckt[i].get(j);
                k++;
            }
        }
    }
}
