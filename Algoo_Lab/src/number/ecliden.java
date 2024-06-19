package number;
import java.util.*;
public class ecliden {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int q=0,r=0,x1=1,x2=0,x=0,t1=0,t2=1,t=0,ta,tb;
        ta=a;
        tb=b;
        while(b!=0){
            q=a/b;
            r=a%b;
            a=b;
            b=r;
            x=x1-q*x2;
            x1=x2;
            x2=x;
            t=t1-q*t2;
            t1=t2;
            t2=t;
        }
        System.out.println("Gcd = "+a);
        System.out.println("Here xa+yb format = ("+x1+"*"+ta+")+("+t1+"*"+tb+") = "+(x1*ta+t1*tb));
    }
}
