public class IGV {
    int cantidad;
    String producto;
    double precioUnitario;
    double Descuento;

    // constructor
    public IGV (int cantidad, String producto, double precioUnitario, double descuento ){
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.Descuento = descuento;

    }
    // Funcion para calcular el total
    public double calcularTotal(){
        return cantidad * precioUnitario;
    }

    // Funcion para calcular el descuento
    public double calcularDescuento(){
        return calcularTotal() * (Descuento / 100);
    }

    //Funcion para calcular el total con descuento
    public double calcularTotalDescuento(){
        return calcularTotal() - calcularDescuento();
    }

    // funcion para calcular el IGV
    public double calcularIGV(){
        return calcularTotal() * 0.18;
    }

    //funcion para el calcular el total a pagar
    public  double calcularTotalPagar(){
        return calcularTotalDescuento() + calcularIGV();
    }




    // funcion Void, por que no hace nada
    void verFactura(){

        double total = calcularTotal();
        double descuento = calcularDescuento();
        double totalConDescuento = calcularDescuento();
        double iva = calcularIGV();
        double totalAPagar = calcularTotalPagar();


        System.out.println("***********************************************");
        System.out.println("****          FACTURA DE COMPRA            ****");
        System.out.println("***********************************************");
        System.out.printf("%-10s | %-13s | %-10s  | %-10s %n", "Cantidad", "Producto", "Precio Unit.", "total");
        System.out.printf("%-10d | %-13s | s/.%-10.2f | s/.%-10.2f %n", cantidad, producto, precioUnitario, total);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-33s | s/.%-10.2f %n", "Total", total);
        System.out.printf("%-33s | s/.%-10.2f %n", "Descuento", descuento);
        System.out.printf("%-33s | s/.%-10.2f %n", "Total desc.", totalConDescuento);
        System.out.printf("%-33s | s/.%-10.2f %n", "IGV", iva);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-33s | s/.%-10.2f%n", "Total a Pagar", totalAPagar);
        System.out.println("-----------------------------------------------");


    }
    public static void main(String[] args){

        IGV igv = new IGV(2,"Paracetamol",5.00, 0.00);

        igv.verFactura();
    }

}
