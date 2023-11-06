import java.util.HashMap;
import java.util.Map;

public class ex9_uni2 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("a", 1);
        mapa1.put("b", 2);
        mapa1.put("c", 3);

        HashMap<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("b", 4);
        mapa2.put("c", 5);
        mapa2.put("d", 6);

        System.out.println("Mapa 1: " + mapa1);
        System.out.println("Mapa 2: " + mapa2);

        mesclarMapas(mapa1, mapa2);

        System.out.println("Mapa mesclado: " + mapa1);
    }

    public static void mesclarMapas(HashMap<String, Integer> mapa1, HashMap<String, Integer> mapa2) {
        for (Map.Entry<String, Integer> entry : mapa2.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();

            // Se a chave já existir no mapa1, resolve o conflito somando os valores
            if (mapa1.containsKey(chave)) {
                mapa1.put(chave, mapa1.get(chave) + valor);
            } else {
                // Se a chave não existir, adiciona ao mapa1
                mapa1.put(chave, valor);
            }
        }
    }
}
