public class Lacos {
    public static void main(String[] args){
        //Laço For, repete numero determinado de vezes
        for (int i = 1; i <= 10; i++){
           System.out.println(i); 
        }

        //Laço while, repete N vezes ate que nao seja mais verdade
        int x = 6;
        while (x <= 5){
            System.out.println(x);
            x++;
        }

        //Laço Do while, repete N vezes ate que nao seja mais verdade, mas acontece pelo menos uma vez
        int j = 6;
        do{
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
