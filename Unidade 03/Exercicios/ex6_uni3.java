import java.util.*;

public class ex6_uni3 {
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

    public List<Integer> buscaEmLargura(int origem, int destino) {
        Queue<Integer> fila = new LinkedList<>();
        Map<Integer, Integer> predecessores = new HashMap<>();
        List<Integer> visitados = new ArrayList<>();

        fila.add(origem);
        visitados.add(origem);
        predecessores.put(origem, -1);

        while (!fila.isEmpty()) {
            int atual = fila.poll();
            if (atual == destino) {
                break;
            }

            for (int vizinho : adjacencias.get(atual)) {
                if (!visitados.contains(vizinho)) {
                    fila.add(vizinho);
                    visitados.add(vizinho);
                    predecessores.put(vizinho, atual);
                }
            }
        }

        if (!visitados.contains(destino)) {
            return new ArrayList<>();
        }

        List<Integer> caminho = new ArrayList<>();
        int noAtual = destino;
        while (noAtual != -1) {
            caminho.add(noAtual);
            noAtual = predecessores.get(noAtual);
        }

        Collections.reverse(caminho);
        return caminho;
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

        int origem = 1;
        int destino = 6;

        List<Integer> caminhoMaisCurto = grafo.buscaEmLargura(origem, destino);

        if (caminhoMaisCurto.isEmpty()) {
            System.out.println("Não há caminho entre os vértices " + origem + " e " + destino);
        } else {
            System.out.println("Caminho mais curto entre " + origem + " e " + destino + ": " + caminhoMaisCurto);
        }
    }
}
