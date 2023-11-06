import java.util.*;

public class ex8_uni2 {
    public static void main(String[] args) {
        String frase = "Esta é uma frase de exemplo, uma frase simples para demonstração.";

        // Removendo pontuações e convertendo para minúsculas
        frase = frase.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        
        String[] palavras = frase.split(" ");

        HashMap<String, Integer> frequenciaPalavras = new HashMap<>();

        // Contagem da frequência das palavras
        for (String palavra : palavras) {
            if (frequenciaPalavras.containsKey(palavra)) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.get(palavra) + 1);
            } else {
                frequenciaPalavras.put(palavra, 1);
            }
        }

        // Exibição da frequência das palavras
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + " - Frequência: " + entry.getValue());
        }
    }
}
