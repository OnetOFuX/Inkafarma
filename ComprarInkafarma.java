import java.util.Scanner;

public class ComprarInkafarma {
    public String[] productos;
    public double[] precios;

    public ComprarInkafarma() {
        System.out.println("Paracetamol");
        System.out.println("Ibuprofeno");
        System.out.println("Vitaminas");
        productos = new String[]{"Paracetamol", "Ibuprofeno", "Vitaminas"};

        precios = new double[]{5.99, 7.99, 12.49};
    }

    public boolean comprarProducto(String producto, int cantidad, double dineroDisponible) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(producto)) {
                double precioUnitario = precios[i];
                double precioTotal = precioUnitario * cantidad;
                if (precioTotal <= dineroDisponible) {
                    System.out.println("Compra exitosa. Total pagado: S/." + precioTotal);
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
        ComprarInkafarma Comprar = new ComprarInkafarma();
        Scanner gato = new Scanner(System.in);

        
        System.out.println("Productos disponibles:");
        for (String producto : Comprar.productos) {
            System.out.println(producto);
        }
        System.out.print("Elige un producto: ");
        String producto = gato.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = gato.nextInt();
        System.out.print("Dinero disponible: ");
        double dineroDisponible = gato.nextDouble();

        Comprar.comprarProducto(producto, cantidad, dineroDisponible);
    }
}
