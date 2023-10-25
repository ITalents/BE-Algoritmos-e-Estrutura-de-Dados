import java.util.HashMap;
import java.util.Map;

public class ExemploMaps {
    public static void main(String[] args){
        Map<String,Integer> mapa = new HashMap<>();

        //adiciona no mapa a chave e o valor (K,V)
        mapa.put("Leo", 30);
        mapa.put("Alice", 18);
        mapa.put("Joao", 56);
        mapa.put("Clara", 14);

        System.out.println(mapa);

        //retorna o valor da chave passada
        System.out.println(mapa.get("Leo"));

        //substitui o valor da chave passada, se nao encotrar nada acontece
        mapa.replace("Joao", 78);
        System.out.println(mapa);

        //adiciona no mapa caso a chave nao exista
        mapa.putIfAbsent("Joana", 90);
        System.out.println(mapa);

        //remove do mapa a chave passada
        mapa.remove("Clara");
        System.out.println(mapa);

        //busca no mapa pela chave
        if(mapa.containsKey("Tom")){
            System.out.println("Existe a chave passada");
        }else{
            System.out.println("Nao existe a chave passada");
        }

        //busca no mapa pelo valor
        if(mapa.containsValue(18)){
            System.out.println("Existe o valor passado");
        }else{
            System.out.println("Nao existe o valor passado");
        }

        //retorna true ou false em relacao ao mapa
        if(mapa.isEmpty()){
            System.out.println("O mapa esta vazio");
        }

        //laco para verificar todo o mapa
        for (String nome : mapa.keySet()) {
            System.out.println(nome);
        }

        //exibe o tamanho do mapa
        int tamanho = mapa.size();
        System.out.println("O tamanho do mapa é: "+ tamanho);
    }
}
  