import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grafo2 {
    //mapa de adjacencias
    private Map<String, List<Aresta>> adjancencias;

    public Grafo2(){
        adjancencias = new HashMap<>();
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
        Grafo2 grafo = new Grafo2();

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

        System.out.println(grafo.adjancencias);
        System.out.println(grafo.adjancencias.get("Brasil"));
        
        System.out.println(grafo.adjancencias.get("Brasil").get(0).getDestino());
        System.out.println(grafo.adjancencias.get("Brasil").get(0).getPeso());

        System.out.println(grafo.adjancencias.get("Brasil").get(1).getDestino());
        System.out.println(grafo.adjancencias.get("Brasil").get(1).getPeso());

        grafo.imprimirGrafo();
    }
}
