public class ExemploMergeSort {
    
    public static void mergeSort(int[] arr) {
        int tamanho = arr.length;

        //testa se o tamanho ja esta na divisao minima de duas posiçoes no array
        if(tamanho < 2){
            return;
        }

        int meio = tamanho/2;
        int[] left = new int[meio];
        int[] right= new int[tamanho - meio];

        //copia o array original, cada metade para um lado
        System.arraycopy(arr, 0, left, 0, meio);
        System.arraycopy(arr, meio, right, 0, tamanho - meio);

        //usa a recursividade para dividir todo o array original
        mergeSort(left);
        mergeSort(right);

        //chama o merge para ordenar e juntar os arrays
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int tamanhoLeft = left.length;
        int tamanhoRight = right.length;
        int i=0, j=0, k=0;

        //testa qual dos numeros é maior e reordena, juntando no array original
        while (i < tamanhoLeft && j < tamanhoRight) {
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while (i < tamanhoLeft) {
            arr[k++] = left[i++];
        }

        while (j < tamanhoRight){
            arr[k++] = right[j++];
        }
    }  
    
    public static void main(String[] args) {
        int[] arr = {35,12,65,78,95,120,456,95,145,265,22,2354,254,48};
        System.out.println("Array nao ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        mergeSort(arr);

        System.out.println("");
        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
