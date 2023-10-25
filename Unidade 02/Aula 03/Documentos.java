import java.util.ArrayDeque;
import java.util.Deque;

public class Documentos { 
    private String titulo;
    private int nPaginas;

    public Documentos(String titulo, int nPaginas){
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }
    
    public static void main(String[] args){
        Deque<Documentos> pilha = new ArrayDeque<>();

        Documentos doc = new Documentos("Processo 123", 100);
        Documentos doc2 = new Documentos("Processo 456", 240);
        Documentos doc3 = new Documentos("Processo 789", 675);
        Documentos doc4 = new Documentos("Processo 321", 45);
        Documentos doc5 = new Documentos("Processo 654", 72);

        pilha.push(doc);
        pilha.push(doc2);
        pilha.push(doc3);
        pilha.push(doc4);
        pilha.push(doc5);

        while(!pilha.isEmpty()){
            Documentos tempDocumentos = pilha.pop();
            System.out.println("Titulo:    " + tempDocumentos.titulo);
            System.out.println("N Paginas: " + tempDocumentos.nPaginas);
            System.out.println("");
        }
        
    }
}
