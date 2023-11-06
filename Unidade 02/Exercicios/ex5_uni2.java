import java.util.ArrayList;
import java.util.Stack;

public class ex5_uni2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista original: " + numeros);
        inverterArrayListComPilha(numeros);
        System.out.println("Lista invertida: " + numeros);
    }

    public static void inverterArrayListComPilha(ArrayList<Integer> lista) {
        Stack<Integer> pilha = new Stack<>();

        // Empilhando os elementos da lista na pilha
        for (Integer numero : lista) {
            pilha.push(numero);
        }

        // Desempilhando e atualizando a lista com os elementos da pilha (inverter a ordem)
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, pilha.pop());
        }
    }
}
