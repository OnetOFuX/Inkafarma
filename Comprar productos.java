import java.util.Scanner;

public class Tienda {
    private String[] productos;
    private double[] precios;

    public Tienda() {

        productos = new String[]{"Paracetamol", "Ibuprofeno", "Aspirina","Antibiotico","Jarabe para la tos"};
        precios = new double[]{5.50, 7.25, 4.75, 15.00, 8.00};
    }

    public boolean comprarProducto(String producto, int cantidad, double dineroDisponible) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(producto)) {
                double precioUnitario = precios[i];
                double precioTotal = precioUnitario * cantidad;
                if (precioTotal <= dineroDisponible) {
                    System.out.println("Compra exitosa. Total pagado: $" + precioTotal);
                    return true;
                } else {
                    System.out.println("No tienes suficiente dinero para comprar " + cantidad + " unidades de " + producto);
                    return false;
                }
            }
        }
        System.out.println("El producto " + producto + " no está disponible en la tienda.");
        return false;
    }

    public static void main(String[] args) {
        Tienda miTienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        // Comprar un producto
        System.out.println("Productos disponibles:");
        for (String producto : miTienda.productos) {
            System.out.println(producto);
        }
        System.out.print("Elige un producto: ");
        String producto = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Dinero disponible: ");
        double dineroDisponible = scanner.nextDouble();

        miTienda.comprarProducto(producto, cantidad, dineroDisponible);

        scanner.close();
    }
}
