import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploPilha {
    public static void main(String[] args){

        //LIFO, do inglês "Last In, First Out"
        Deque<Integer> pilha = new ArrayDeque<>();

        //push para adicionar itens novos na pilha
        pilha.push(10);
        pilha.push(15);
        pilha.push(20);
        pilha.push(30);
        pilha.push(56);

        System.out.println(pilha);

        //visualizar o primeiro item da pilha remover
        System.out.println(pilha.peek());

        //retorna o primeiro item da pilha e remove ele da pilha
        System.out.println(pilha.pop());
        System.out.println(pilha);

        //desempilhando toda a pilha item a item
        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
