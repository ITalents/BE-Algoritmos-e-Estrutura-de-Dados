import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grafo {
    private Map<Integer, List<Integer>> adjacencias;

    public Grafo() {
        adjacencias = new HashMap<>();
    }

    public void adicionarVertice(int vertice) {
        adjacencias.put(vertice, new ArrayList<>());
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem); // Para um grafo não direcionado
    }

    public List<Integer> obterVizinhos(int vertice) {
        return adjacencias.get(vertice);
    }
}

public class ex5_uni3 {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.adicionarVertice(1);
        grafo.adicionarVertice(2);
        grafo.adicionarVertice(3);
        grafo.adicionarVertice(4);

        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);

        System.out.println("Vizinhos do vértice 1: " + grafo.obterVizinhos(1));
        System.out.println("Vizinhos do vértice 2: " + grafo.obterVizinhos(2));
        System.out.println("Vizinhos do vértice 3: " + grafo.obterVizinhos(3));
        System.out.println("Vizinhos do vértice 4: " + grafo.obterVizinhos(4));
    }
}
