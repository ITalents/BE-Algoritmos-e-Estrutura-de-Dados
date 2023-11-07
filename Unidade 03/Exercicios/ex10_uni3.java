import java.util.*;

public class ex10_uni3 {
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
        }

        public List<Integer> ordenacaoTopologica() {
            Map<Integer, Integer> grauEntrada = new HashMap<>();
            for (int vertice : adjacencias.keySet()) {
                grauEntrada.put(vertice, 0);
            }

            for (List<Integer> vizinhos : adjacencias.values()) {
                for (int vizinho : vizinhos) {
                    grauEntrada.put(vizinho, grauEntrada.get(vizinho) + 1);
                }
            }

            Queue<Integer> fila = new LinkedList<>();
            for (int vertice : adjacencias.keySet()) {
                if (grauEntrada.get(vertice) == 0) {
                    fila.add(vertice);
                }
            }

            List<Integer> resultado = new ArrayList<>();
            while (!fila.isEmpty()) {
                int vertice = fila.poll();
                resultado.add(vertice);

                for (int vizinho : adjacencias.get(vertice)) {
                    grauEntrada.put(vizinho, grauEntrada.get(vizinho) - 1);
                    if (grauEntrada.get(vizinho) == 0) {
                        fila.add(vizinho);
                    }
                }
            }

            if (resultado.size() != adjacencias.size()) {
                // Se houverem ciclos no grafo, não é possível realizar a ordenação topológica.
                return new ArrayList<>();
            }

            return resultado;
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        for (int i = 1; i <= 6; i++) {
            grafo.adicionarVertice(i);
        }

        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 4);
        grafo.adicionarAresta(2, 5);
        grafo.adicionarAresta(3, 5);
        grafo.adicionarAresta(4, 6);
        grafo.adicionarAresta(5, 6);

        List<Integer> ordenacaoTopologica = grafo.ordenacaoTopologica();

        if (ordenacaoTopologica.isEmpty()) {
            System.out.println("O grafo possui ciclo. Não é possível realizar a ordenação topológica.");
        } else {
            System.out.println("Ordenação topológica dos vértices: " + ordenacaoTopologica);
        }
    }
}
