package greedy;
import java.util.*;
public class activitySelection {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp1=0,temp2=0;
        int[] stime=new int[n];
        int[] ftime=new int[n];
        for (int i = 0; i < n; i++) {
            stime[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ftime[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(ftime[i]>ftime[j]){
                   temp1=ftime[j];
                   ftime[j]=ftime[i];
                   ftime[i]=temp1;
                   
                   temp2=stime[j];
                   stime[j]=stime[i];
                   stime[i]=temp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ftime[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(stime[i]+" ");
        }
        System.out.println("");
        selection(stime,ftime,n);
    }
    public static void selection(int[] stime,int[] ftime,int n) {
        int[] ac=new int[n];
        int ftm=ftime[n-1];
        ac[n-1]=stime[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(stime[i]>ftm){
                ac[i]=stime[i];
                ftm=ftime[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(ac[i]!=0)
            System.out.print(ac[i]+" ");
        }
    }
}
