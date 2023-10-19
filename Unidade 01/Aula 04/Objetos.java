public class Objetos {
    //Atributos
    private String nome;
    private int idade;
    private float peso;
    
    //Construtor
    public Objetos(String nome, int idade, float peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //metodos
    public void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
    
    public static void main(String[] args){
        Objetos pessoa = new Objetos("Leonardo", 26, 92.6f);
        Objetos pessoa2 = new Objetos("Bruno", 35, 72.5f);

        pessoa.exibirInfos();
        pessoa2.exibirInfos();
    }
}
