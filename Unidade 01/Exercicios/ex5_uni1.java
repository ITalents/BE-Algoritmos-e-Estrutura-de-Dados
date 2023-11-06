public class ex5_uni1 {
    public static void main(String[] args) {
        // Criando a matriz de números inteiros
        int[][] matriz = {
            {3, 8, 1},
            {5, 12, 9},
            {7, 21, 10}
        };

        int maiorValor = matriz[0][0]; // Assumindo que o primeiro elemento é o maior

        // Encontrando o maior valor na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Imprimindo o maior valor encontrado na matriz
        System.out.println("O maior valor na matriz é: " + maiorValor);
    }
}
