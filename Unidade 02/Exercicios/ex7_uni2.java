import java.util.LinkedList;
import java.util.Queue;

public class ex7_uni2 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        // Simula a chegada de elementos à fila
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.println("Ordem de chegada dos elementos na fila: " + fila);

        // Simula a saída dos elementos da fila
        System.out.print("Ordem de saída dos elementos na fila: ");
        while (!fila.isEmpty()) {
            System.out.print(fila.poll() + " ");
        }
    }
}
