public class Producto {

    private String producto;
    private double costo;


    public Producto(String producto, double costo){
        this.producto = producto;
        this.costo = costo;
    }

    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
}
