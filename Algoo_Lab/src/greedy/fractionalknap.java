package greedy;
import java.util.*;
public class fractionalknap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int wt=s.nextInt();
        int temp1=0,temp2=0,temp3=0;
        int[] weight=new int[n];
        int[] value=new int[n];
        int[] unit=new int[n];
        for (int i = 0; i < n; i++) {
            weight[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            unit[i]=value[i]/weight[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(unit[i]>unit[j]){
                   temp1=unit[j];
                   unit[j]=unit[i];
                   unit[i]=temp1;
                   
                   temp2=value[j];
                   value[j]=value[i];
                   value[i]=temp2;
                   
                   temp3=weight[j];
                   weight[j]=weight[i];
                   weight[i]=temp3;
                }
            }
        }
        knap(weight,value,unit,wt,n);
    }
    public static void knap(int[] weight,int[] value,int[] unit,int wt,int n) {
        int profit=0;
        for (int i = 0; i < n ; i++) {
            if(wt>=0){
                if(wt-weight[i]>=0){
                    profit=profit+value[i];
                    wt=wt-weight[i];
                }
                else{
                    profit=profit+(wt*unit[i]);
                    wt=-1;
                }
            System.out.print(profit+" ");
            }  
        }
    }
}
