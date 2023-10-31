class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree(){
        root = null;
    }

    //metodo de insercao na arvore
    void insert(int key){
        root = insertRec(root, key);
    }

    //metodo recursivo de insercao na arvore
    Node insertRec(Node root, int key){
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }


        return root;
    }

    //metodo de exibicao ordenada da arvore
    void inorderTraversal(){
        inorderTraversalRec(root);
    }
    //metodo recursivo de exibicao ordenada da arvore
    void inorderTraversalRec(Node root){
        if(root != null){
            inorderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inorderTraversalRec(root.right);
        }
    }

    //metodo de busca na arvore
    boolean search(int key){
        return searchRec(root, key);
    }

    //metodo recursivo de busca na arvore
    boolean searchRec(Node root , int key){
        if (root == null)
            return false;
        
        if(root.key == key)
            return true;
        
        if(key < root.key) 
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    public static void main(String[] args){
        //definindo a arvore
        BinarySearchTree tree = new BinarySearchTree();

        //inserindo itens de forma automatica
        tree.insert(20);
        tree.insert(30);
        tree.insert(10);
        tree.insert(40);
        tree.insert(42);
        tree.insert(5);

        //exibindo a arvore de forma ordenada
        System.out.println("Arvore ordenada: ");
        tree.inorderTraversal();

        //buscando elemento na arvore
        if(tree.search(15)){
            System.out.println("Chave encontrada");
        }else{
            System.out.println("Chave nao encontrada");
        }

    }
}