import java.util.ArrayList;
import java.util.Scanner;

public class ex4_uni1 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Remover número");
            System.out.println("3 - Exibir lista de números");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número a ser adicionado: ");
                    int numeroAdd = scanner.nextInt();
                    listaNumeros.add(numeroAdd);
                    System.out.println("Número adicionado à lista.");
                    break;
                case 2:
                    if (listaNumeros.isEmpty()) {
                        System.out.println("A lista está vazia. Nada para remover.");
                    } else {
                        System.out.print("Digite o índice do número a ser removido: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < listaNumeros.size()) {
                            listaNumeros.remove(indice);
                            System.out.println("Número removido da lista.");
                        } else {
                            System.out.println("Índice inválido. Tente novamente.");
                        }
                    }
                    break;
                case 3:
                    if (listaNumeros.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Lista de números:");
                        for (int i = 0; i < listaNumeros.size(); i++) {
                            System.out.println(i + " - " + listaNumeros.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}

