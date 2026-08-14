public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, " Encomienda ");
    }

    @Override
    public void asignarRepartidor(){
        System.out.println(getTipoPedido() + "  Asignando repartidor ");
        System.out.println(" Validando peso y embalaje... OK ");
    }

    //Sobrecarga
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println(getTipoPedido() + " asignando repartidor... ");
        System.out.println(" Validando peso y embalaje... OK ");
        System.out.println(" Pedido asignado a: " + nombreRepartidor);
    }
}
