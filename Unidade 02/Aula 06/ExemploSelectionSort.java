public class ExemploSelectionSort {
     
    public static void selectionSort(int[] arr){
        int tamanho = arr.length;

        //percorre todo o array
        for(int i = 0; i < tamanho; i++){
            int minIndex = i;
            //percorre o array novamente para comparar
            for(int j = i + 1; j < tamanho; j++){
                //compara o elemento do array atual com o selecionado
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap, troca o elemento pelo encontrado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,8,65,42,30};

        System.out.println("Array Não Ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        selectionSort(arr);

        System.out.println("");
        System.out.println("Array Ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
