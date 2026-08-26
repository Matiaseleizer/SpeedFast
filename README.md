# 🚀 SpeedFast - Sistema de Asignación de Pedidos

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)
![DuocUC](https://img.shields.io/badge/Evaluaci%C3%B3n-Formativa-003366)

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos II** de **Duoc UC Online**.

La aplicación modela un sistema de gestión y logística de repartos a domicilio para la empresa **SpeedFast**, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO): **Abstracción**, **Encapsulamiento**, **Herencia**, **Interfaces**, **Sobrescritura**, **Sobrecarga** y **Polimorfismo**.

---

## 📋 Descripción del Caso

**SpeedFast** ofrece tres líneas principales de servicio de reparto a domicilio. Cada tipo de pedido posee requerimientos, métodos de asignación y cálculo de tiempo de entrega diferenciados:

* 🍕 **Pedido de Comida:** Tiempo estimado dinámico según la distancia ($15 \text{ min} + 2 \text{ min/km}$), asignación con empaque o bolsa térmica.
* 📦 **Pedido de Encomienda:** Tiempo estimado para logística de carga ($20 \text{ min} + 1.5 \text{ min/km}$), proceso de despacho desde el centro de distribución.
* ⚡ **Pedido Express:** Prioridad máxima con tiempos reducidos ajustados según el tramo de distancia.

El sistema utiliza clases abstractas e interfaces para desacoplar el comportamiento (`Despachable`, `Cancelable`, `Rastreable`) y garantizar la trazabilidad de los envíos.

---

## 🛠️ Conceptos de Programación Orientada a Objetos Aplicados

1. **Abstracción:** La clase base `Pedido` se define como `abstract` e incluye el método abstracto `calcularTiempoEntrega()`, forzando a cada subclase a implementar su propio algoritmo de cálculo.
2. **Interfaces y Desacoplamiento:** Se implementan tres contratos de comportamiento en las subclases para extender capacidades funcionales sin afectar la jerarquía de herencia:
    * `Despachable`: Modela la acción de envío mediante `despachar()`.
    * `Cancelable`: Modela el flujo de anulación con `cancelar()`.
    * `Rastreable`: Permite consultar el estado final con `verHistorial()`.
3. **Encapsulamiento:** La superclase `Pedido` protege sus atributos (`idPedido`, `direccionEntrega`, `distanciaKm`, `repartidor`) combinando visibilidad `private` y `protected`, expuestos mediante getters y setters.
4. **Herencia:** `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` extienden de `Pedido`, reutilizando la lógica base mediante la instrucción `super()`.
5. **Polimorfismo por Sobrescritura (`@Override`):** Redefinición del método sin parámetros `asignarRepartidor()` para la asignación automática en cada clase derivada.
6. **Polimorfismo por Sobrecarga:** Inclusión del método `asignarRepartidor(String nombre)` para permitir la asignación manual de repartidores.

---

## 📁 Estructura del Proyecto

```text
src/
 ├── Cancelable.java        # Interfaz para anulación de pedidos
 ├── Despachable.java       # Interfaz para el despacho de envíos
 ├── Rastreable.java        # Interfaz para consulta de historial
 ├── Pedido.java            # Clase base abstracta con lógica general y cálculos requeridos
 ├── PedidoComida.java      # Subclase especializada en alimentos
 ├── PedidoEncomienda.java  # Subclase especializada en paquetes y carga
 ├── PedidoExpress.java     # Subclase especializada en entregas prioritarias
 └── Main.java              # Clase principal con la simulación completa del sistema
```

---

## 🖥️ Ejemplo de Salida por Consola

Al ejecutar la clase `Main.java`, el sistema genera la siguiente salida formateada:

PEDIDO EXPRESS---
Se asignó a Mario para la entrega de tu pedido express #3
---N° pedido #: 3
---Dirección de entrega: calle Miraflores
---Distancia (KM): 7
---Tiempo de entrega : 15 minutos.
Su pedido #3 ha sido enviado de manera prioritaria.

ENCOMIENDA---
Se asignó a Francisca para la entrega de tu encomienda número #2
---N° pedido #: 2
---Dirección de entrega: av. Vicuña Mackenna
---Distancia (KM): 6
---Tiempo de entrega : 29 minutos.
Su encomienda numero #2 ha salido de nuestro centro de distribución.

PEDIDO COMIDA---
Se asignó a Eduardo para la entrega de tu pedido número #1
---N° pedido #: 1
---Dirección de entrega: Los maitenes
---Distancia (KM): 3
---Tiempo de entrega : 21 minutos.
Su pedido de comida numero #1 va en camino a su destino.

HISTORIAL
Su pedido #3 Ha sido entregado por Mario
Su pedido #2 Ha sido entregado por Francisca
Su pedido #1 Ha sido entregado por Eduardo
---

## ⚙️ Requisitos y Entorno de Ejecución

* **JDK:** Java SE 17 o superior.
* **IDE:** IntelliJ IDEA.
* **Control de Versiones:** Git & GitHub.

---

## 📄 Licencia y Créditos

Desarrollado como actividad formativa para **Duoc UC Online** - Carrera de Analista programador computacional. Reservados todos los derechos institucionales.
