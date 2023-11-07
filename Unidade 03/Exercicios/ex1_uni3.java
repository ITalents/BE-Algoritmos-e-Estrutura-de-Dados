class No {
    int valor;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
}

public class ex1_uni3 {
    private No raiz;

    public ex1_uni3() {
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

    public void percorrerPreOrdem() {
        percorrerPreOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percorrerPreOrdemRecursivo(no.esquerda);
            percorrerPreOrdemRecursivo(no.direita);
        }
    }

    public void percorrerPosOrdem() {
        percorrerPosOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPosOrdemRecursivo(No no) {
        if (no != null) {
            percorrerPosOrdemRecursivo(no.esquerda);
            percorrerPosOrdemRecursivo(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public void percorrerEmOrdem() {
        percorrerEmOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerEmOrdemRecursivo(No no) {
        if (no != null) {
            percorrerEmOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerEmOrdemRecursivo(no.direita);
        }
    }

    public static void main(String[] args) {
        ex1_uni3 arvore = new ex1_uni3();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(20);
        arvore.inserir(3);
        arvore.inserir(8);
        arvore.inserir(15);
        arvore.inserir(30);

        System.out.println("Percorrendo em Pré-Ordem:");
        arvore.percorrerPreOrdem();

        System.out.println("Percorrendo em Pós-Ordem:");
        arvore.percorrerPosOrdem();

        System.out.println("Percorrendo em Em-Ordem:");
        arvore.percorrerEmOrdem();
    }
}
