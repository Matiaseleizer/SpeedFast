public class PedidoComida extends Pedido{

    public PedidoComida(int idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    protected int calcularTiempoEntrega() {
        return 15 + (2 * getDistanciaKm());
    }
}
