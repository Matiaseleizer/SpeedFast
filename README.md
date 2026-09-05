# 🚀 SpeedFast - Sistema Multihilo de Asignación y Entrega de Pedidos

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)
![DuocUC](https://img.shields.io/badge/Evaluaci%C3%B3n-Formativa%20Semana%204-003366)

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos II** de **Duoc UC Online** (Semana 4: *"Ejecutando tareas en paralelo con hilos en Java"*).

La aplicación simula un sistema de gestión, logística y reparto concurrente en tiempo real para la empresa **SpeedFast**. Integra los pilares de la Programación Orientada a Objetos (**Abstracción**, **Encapsulamiento**, **Herencia**, **Interfaces**, **Polimorfismo**) junto con conceptos de **Programación Concurrente y Multihilo** (`Thread`, `Runnable`, `ExecutorService`).

---

## 📋 Descripción del Caso (Semana 4)

**SpeedFast** optimiza sus entregas mediante la simulación de múltiples repartidores ejecutándose de forma simultánea. Cada repartidor opera como un hilo independiente que recorre su lista asignada de pedidos, simula el tiempo de traslado mediante pausas aleatorias e informa su progreso en tiempo real por consola.

* 🍕 **PedidoComida:** Alimentos preparados con requerimientos térmicos.
* 📦 **PedidoEncomienda:** Envíos de paquetería y documentos.
* ⚡ **PedidoExpress:** Entregas prioritarias en lapsos acotados.
* 🛵 **Repartidor (Tarea Concurrente):** Clase que implementa `Runnable`, gestionando una cola de pedidos secuencial con simulación de tiempos mediante `Thread.sleep()`.

---

## 🛠️ Conceptos y Tecnologías Aplicadas

1. **Programación Concurrente (`Runnable`):** La clase `Repartidor` implementa la interfaz `Runnable`, permitiendo que cada repartidor sea ejecutado como una tarea independiente en su propio hilo de ejecución.
2. **Gestión de Hilos (`ExecutorService`):** Se utiliza `Executors.newFixedThreadPool(3)` en `Main.java` para coordinar y ejecutar simultáneamente los hilos de repartidores en un entorno de ejecución eficiente.
3. **Simulación de Tiempos y Manejo de Excepciones:** Se emplea `Thread.sleep()` con intervalos aleatorios (1000 - 3000 ms) para simular los tiempos de viaje de cada entrega, con captura explícita de `InterruptedException`.
4. **Abstracción e Interfaces:** Mantenimiento de la jerarquía previa con la clase abstracta `Pedido` y las interfaces `Despachable`, `Cancelable` y `Rastreable`.
5. **Polimorfismo:** Procesamiento heterogéneo de instancias de `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` dentro de las listas asignadas a cada repartidor.

---

## 📁 Estructura del Proyecto

semana 4/
 ├── src/
 │    ├── Cancelable.java        # Interfaz para la gestión de cancelaciones
 │    ├── Despachable.java       # Interfaz para la gestión de despachos
 │    ├── Rastreable.java        # Interfaz para trazabilidad de envíos
 │    ├── Pedido.java            # Clase base abstracta
 │    ├── PedidoComida.java      # Subclase especializada en pedidos de restaurantes
 │    ├── PedidoEncomienda.java  # Subclase especializada en encomiendas
 │    ├── PedidoExpress.java     # Subclase especializada en compras rápidas
 │    ├── Repartidor.java        # Tarea ejecutable (Runnable) con lista de pedidos
 │    └── Main.java              # Clase principal que orquesta la ejecución con ExecutorService
 └── README.md                   # Documentación del proyecto

## ⚙️ Requisitos y Entorno de Ejecución

* **JDK:** Java SE 17 o superior.
* **IDE:** IntelliJ IDEA.
* **Control de Versiones:** Git & GitHub.

---

## 📄 Licencia y Créditos

Desarrollado como actividad formativa para **Duoc UC Online** - Carrera de Analista programador computacional. Reservados todos los derechos institucionales.
