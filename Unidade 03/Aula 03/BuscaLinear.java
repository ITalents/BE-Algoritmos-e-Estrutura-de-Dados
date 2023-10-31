public class BuscaLinear {
    //metodo static de busca linear
    static int buscaLinear(int[] array, int elemento){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] meuArray = {10,45,1,44,65,9,87,42,61,4,23,69};
        int elementoBuscado = 9;

        int resultado = buscaLinear(meuArray, elementoBuscado);

        //testa o retorno do metodo se diferente de -1
        if (resultado != -1) {
            System.out.println("Elemento buscado foi encontrado na posição do array: "+ resultado);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}