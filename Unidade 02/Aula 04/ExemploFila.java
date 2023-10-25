import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args){
        //FIFO, do ingles "First In, First Out"
        Queue<String> fila = new LinkedList<>();

        //adicionar itens a fila
        fila.offer("1 fila");
        fila.offer("2 fila");
        fila.offer("3 fila");

        //exibir a primeira posicao da fila
        System.out.println(fila.peek());

        //remover o primeiro item da fila e exibir o item
        System.out.println(fila.poll());

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
        
    }
}
