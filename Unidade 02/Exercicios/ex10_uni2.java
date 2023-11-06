import java.util.ArrayList;
import java.util.Collections;

public class ex10_uni2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(5);
        numeros.add(9);
        numeros.add(20);
        numeros.add(3);
        numeros.add(15);

        System.out.println("Lista original: " + numeros);
        quickSortDecrescente(numeros, 0, numeros.size() - 1);
        System.out.println("Lista ordenada (decrescente) com Quick Sort: " + numeros);
    }

    public static void quickSortDecrescente(ArrayList<Integer> lista, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(lista, inicio, fim);
            quickSortDecrescente(lista, inicio, pivo - 1);
            quickSortDecrescente(lista, pivo + 1, fim);
        }
    }

    public static int particionar(ArrayList<Integer> lista, int inicio, int fim) {
        int pivo = lista.get(fim);
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (lista.get(j) >= pivo) {
                i++;
                Collections.swap(lista, i, j);
            }
        }

        Collections.swap(lista, i + 1, fim);
        return i + 1;
    }
}
