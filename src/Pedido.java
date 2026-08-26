public abstract class Pedido {

    //Atributos
    private int idPedido;
    private String direccionEntrega;
    private int distanciaKm;
    protected String repartidor;

    //Constructor
    public Pedido(int idPedido, String direccionEntrega, int distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;

    }

    //Metodo
    public void mostrarResumen(){
        System.out.println("---N° pedido #: " + idPedido);
        System.out.println("---Dirección de entrega: " + direccionEntrega);
        System.out.println("---Distancia (KM): " + distanciaKm);
        System.out.println("---Tiempo de entrega : " + calcularTiempoEntrega() + " minutos.");
    }

    //Metodos
    public void asignarRepartidor(){
        this.repartidor = "Repartidor estándar";
    }

    protected abstract int calcularTiempoEntrega(); //Metodo Abstracto

    private void tipoDeEntrega(){}

    private void factoresQueAfectanDuracion(){}

    //Getter & Setter
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }
}

