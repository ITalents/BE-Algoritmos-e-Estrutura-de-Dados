public class ExemploArvoreBinaria {
    Node root;

    //definindo a raiz da arvore
    public ExemploArvoreBinaria(){
        root = null;
    }
    
    //class que define os nós
    static class Node {
        String nome;
        Node left, right;

        public Node(String nome){
            this.nome = nome;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        //criando a arvore
        ExemploArvoreBinaria arvore = new ExemploArvoreBinaria();

        //adicionando elementos a arvore
        arvore.root = new Node("AAA");
        arvore.root.right = new Node("BBB"); 
        arvore.root.left = new Node("CCC");

        arvore.root.right.right = new Node("DDD"); 
        arvore.root.right.left = new Node("EEE");

        arvore.root.left.right = new Node("FFF");
        arvore.root.left.left = new Node("GGG");

        //exibindo os elementos da arvore
        System.out.println(arvore.root.nome);
        System.out.println(arvore.root.right.nome);
        System.out.println(arvore.root.left.nome);


        System.out.println(arvore.root.right.right.nome);
        System.out.println(arvore.root.right.left.nome);


        System.out.println(arvore.root.left.right.nome);
        System.out.println(arvore.root.left.left.nome);

    }
    
}
