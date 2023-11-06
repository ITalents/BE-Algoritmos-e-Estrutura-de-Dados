import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex6_uni2 {
    public static void main(String[] args) {
        Queue<String> filaEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar pessoa à fila de espera");
            System.out.println("2 - Chamar próxima pessoa da fila de espera");
            System.out.println("3 - Exibir fila de espera");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    filaEspera.add(nome);
                    System.out.println("Pessoa adicionada à fila de espera.");
                    break;
                case 2:
                    if (!filaEspera.isEmpty()) {
                        String proximaPessoa = filaEspera.poll();
                        System.out.println("Próxima pessoa chamada da fila de espera: " + proximaPessoa);
                    } else {
                        System.out.println("Fila de espera está vazia.");
                    }
                    break;
                case 3:
                    if (!filaEspera.isEmpty()) {
                        System.out.println("Fila de espera:");
                        for (String pessoa : filaEspera) {
                            System.out.println(pessoa);
                        }
                    } else {
                        System.out.println("Fila de espera está vazia.");
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
