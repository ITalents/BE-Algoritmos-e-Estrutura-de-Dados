import java.util.*;

public class ex9_uni3 {
    static class Grafo {
        private Map<Integer, Map<Integer, Integer>> adjacencias; // Mapa de Mapas: Integer -> Integer (vértice vizinho) -> Integer (peso)

        public Grafo() {
            adjacencias = new HashMap<>();
        }

        public void adicionarVertice(int vertice) {
            adjacencias.put(vertice, new HashMap<>());
        }

        public void adicionarAresta(int origem, int destino, int peso) {
            adjacencias.get(origem).put(destino, peso);
            adjacencias.get(destino).put(origem, peso); // Para um grafo não direcionado
        }

        public List<Integer> buscaCaminhoMaisCurto(int origem, int destino) {
            Map<Integer, Integer> distancia = new HashMap<>();
            Map<Integer, Integer> predecessores = new HashMap<>();
            PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(distancia::get));

            for (int vertice : adjacencias.keySet()) {
                distancia.put(vertice, Integer.MAX_VALUE);
                predecessores.put(vertice, -1); // Define -1 para indicar nenhum predecessor
            }

            distancia.put(origem, 0);
            filaPrioridade.add(origem);

            while (!filaPrioridade.isEmpty()) {
                int atual = filaPrioridade.poll();

                for (int vizinho : adjacencias.get(atual).keySet()) {
                    int novaDistancia = distancia.get(atual) + adjacencias.get(atual).get(vizinho);
                    if (novaDistancia < distancia.get(vizinho)) {
                        distancia.put(vizinho, novaDistancia);
                        predecessores.put(vizinho, atual);
                        filaPrioridade.add(vizinho);
                    }
                }
            }

            if (distancia.get(destino) == Integer.MAX_VALUE) {
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

        grafo.adicionarAresta(1, 2, 4);
        grafo.adicionarAresta(1, 3, 2);
        grafo.adicionarAresta(2, 4, 5);
        grafo.adicionarAresta(2, 5, 3);
        grafo.adicionarAresta(3, 6, 7);
        grafo.adicionarAresta(3, 7, 4);

        int origem = 1;
        int destino = 6;

        List<Integer> caminhoMaisCurto = grafo.buscaCaminhoMaisCurto(origem, destino);

        if (caminhoMaisCurto.isEmpty()) {
            System.out.println("Não há caminho entre os vértices " + origem + " e " + destino);
        } else {
            System.out.println("Caminho mais curto entre " + origem + " e " + destino + ": " + caminhoMaisCurto);
        }
    }
}
