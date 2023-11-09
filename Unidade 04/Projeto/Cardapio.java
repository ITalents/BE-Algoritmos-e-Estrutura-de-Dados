package Projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cardapio {
    private Map<String, Double> cardapio;

    public Cardapio() {
        this.cardapio = new HashMap<>();
        inicializarCardapio();
    }

    private void inicializarCardapio() {
        cardapio.put("Margherita", 30.00);
        cardapio.put("Pepperoni", 35.00);
        cardapio.put("Quatro queijos", 37.00);
        cardapio.put("Calabresa", 33.00);
        cardapio.put("Frango com Catupiry", 36.50);
        cardapio.put("Portuguesa", 33.40);
        cardapio.put("Mussarela", 28.00);
        cardapio.put("Atum", 38.70);
        cardapio.put("Vegetariana", 34.30);
        cardapio.put("Especial da casa", 42.20);
    }

    public Map<String, Double> getCardapio(){
        return cardapio;
    }

    public double getPrecoJusto(List<String> sabores){
        List<String> saboresEncontrados = new ArrayList<>();
        double precoTotal = 0.0;
        int totalSabores = 0;
        for (String sabor : sabores) {
            if (cardapio.containsKey(sabor)) {
                saboresEncontrados.add(sabor);
                totalSabores++;
            }else{
                System.out.println("Pizza "+sabor+" não encontrado!");
            }
        }

        for (String sabor : saboresEncontrados) {
            precoTotal += cardapio.get(sabor)/totalSabores;
        }

        return precoTotal;
    }
}
