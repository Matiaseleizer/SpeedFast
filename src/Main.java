import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== DEMOSTRACIÓN DE SOBRECARGA ===");

        // Instanciación de cada subclase
        PedidoComida comida = new PedidoComida(101, "Av. España 123");
        PedidoEncomienda encomienda = new PedidoEncomienda(102, "Calle Los Olivos 456");
        PedidoExpress express = new PedidoExpress(103, "Pasaje Las Flores 789");

        // Prueba de métodos sobrecargados (pasando el nombre del repartidor)
        comida.asignarRepartidor("Juan Pérez");
        System.out.println();
        encomienda.asignarRepartidor("Camila Soto");
        System.out.println();
        express.asignarRepartidor("Luis Díaz");

        System.out.println("\n=== DEMOSTRACIÓN DE POLIMORFISMO Y SOBRESCRITURA ===");

        // Creamos una lista de tipo genérico
        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(comida);
        listaPedidos.add(encomienda);
        listaPedidos.add(express);

        // Recorremos la lista ejecutando el método sobrescrito en cada subclase
        for (Pedido pedido : listaPedidos) {
            pedido.asignarRepartidor();
            System.out.println();
        }
    }
}