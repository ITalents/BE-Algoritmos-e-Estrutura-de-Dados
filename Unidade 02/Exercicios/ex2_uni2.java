import java.util.ArrayList;
import java.util.HashSet;

public class ex2_uni2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);

        System.out.println("Lista original: " + numeros);
        removerDuplicados(numeros);
        System.out.println("Lista sem elementos duplicados: " + numeros);
    }

    public static void removerDuplicados(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    lista.remove(j);
                    j--; // Decrementar para ajustar o índice após remover um elemento
                }
            }
        }
    }
}
