public class Condicionais {
    public static void main(String[] args){
        //== igual
        //!= diferente
        //< menor
        //> maior
        //<= menor ou igual
        //>= maior ou igual

        //&& E logico
        //|| OU logico
        // ! Nao Logico

        // If sozinho
        int x = 10;

        if (x == 10){
           System.out.println("Verdade"); 
        }
        System.out.println("fora do teste");

        //if e o else
        int y = 1;
        if (y < 10){
            System.out.println("Verdade");
        }else{
            System.out.println("Falso");
        }

        //if else elseif if encadeado
        int j = 60;
        if (j > 50){
            System.out.println("Primeiro if");
        }else if( j < 30){
            System.out.println("Segundo if");
        }else{
            System.out.println("else");
        }

        //switch case
        int opcao = 5;

        switch(opcao){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("opcao invalida");
        }

        //uso dos operadores logicos && e ||
        int b = 10;
        int c = 15;

        if (b == 10 && c == 15){
            System.out.println("Verdadeiro 1");
        }

        if (b == 11 || c == 15){
            System.out.println("Verdadeiro 2");
        }

    }
}
