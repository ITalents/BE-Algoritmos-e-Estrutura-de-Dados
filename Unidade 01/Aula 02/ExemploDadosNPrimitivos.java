public class ExemploDadosNPrimitivos {
    public static void main(String[] args){
        //tipos caracter PRIMITIVO
        char caracter = 'A';
        
        //tipo caracteres Não PRIMITIVO
        String nome = "Leonardo";
        nome = "Leonardo Orabona";


        //tipo Enum
        enum DiaDaSemana{
            DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO
        }

        DiaDaSemana dia = DiaDaSemana.DOMINGO;

        //tipo array
        int[] numeros = {1,2,3,4,5}; // comeca sempre em 0,1,2,3,4

        System.out.println(caracter);
        System.out.println(nome);
        System.out.println(dia);
        System.out.println(numeros[0]);
    }
}
