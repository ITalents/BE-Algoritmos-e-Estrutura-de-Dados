

public class ex2_uni3 {
    static class No {
    int valor;
    No esquerda;
    No direita;

        public No(int valor) {
            this.valor = valor;
            esquerda = null;
            direita = null;
        }
    }
    private No raiz;

    // Código para inserção e métodos de travessia omitidos

    public boolean verificaBST() {
        return verificaBSTRecursivo(raiz, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean verificaBSTRecursivo(No no, int valorMin, int valorMax) {
        if (no == null) {
            return true;
        }

        if (no.valor < valorMin || no.valor > valorMax) {
            return false;
        }

        return (verificaBSTRecursivo(no.esquerda, valorMin, no.valor - 1) &&
                verificaBSTRecursivo(no.direita, no.valor + 1, valorMax));
    }

    public static void main(String[] args) {
        ex2_uni3 arvore = new ex2_uni3();
        // Código para inserir elementos na árvore

        boolean ehBST = arvore.verificaBST();
        if (ehBST) {
            System.out.println("A árvore é uma Árvore Binária de Busca (BST).");
        } else {
            System.out.println("A árvore não é uma Árvore Binária de Busca (BST).");
        }
    }
}
