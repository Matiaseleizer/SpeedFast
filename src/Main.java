
public class Main {
    public static void main(String[] args) {

       PedidoComida comida = new PedidoComida(1, "Los maitenes", 3);
       PedidoEncomienda encomienda = new PedidoEncomienda(2, "av. Vicuña Mackenna", 6);
       PedidoExpress express = new PedidoExpress(3, "calle Miraflores", 7);

       comida.mostrarResumen();
       encomienda.mostrarResumen();
       express.mostrarResumen();
    }
}