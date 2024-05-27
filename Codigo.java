import java.util.HashMap;

public class Codigo {
    // HashMap para almacenar los productos y sus precios
    private static HashMap<String, Double> inventario = new HashMap<>();

    // Método para agregar productos al inventario
    public static void agregarProducto(String producto, double precio) {
        inventario.put(producto, precio);
    }

    // Método para obtener el precio de un producto
    public static double obtenerPrecio(String producto) {
        if (inventario.containsKey(producto)) {
            return inventario.get(producto);
        } else {
            System.out.println("El producto " + producto + " no está en el inventario.");
            return 0.0;
        }
    }

    // Método para mostrar todos los productos y sus precios en el inventario
    public static void mostrarInventario() {
        System.out.println("Inventario de la farmacia:");
        for (String producto : inventario.keySet()) {
            double precio = inventario.get(producto);
            System.out.println(producto + ": $" + precio);
        }
    }

    public static void main(String[] args) {
        // Agregar productos al inventario
        agregarProducto("Paracetamol", 5.99);
        agregarProducto("Ibuprofeno", 7.99);
        agregarProducto("Vitaminas", 12.49);

        // Mostrar el inventario
        mostrarInventario();

        // Obtener precio de un producto
        String productoBuscado = "Ibuprofeno";
        System.out.println("El precio de " + productoBuscado + " es: $" + obtenerPrecio(productoBuscado));
    }
}
