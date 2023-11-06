import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }
}

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Mostrar lista de pessoas");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o endereço: ");
                    String endereco = scanner.nextLine();

                    Pessoa novaPessoa = new Pessoa(nome, idade, endereco);
                    listaPessoas.add(novaPessoa);
                    System.out.println("Pessoa adicionada à lista.");
                    break;
                case 2:
                    if (listaPessoas.isEmpty()) {
                        System.out.println("Lista de pessoas está vazia.");
                    } else {
                        System.out.println("Lista de pessoas:");
                        for (Pessoa pessoa : listaPessoas) {
                            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Endereço: " + pessoa.getEndereco());
                        }
                    }
                    break;
                case 3:
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
