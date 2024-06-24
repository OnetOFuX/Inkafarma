import java.util.Scanner;

public class calcularIgvProducto {

    int cantidad;
    String producto;
    double precio;




    // constructor
    public calcularIgvProducto(int cantidad, String producto, double precioUnitario ){
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precioUnitario;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }


    // Funcion para calcular el total
    public double calcularTotal(){
        return cantidad * precio;
    }

    // funcion para calcular el IGV
    public double calcularIGV(){
        return calcularTotal() * 0.18;
    }

    //funcion para el calcular el total a pagar
    public  double calcularTotalPagar(){
        return calcularTotal() + calcularIGV();
    }




    // funcion Void, por que no hace nada
    void verFactura(){

        double total = calcularTotal();
        double iva = calcularIGV();
        double totalAPagar = calcularTotalPagar();


        System.out.println("***********************************************");
        System.out.println("****          FACTURA DE COMPRA            ****");
        System.out.println("***********************************************");
        System.out.printf("%-10s | %-13s | %-10s  | %-10s %n", "Cantidad", "Producto", "Precio Unit.", "total");
        System.out.printf("%-10d | %-13s | s/.%-10.2f | s/.%-10.2f %n", cantidad, producto, precio, total);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-33s | s/.%-10.2f %n", "Total", total);
        System.out.printf("%-33s | s/.%-10.2f %n", "IGV", iva);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-33s | s/.%-10.2f%n", "Total a Pagar", totalAPagar);
        System.out.println("-----------------------------------------------");
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la cantidad");
        int cantidad = input.nextInt();
        input.nextLine();
        System.out.println("ingrese el nombre del producto");
        String producto = input.nextLine();
        System.out.println("precio ");
        double precio = input.nextDouble();


        calcularIgvProducto igv = new calcularIgvProducto(cantidad,producto,precio);
        igv.verFactura();
    }

}
