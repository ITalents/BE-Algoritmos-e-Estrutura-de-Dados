import java.util.*;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

public class ex10_uni1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ItemEstoque> estoque = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item ao estoque");
            System.out.println("2 - Remover item do estoque");
            System.out.println("3 - Atualizar quantidade de um item");
            System.out.println("4 - Mostrar estoque");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item a ser adicionado: ");
                    String nomeNovoItem = scanner.nextLine();
                    System.out.print("Digite a quantidade inicial: ");
                    int quantidadeInicial = scanner.nextInt();

                    ItemEstoque novoItem = new ItemEstoque(nomeNovoItem, quantidadeInicial);
                    estoque.add(novoItem);
                    System.out.println("Item adicionado ao estoque.");
                    break;
                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio. Nada para remover.");
                    } else {
                        System.out.print("Digite o nome do item a ser removido: ");
                        String nomeItemRemover = scanner.nextLine();

                        boolean removido = false;
                        for (ItemEstoque item : estoque) {
                            if (item.getNome().equals(nomeItemRemover)) {
                                estoque.remove(item);
                                removido = true;
                                System.out.println("Item removido do estoque.");
                                break;
                            }
                        }
                        if (!removido) {
                            System.out.println("Item não encontrado no estoque.");
                        }
                    }
                    break;
                case 3:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio. Nada para atualizar.");
                    } else {
                        System.out.print("Digite o nome do item a ser atualizado: ");
                        String nomeItemAtualizar = scanner.nextLine();

                        boolean atualizado = false;
                        for (ItemEstoque item : estoque) {
                            if (item.getNome().equals(nomeItemAtualizar)) {
                                System.out.print("Digite a nova quantidade: ");
                                int novaQuantidade = scanner.nextInt();
                                item.setQuantidade(novaQuantidade);
                                atualizado = true;
                                System.out.println("Quantidade do item atualizada.");
                                break;
                            }
                        }
                        if (!atualizado) {
                            System.out.println("Item não encontrado no estoque.");
                        }
                    }
                    break;
                case 4:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio.");
                    } else {
                        System.out.println("Estoque:");
                        for (ItemEstoque item : estoque) {
                            System.out.println("Item: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
                        }
                    }
                    break;
                case 5:
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
