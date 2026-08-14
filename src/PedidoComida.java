public class PedidoComida extends Pedido{

    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, " Pedido comida ");
    }

    //Sobrescritura
    @Override
    public void asignarRepartidor(){
        System.out.println(getTipoPedido() + "Repartidor con mochila OK");
    }

    //Sobrecarga
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println(getTipoPedido() + " asignando repartidor...");
        System.out.println(" Verificando mochila termica...OK ");
        System.out.println(" Pedido asignado a: " + nombreRepartidor);
    }
}
