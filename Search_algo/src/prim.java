/*
Name : Susmita Rani Saha
ID : B-180305047
 */
import java.util.Arrays;
public class prim {
  public void Prim(int G[][], int V) {
    int INF = 9999999;
    int no_edge; 
    boolean[] selected = new boolean[V];
    Arrays.fill(selected, false);
    no_edge = 0;
    selected[0] = true;
    System.out.println("Edge : Weight");
    
    while (no_edge < V ) {
      int min = INF;
      int x = 0; 
      int y = 0; 

      for (int i = 0; i < V; i++) {
        if (selected[i] == true) {
          for (int j = 0; j < V; j++) {
            if (!selected[j] && G[i][j] != 0) {
              if (min > G[i][j]) {
                min = G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
      System.out.println(x + " - " + y + " :  " + G[x][y]);
      selected[y] = true;
      no_edge++;
    }
  }
  
  public static void main(String[] args) {
    prim g = new prim();
    int V = 6;
    int[][] G = { { 0, 5, 4, 0, 0, 0 }, 
                  { 5, 0, 2, 0, 0, 0 },
                  { 4, 2, 0, 3, 2, 4 },
                  { 0, 0, 3, 0, 0, 3 },
                  { 0, 0, 2, 0, 0, 4 },
                  { 0, 0, 4, 3, 4, 0}};

    g.Prim(G, V);
  }
}

