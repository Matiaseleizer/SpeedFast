
public class PedidoExpress extends Pedido{

    public PedidoExpress(int idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    protected int calcularTiempoEntrega() {
        if (getDistanciaKm() > 5) {
            return 10 + 5;
        }else{
            return 10 ;
        }
    }

}
