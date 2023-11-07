public class ex8_uni3 {
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

    public ex8_uni3() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }

        return no;
    }

    public int encontrarMenorValor() {
        return encontrarMenorValorRecursivo(raiz);
    }

    private int encontrarMenorValorRecursivo(No no) {
        if (no.esquerda == null) {
            return no.valor;
        }

        return encontrarMenorValorRecursivo(no.esquerda);
    }

    public static void main(String[] args) {
        ex8_uni3 arvore = new ex8_uni3();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(8);

        int menorValor = arvore.encontrarMenorValor();
        System.out.println("O menor valor na árvore é: " + menorValor);
    }
}
