
public class PedidoExpress extends Pedido{

    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, " Pedido express ");
    }

    @Override
    public void asignarRepartidor(){
        System.out.println(getTipoPedido() + " Asignando repartidor ");
        System.out.println(" Repartidor mas cercano con disponibilidad inmediata encontrado... ");
    }

    //Sobrecarga
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println(getTipoPedido() + " asignando repartidor... ");
        System.out.println("  Repartidor mas cercano con disponibilidad inmediata encontrado... ");
        System.out.println(" Pedido asignado a: " + nombreRepartidor);
    }
}
