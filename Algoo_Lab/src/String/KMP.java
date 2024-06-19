package String;
import java.util.*;
public class KMP {
    static int[] f=new int[1000];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String text=s.nextLine();
        String pattern=s.nextLine();
        char[] t=text.toCharArray();
        char[] p=pattern.toCharArray();
        int TL=t.length;
        int PL=p.length;
        failure(p,PL);
        System.out.println(kmp(t,p,f,TL,PL));
    }
    public static void failure(char[] p,int PL) {
        int i=1,j=0;       
        
        f[0]=0;
        while(i<PL){
            if(p[i]==p[j]){
                f[i]=j+1;
                i++;
                j++;
            }
            else if(j>0){
                j=f[j-1];
            }
            else{
                f[i]=0;
                i++;
            }
        }
    }
    public static int kmp(char[] t,char[] p,int[] f,int TL,int PL) {
        int i=0,j=0;
        while(i<TL){
            if(p[j]==t[i]){
                if(j==PL-1)
                    return i-j;
                else
                {
                    i++;
                    j++;
                }
            }
            else if(j>0)
                j=f[j-1];
            else
                i++;
            
        }
        return -1;
    }
}
