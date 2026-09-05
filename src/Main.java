import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        // 1. Crear los pedidos de prueba
        PedidoComida comida1 = new PedidoComida(1, "Los maitenes", 3);
        PedidoComida comida2 = new PedidoComida(4, "Av. Italia 500", 2);

        PedidoEncomienda encomienda1 = new PedidoEncomienda(2, "Av. Vicuña Mackenna", 6);
        PedidoEncomienda encomienda2 = new PedidoEncomienda(5, "Alameda 1200", 8);

        PedidoExpress express1 = new PedidoExpress(3, "Calle Miraflores", 7);
        PedidoExpress express2 = new PedidoExpress(6, "Providencia 300", 4);

        // 2. Crear listas y asignar al menos 2 pedidos a cada repartidor
        List<Pedido> pedidosMario = new ArrayList<>();
        pedidosMario.add(express1);
        pedidosMario.add(comida2);

        List<Pedido> pedidosFrancisca = new ArrayList<>();
        pedidosFrancisca.add(encomienda1);
        pedidosFrancisca.add(express2);

        List<Pedido> pedidosEduardo = new ArrayList<>();
        pedidosEduardo.add(comida1);
        pedidosEduardo.add(encomienda2);

        // 3. instancias de Repartidor (Runnable)
        Repartidor mario = new Repartidor("Mario", pedidosMario);
        Repartidor francisca = new Repartidor("Francisca", pedidosFrancisca);
        Repartidor eduardo = new Repartidor("Eduardo", pedidosEduardo);

        // 4.ExecutorService para 3 hilos en paralelo
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 5. Iniciar la ejecución concurrente
        executor.execute(mario);
        executor.execute(francisca);
        executor.execute(eduardo);

        // 6. Detener la recepción de nuevas tareas
        executor.shutdown();
    }
}