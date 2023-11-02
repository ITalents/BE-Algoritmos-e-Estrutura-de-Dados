import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class BFS {
    //mapa de adjacencias
    private Map<String, List<Aresta>> adjancencias;

    public BFS(){
        adjancencias = new HashMap<>();
    }

    //metodo de busca por largura
    public Map<String,Boolean> buscaPorLargura(String verticeInicial){
        //define os nós visitados e a fila
        Map<String, Boolean> visitados = new HashMap<>();
        Queue<String> fila = new LinkedList<>();

        //adiciona todos os vertices(nós) a lista de visitados como false
        for (String vertice : adjancencias.keySet()) {
            visitados.put(vertice, false);
        }

        //add o vertice inicial a fila e a visitados como true
        fila.add(verticeInicial);
        visitados.put(verticeInicial, true);

        //verifica se a fila contem algo 
        while (!fila.isEmpty()) {
            //pega o primeiro da fila e exibe
            String verticeAtual = fila.poll();
            System.out.print(verticeAtual + " ");

            //lista os vizinhos do vertice atual
            List<Aresta> vizinhos = adjancencias.get(verticeAtual);

            //testa cada um dos vizinhos
            for (Aresta aresta : vizinhos) {
                if (!visitados.get(aresta.getDestino())) {
                    fila.add(aresta.getDestino());
                    visitados.put(aresta.getDestino(), true);
                }
            }

        }

        return visitados;
    }

    //adiciona um novo vertice
    public void adicionarVertice(String rotulo){
        adjancencias.put(rotulo, new ArrayList<>());
    }

    //adiciona uma nova aresta
    public void adicionarAresta(String origem, String destino, int peso){
        if (!adjancencias.containsKey(origem)) {
            adicionarVertice(origem);
        }
        if (!adjancencias.containsKey(destino)) {
            adicionarVertice(destino);
        }
        adjancencias.get(origem).add(new Aresta(destino, peso));
    }

    //imprime o grafo completo
    public void imprimirGrafo(){
        for (String vertice :adjancencias.keySet()) {
            List<Aresta> arestas = adjancencias.get(vertice);
            System.out.print(vertice + " -> ");
            for (Aresta aresta : arestas) {
                System.out.print(aresta.getDestino() + "(" + aresta.getPeso() + ") ");
            }
            System.out.println();
        }
    }

    //classe que constroi a aresta
    private class Aresta {
        private String destino;
        private int peso;

        public Aresta(String destino, int peso){
            this.destino = destino;
            this.peso = peso;
        }

        public String getDestino(){
            return destino;
        }
        
        public int getPeso(){
            return peso;
        }
    }
    public static void main(String[] args) {
        BFS grafo = new BFS();

        //adicionando paises no grafo
        grafo.adicionarVertice("Brasil");
        grafo.adicionarVertice("México");
        grafo.adicionarVertice("Alemanha");
        grafo.adicionarVertice("Portugal");
        grafo.adicionarVertice("Inglaterra");

        //adicionando conexoes de paises
        grafo.adicionarAresta("Brasil", "Japão", 5);
        grafo.adicionarAresta("Alemanha", "Portugal", 3);
        grafo.adicionarAresta("Portugal", "Alemanha", 5);
        grafo.adicionarAresta("Brasil", "México", 7);
        grafo.adicionarAresta("Inglaterra", "México", 2);
        grafo.adicionarAresta("Brasil", "Inglaterra", 5);
        
        grafo.buscaPorLargura("Brasil");
    }
}
