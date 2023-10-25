import java.util.LinkedList;
import java.util.Queue;

public class Pedido {
    private int nPedido;
    private String[] itens;
    private float valor;

    public Pedido(int nPedido, String[] itens, float valor){
        this.nPedido = nPedido;
        this.itens = itens;
        this.valor = valor;
    }
    public static void main(String[] args){
        //FIFO, do ingles "First In, First Out"
        Queue<Pedido> fila = new LinkedList<>();

        String[] itensTempPedido1 = {"Xburguer","Refrigerante","Batata"};
        Pedido pedido1 = new Pedido(123, itensTempPedido1, 30.45f);

        String[] itensTempPedido2 = {"Refrigerante","Sorvete"};
        Pedido pedido2 = new Pedido(456, itensTempPedido2, 22.67f);

        String[] itensTempPedido3 = {"Xburguer","Refrigerante","Batata","torta", "sorvete", "Molho"};
        Pedido pedido3 = new Pedido(789, itensTempPedido3, 55.25f);


        fila.offer(pedido1);
        fila.offer(pedido2);
        fila.offer(pedido3);

        while(!fila.isEmpty()){
           Pedido pedidoTemp = fila.poll();
           System.out.println("N Pedido: "+pedidoTemp.nPedido);
           System.out.println("Itens: ");
           for (String item : pedidoTemp.itens) {
            	System.out.println("     "+item);
           }
           System.out.println("Valor: "+pedidoTemp.valor);
           System.out.println("-----------------------------");
        }
    }
}
