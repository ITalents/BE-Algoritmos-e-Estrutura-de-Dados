public class ex4_uni3 {
    public static void main(String[] args) {
        int[] arrayOrdenado = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int numeroProcurado = 12;

        int posicao = buscaBinaria(arrayOrdenado, numeroProcurado);

        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado no array.");
        }
    }

    public static int buscaBinaria(int[] array, int numeroProcurado) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == numeroProcurado) {
                return meio; // Retorna a posição se o número for encontrado
            } else if (array[meio] < numeroProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // Retorna -1 se o número não for encontrado
    }
}
