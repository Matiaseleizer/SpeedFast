public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(int idPedido, String direccionEntrega, int  distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    protected int calcularTiempoEntrega() {
        return (int) (20 + (1.5 * getDistanciaKm()));
    }
}
