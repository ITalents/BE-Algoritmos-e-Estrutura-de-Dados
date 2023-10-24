import java.util.ArrayList;

public class Lista2 {
    public static void main(String[] args){
        ArrayList<String> ListaComprasUpgrade = new ArrayList<>();

        //adicionar itens novos a lista dinamica
        ListaComprasUpgrade.add("Queijo");
        ListaComprasUpgrade.add("Presunto");
        ListaComprasUpgrade.add("Pao");
        ListaComprasUpgrade.add("Tomate");
        ListaComprasUpgrade.add("Alface");

        ArrayList<String> ListaLanche = (ArrayList<String>) ListaComprasUpgrade.clone();

        ListaLanche.add("Requeijao"); 
        System.out.println(ListaLanche);

        System.out.println(ListaComprasUpgrade.size());
        System.out.println(ListaComprasUpgrade.isEmpty());
        ListaComprasUpgrade.clear();
        System.out.println(ListaComprasUpgrade.size());
        System.out.println(ListaComprasUpgrade.isEmpty());

        // for(String item : ListaLanche){
        //     System.out.println(item);
        //     if(item == "Alface"){
        //         System.out.println("Item encontrado");
        //     }else{
        //         System.out.println("Item não encontrado");
        //     }
        // }

        boolean existe = false;
        for(String item : ListaLanche){
            System.out.println(item);
            if(item == "Feijao"){
                existe = true;
            }
        }

        if(existe){
            System.out.println("Item encontrado");
        }else{
            System.out.println("Item não encontrado");
        }
    }
}
