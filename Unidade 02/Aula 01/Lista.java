import java.util.ArrayList;

public class Lista {
    public static void main(String[] args){
        String[] ListaCompras = new String[3];

        ListaCompras[0] = "Banana";
        ListaCompras[1] = "Tomate";
        ListaCompras[2] = "Feijao"; 

        ArrayList<String> ListaComprasUpgrade = new ArrayList<>();

        //adicionar itens novos a lista dinamica
        ListaComprasUpgrade.add("Queijo");
        ListaComprasUpgrade.add("Presunto");
        ListaComprasUpgrade.add("Pao");
        ListaComprasUpgrade.add("Tomate");

        //visualiza um item das listas
        System.out.println(ListaCompras[1]);
        System.out.println(ListaComprasUpgrade.get(1));

        //conta quantos itens tem na lista
        System.out.println(ListaCompras.length);
        System.out.println(ListaComprasUpgrade.size());

        //busca na lista pelo item passado true/false
        System.out.println(ListaComprasUpgrade.contains("alface"));

        //Remover um item da lista
        ListaComprasUpgrade.remove(3);
        ListaComprasUpgrade.remove("Tomate");

        //Limpa a lista inteira, deixa ela completamente vazia
        ListaComprasUpgrade.clear();
    }
}