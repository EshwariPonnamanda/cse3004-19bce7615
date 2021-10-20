
import java.util.Arrays;

class PrimAlgo {

  public void Prim(int G[][], int V) {

    int INF = 9999999;

    int no_edge; 

    
    boolean[] selected = new boolean[V];

    Arrays.fill(selected, false);

    no_edge = 0;

    // the number of edge in minimum spanning tree will be
    // always less than (V -1), where V is number of vertices in
    // graph

    // choose 0th vertex and make it true
    selected[0] = true;

    // print for edge and weight
    System.out.println("Edge  : Weight");

    while (no_edge < V - 1) {

      int min = INF;
      int x = 0; // row number
      int y = 0; // col number

      for (int i = 0; i < V; i++) {
        if (selected[i] == true) {
          for (int j = 0; j < V; j++) {
            // not in selected and there is an edge
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
	  System.out.println("The Edge and Weight Are ");
    PrimAlgo g = new PrimAlgo();

    // number of vertices in graph
    int V = 5;

    // create a 2d array of size 5x5
    // for adjacency matrix to represent graph
    int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
        { 12, 24, 32, 42, 60 } };

    g.Prim(G, V);
  }
}

