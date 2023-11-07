import java.util.*;

public class ex7_uni3 {
    static class Grafo {
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

    public void buscaEmProfundidade(int vertice) {
        Set<Integer> visitados = new HashSet<>();
        dfs(vertice, visitados);
    }

    private void dfs(int vertice, Set<Integer> visitados) {
        visitados.add(vertice);
        System.out.print(vertice + " ");

        for (int vizinho : adjacencias.get(vertice)) {
            if (!visitados.contains(vizinho)) {
                dfs(vizinho, visitados);
            }
        }
    }
}
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        for (int i = 1; i <= 7; i++) {
            grafo.adicionarVertice(i);
        }

        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 4);
        grafo.adicionarAresta(2, 5);
        grafo.adicionarAresta(3, 6);
        grafo.adicionarAresta(3, 7);

        System.out.println("Vértices visitados em Busca em Profundidade (DFS):");
        grafo.buscaEmProfundidade(1);
    }
}
