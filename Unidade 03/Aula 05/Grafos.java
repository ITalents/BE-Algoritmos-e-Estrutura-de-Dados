import java.util.LinkedList;

public class Grafos {
    private int Vertices;
    private LinkedList<Integer> adj[];

    Grafos(int v){
        Vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }
    public static void main(String args[]) {
        Grafos grafo = new Grafos(5);

        grafo.addEdge(0,1);
        grafo.addEdge(2,4);
        grafo.addEdge(0,3);
        grafo.addEdge(1,4);

        System.out.println(grafo.Vertices);
        System.out.println(grafo.adj[0]);
        System.out.println(grafo.adj[1]);
        System.out.println(grafo.adj[2]);
        System.out.println(grafo.adj[3]);
        System.out.println(grafo.adj[4]);
    }
}
