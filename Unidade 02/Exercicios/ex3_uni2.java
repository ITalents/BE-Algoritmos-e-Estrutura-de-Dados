import java.util.ArrayList;

public class ex3_uni2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);

        ArrayList<Integer> intercalada = intercalarListas(lista1, lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista intercalada: " + intercalada);
    }

    public static ArrayList<Integer> intercalarListas(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> intercalada = new ArrayList<>();

        int tamanho1 = lista1.size();
        int tamanho2 = lista2.size();
        int tamanhoTotal = Math.max(tamanho1, tamanho2);

        for (int i = 0; i < tamanhoTotal; i++) {
            if (i < tamanho1) {
                intercalada.add(lista1.get(i));
            }
            if (i < tamanho2) {
                intercalada.add(lista2.get(i));
            }
        }

        return intercalada;
    }
}
