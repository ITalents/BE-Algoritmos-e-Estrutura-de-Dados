public class Pessoa2 {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private boolean habilitada;

    public Pessoa2(String nome, int idade, float peso, float altura, boolean habilitada){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.habilitada = habilitada;
    }

    public void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public void testarAltura(float alturaTeste){
        if (alturaTeste <= this.altura){
            System.out.println("Autorizado a entrada");
        }else{
            System.out.println("Não Autorizado a entrada");
        }
    }

    public void testarIdade(){
        if(this.idade >= 18){
            System.out.println("Maior de idade, pode Beber!!!");
        }else{
            System.out.println("Menor de idade, não pode Beber!!!");
        }
    }

    public float testeDeIMC(){
        //calculo do IMC
        float IMC = this.peso/(this.altura * this.altura);

        //teste do grau IMC
        if(IMC < 18.5){
            System.out.println("Magreza");
        }else if(IMC >= 18.5 && IMC < 24.9){
            System.out.println("Normal");
        }else if(IMC >= 25 && IMC < 29.9){
            System.out.println("Sobrepeso");
        }else if(IMC >= 30 && IMC < 34.9){
            System.out.println("Obesidade grau I");
        }else if(IMC >= 35 && IMC < 39.9){
            System.out.println("Obesidade grau II");
        }else if(IMC > 40){
            System.out.println("Obesidade grau III");
        }

        return IMC;
    }

    public void testeDeHabilitacao(){
        if(this.habilitada){
            System.out.println("Pessoa Habilitada");
        }else{
            System.out.println("Pessoa Não Habilitada");
        }
    }

    public static void main(String[] args){
        Pessoa2 pessoa = new Pessoa2("Leo", 18, 200.2f, 1.88f, false);

        pessoa.exibirInfos();
        pessoa.testarAltura(1.40f);
        pessoa.testarIdade();
        float imc = pessoa.testeDeIMC();
        System.out.println(imc);
        pessoa.testeDeHabilitacao();

    }
}
