# 🚀 SpeedFast - Sistema de Asignación de Pedidos

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)
![DuocUC](https://img.shields.io/badge/Evaluaci%C3%B3n-Formativa%20Semana%201-003366)

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos II** de **Duoc UC Online** (Semana 1: *"Explorando la sobrecarga y sobreescritura en clases derivadas"*).

La aplicación modela un sistema de gestión y logística de repartos a domicilio para la empresa **SpeedFast**, aplicando los principios fundamentales de la Programación Orientada a Objetos (POO): **Encapsulamiento**, **Herencia**, **Sobrescritura**, **Sobrecarga** y **Polimorfismo**.

---

## 📋 Descripción del Caso

**SpeedFast** ofrece tres líneas principales de servicio de reparto a domicilio. Cada tipo de pedido posee requerimientos y criterios de asignación de repartidores diferenciados:

* 🍕 **Pedido de Comida:** Requiere verificación obligatoria de repartidor con mochila térmica.
* 📦 **Pedido de Encomienda:** Requiere proceso de validación de peso y tipo de embalaje.
* ⚡ **Pedido Express:** Requiere asignación al repartidor más cercano con disponibilidad inmediata.

El sistema utiliza la jerarquía de clases para personalizar el proceso de asignación del repartidor mediante el método `asignarRepartidor()`.

---

## 🛠️ Conceptos de Programación Orientada a Objetos Aplicados

1. **Encapsulamiento:** La superclase `Pedido` protege sus atributos privados (`idPedido`, `direccionEntrega`, `tipoPedido`) y expone su acceso/modificación a través de métodos accesores (*getters*) y mutadores (*setters*).
2. **Herencia:** Las subclases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` extienden la clase base `Pedido`, heredando sus miembros y reutilizando lógica común a través del constructor `super()`.
3. **Sobrescritura (`@Override`):** Cada clase derivada redefine el método sin parámetros `asignarRepartidor()` para ejecutar las validaciones requeridas por su modelo de negocio.
4. **Sobrecarga de Métodos:** Se implementa una segunda firma para el método, `asignarRepartidor(String nombreRepartidor)`, que recibe el nombre del repartidor asignado e imprime la confirmación detallada.
5. **Polimorfismo:** Permite almacenar distintas instancias (`PedidoComida`, `PedidoEncomienda`, `PedidoExpress`) en una colección de tipo `List<Pedido>` y ejecutar sus comportamientos específicos en tiempo de ejecución.

---

## 📁 Estructura del Proyecto

```text
src/
 ├── Pedido.java           # Clase base abstracta/superclase con atributos y métodos genéricos
 ├── PedidoComida.java     # Subclase especializada en pedidos de restaurantes
 ├── PedidoEncomienda.java # Subclase especializada en documentos y paquetes
 ├── PedidoExpress.java    # Subclase especializada en compras rápidas (supermercado/farmacia)
 └── Main.java             # Clase principal con punto de entrada (main) para pruebas
```

---

## 🖥️ Ejemplo de Salida por Consola

Al ejecutar la clase `Main.java`, el sistema genera la siguiente salida formateada:

```text
=== DEMOSTRACIÓN DE SOBRECARGA (MÉTODO CON PARÁMETRO) ===
[Pedido comida] Asignando repartidor...
→ Verificando mochila térmica... OK
→ Pedido asignado a: Juan Pérez

[Encomienda] Asignando repartidor...
→ Validando peso y embalaje... OK
→ Pedido asignado a: Camila Soto

[Pedido express] Asignando repartidor...
→ Repartidor más cercano con disponibilidad inmediata encontrado.
→ Pedido asignado a: Luis Díaz

=== DEMOSTRACIÓN DE POLIMORFISMO Y SOBRESCRITURA ===
[Pedido comida] Asignando repartidor...
→ Verificando mochila térmica... OK

[Encomienda] Asignando repartidor...
→ Validando peso y embalaje... OK

[Pedido express] Asignando repartidor...
→ Repartidor más cercano con disponibilidad inmediata encontrado.
```

---

## ⚙️ Requisitos y Entorno de Ejecución

* **JDK:** Java SE 17 o superior.
* **IDE:** IntelliJ IDEA.
* **Control de Versiones:** Git & GitHub.

---

## 📄 Licencia y Créditos

Desarrollado como actividad formativa para **Duoc UC Online** - Carrera de Ingeniería / Tecnicatura en Desarrollo de Software. Reservados todos los derechos institucionales.
