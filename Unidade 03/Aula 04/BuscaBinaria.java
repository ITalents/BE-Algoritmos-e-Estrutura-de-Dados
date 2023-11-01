public class BuscaBinaria {
    static int buscaBinaria(int[] array, int elemento){
        int inicio = 0;
        int fim = array.length -1;

        //enquanto o inicio nao superar o valor do fim continua
        while (inicio <= fim) {
            //acha o meio do array
            int meio = inicio + (fim - inicio) / 2;

            //testa se o meio nao é igual ao elemento buscado
            if (array[meio] == elemento) {
                return meio;
            }

            //testa se o meio é menor q o elemento buscado
            if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        //retorna -1 se nao achar
        return -1;
    }
    public static void main(String[] args) {
        int[] meuArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int ElementoBuscado = 40;

        //para a busca binaria funcionar o array precisa estar ordenado primeiro
        int resultado = buscaBinaria(meuArray, ElementoBuscado);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posicao do array: "+resultado);
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }
}
