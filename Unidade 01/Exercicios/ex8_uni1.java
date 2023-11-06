import java.util.*;

public class ex8_uni1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma lista de números inteiros separados por espaços: ");
        String input = scanner.nextLine();
        
        String[] numerosString = input.split(" ");
        int[] numeros = new int[numerosString.length];
        
        for (int i = 0; i < numerosString.length; i++) {
            try {
                numeros[i] = Integer.parseInt(numerosString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira apenas números inteiros válidos.");
                return;
            }
        }

        Map<Integer, Integer> contagem = new HashMap<>();
        int numeroMaisRepetido = numeros[0];
        int maxRepeticoes = 1;

        for (int numero : numeros) {
            if (contagem.containsKey(numero)) {
                contagem.put(numero, contagem.get(numero) + 1);
                if (contagem.get(numero) > maxRepeticoes) {
                    maxRepeticoes = contagem.get(numero);
                    numeroMaisRepetido = numero;
                }
            } else {
                contagem.put(numero, 1);
            }
        }

        System.out.println("Número mais repetido: " + numeroMaisRepetido + " (repete " + maxRepeticoes + " vezes).");

        scanner.close();
    }
}
