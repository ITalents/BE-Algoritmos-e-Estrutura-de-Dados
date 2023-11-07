public class ex3_uni3 {
    public static void main(String[] args) {
        int[] array = {4, 8, 15, 16, 23, 42};
        int numeroProcurado = 15;

        int posicao = buscaLinear(array, numeroProcurado);

        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado no array.");
        }
    }

    public static int buscaLinear(int[] array, int numeroProcurado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroProcurado) {
                return i; // Retorna a posição se o número for encontrado
            }
        }
        return -1; // Retorna -1 se o número não for encontrado
    }
}
