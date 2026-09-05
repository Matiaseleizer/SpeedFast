import java.util.List;

public class Repartidor implements Runnable{

    private String nombre;
    private List <Pedido> pedidos;

    public Repartidor(String nombre, List <Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    @Override
    public void run() {

        for (Pedido pedido : pedidos) {
            // 1. Mensaje de inicio de entrega
            System.out.println("[Repartidor: " + nombre + "] Entregando "
                    + pedido.getClass().getSimpleName() + " #" + pedido.getIdPedido() + "...");

            try {
                // 2. Generar tiempo aleatorio entre 1000 ms (1s) y 3000 ms (3s)
                long tiempoEntrega = (long) (Math.random() * 2000 + 1000);

                // 3. Pausar la ejecución de este hilo en particular
                Thread.sleep(tiempoEntrega);

            } catch (InterruptedException e) {
                // Manejo de excepción en caso de interrupción del hilo
                System.out.println("La entrega del repartidor " + nombre + " fue interrumpida.");
                Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            }

            // 4. Mensaje de confirmación
            System.out.println("[Repartidor: " + nombre + "] Pedido #" + pedido.getIdPedido() + " entregado.");
        }
    }

}
