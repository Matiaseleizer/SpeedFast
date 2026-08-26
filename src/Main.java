
public class Main {
    public static void main(String[] args) {

       PedidoComida comida = new PedidoComida(1, "Los maitenes", 3);
       PedidoEncomienda encomienda = new PedidoEncomienda(2, "av. Vicuña Mackenna", 6);
       PedidoExpress express = new PedidoExpress(3, "calle Miraflores", 7);


System.out.println("\nPEDIDO EXPRESS---");

       express.asignarRepartidor("Mario");
       express.mostrarResumen();
       express.despachar();


        System.out.println("\nENCOMIENDA---");

        encomienda.asignarRepartidor("Francisca");
        encomienda.mostrarResumen();
        encomienda.despachar();


        System.out.println("\nPEDIDO COMIDA---");

        comida.asignarRepartidor("Eduardo");
        comida.mostrarResumen();
        comida.despachar();

        System.out.println("\nHISTORIAL");
        express.verHistorial();
        encomienda.verHistorial();
        comida.verHistorial();
    }
}