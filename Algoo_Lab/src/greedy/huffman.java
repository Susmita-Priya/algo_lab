package greedy;
import java.util.*;

public class huffman {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=6;
        char[] ch={'a','b','c','d','e','f'};
        int[] freq={5,9,12,13,16,45};
        PriorityQueue<Node> q=new PriorityQueue<>(n,new mycom());           
        for (int i = 0; i < n; i++) { 
             Node node=new Node();
             node.freq=freq[i];
             node.c=ch[i];
             node.left=null;
             node.right=null;
             q.add(node);
        }
        Node root=null;
        while(q.size()>1){
            Node x=q.poll();
            Node y=q.poll();
            Node r=new Node();
            r.freq=x.freq+y.freq;
            r.left=x;
            r.right=y;
            r.c='-';
            root=r;
            q.add(r);
        }
        print(root,"");
    }
    public static void print(Node r,String s) {
        if(r.left==null&&r.right==null&&Character.isLetter(r.c)){
            System.out.println(r.c +" : "+s);
            return;
        }
        print(r.left,s+"0");
        print(r.right,s+"1");
    }
}
class Node{
    int freq;
    char c;
    Node left;
    Node right;
}
class mycom implements Comparator<Node>{
    public int compare(Node x,Node y){
        return x.freq-y.freq;
    }
}