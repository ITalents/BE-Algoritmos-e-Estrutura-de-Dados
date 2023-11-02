import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DFS {
    //mapa de adjacencias
    private Map<String, List<Aresta>> adjancencias;

    public DFS(){
        adjancencias = new HashMap<>();
    }

    //metodo de busca por profundidade
    public Map<String, Boolean> buscaPorProfundidade(String verticeInicial){
        //define os nós visitados
        Map<String, Boolean> visitados = new HashMap<>();

        //adiciona todos os vertices(nós) a lista de visitados como false
        for (String vertice : adjancencias.keySet()) {
            visitados.put(vertice, false);
        }

        //chama o metodo recursivo
        dfs(verticeInicial, visitados);

        return visitados;
    }

    //metodo de busca por profundidade recursivo
    public void dfs(String vertice, Map<String,Boolean> visitados){
        //pega o primeiro da fila e exibe
        visitados.put(vertice, true);
        System.out.print(vertice + " ");

        //lista os vizinhos do vertice atual
        List<Aresta> vizinhos = adjancencias.get(vertice);
       
        //testa cada um dos vizinhos
        for (Aresta aresta : vizinhos) {
            if (!visitados.get(aresta.getDestino())) {
                //chama o proprio metodo novamente
                dfs(aresta.getDestino(), visitados);
            }
        }
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
        DFS grafo = new DFS();

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

        grafo.buscaPorProfundidade("Brasil");
    }
}

