public class ExemploSelectionSort {
     
    public static void selectionSort(int[] arr){
        int tamanho = arr.length;

        for(int i = 0; i < tamanho; i++){
            int minIndex = i;
            for(int j = i + 1; j < tamanho; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
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
