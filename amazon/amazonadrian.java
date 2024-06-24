import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class amazonadrian {
    private Scanner adrian = new Scanner(System.in);
    private String[] productos = {"Productos Electrónicos", };
    private String[] contenido = {"TV 49 \uD83D\uDCFA", "computadora\uD83D\uDDA5\uFE0F", "celular xiomi\uD83D\uDCF1", "smart watch⌚", "audifonos proseionales\uD83C\uDFA7","proyectores de video\uD83D\uDCFD\uFE0F"};
    private double[] precios = {1500, 2500, 700, 500, 250,2000};
    private int[] carrito = new int[productos.length + contenido.length];
    private double subtotal, IGV, total;

    public void iniciarCompra() {
        System.out.println("Bienvenido a Amazon2");
        while (true) {
            mostrarMenu();
            int opcion = adrian.nextInt();
            adrian.nextLine();

            switch (opcion) {
                case 1:
                    this.comprarProductos();
                    break;
                case 2:
                    this.verCarrito();
                    break;
                case 3:
                    this.pagarOrden();
                    break;
                case 4:
                    this.exportarOrden();
                    break;
                case 5:
                    System.out.println("Gracias por usar Amazon deme su dinero. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida elija bien");
                    break;
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Comprar productos");
        System.out.println("2. Ver carrito de compras");
        System.out.println("3. Pagar orden");
        System.out.println("4. Exportar orden a archivo");
        System.out.println("5. Salir");
    }

    private void comprarProductos() {
        System.out.println("Lista de productos disponibles:");



        // Mostrar productos del segundo grupo
        for (int i = 0; i < contenido.length; i++) {
            System.out.println((productos.length + i + 1) + ". " + contenido[i] + " - $" + precios[i]);
        }

        System.out.println("Seleccione el producto que desea comprar (1-" + (productos.length + contenido.length) + "):");
        int seleccion = adrian.nextInt();
        adrian.nextLine();

        if (seleccion < 1 || seleccion > (productos.length + contenido.length)) {
            System.out.println("Selección no válida elija bien");
            return;
        }

        System.out.println("Cantidad:");
        int cantidad = adrian.nextInt();
        adrian.nextLine();

        carrito[seleccion - 1] += cantidad;
        if (seleccion <= productos.length) {
            System.out.println(cantidad + " unidades de " + productos[seleccion - 1] + " añadidas al carrito.");
        } else {
            System.out.println(cantidad + " unidades de " + contenido[seleccion - productos.length - 1] + " añadidas al carrito.");
        }
    }

    private void verCarrito() {
        System.out.println("Carrito de compras:");

        for (int i = 0; i < contenido.length; i++) {
            if (carrito[productos.length + i] > 0) {
                System.out.println(contenido[i] + " - $" + precios[i] + " x " + carrito[productos.length + i] + " unidades");
            }
        }
    }

    private void pagarOrden() {
        subtotal = 0;

        for (int i = 0; i < contenido.length; i++) {
            subtotal += precios[i] * carrito[productos.length + i];
        }

        IGV = subtotal * 0.18;
        total = subtotal + IGV;

        System.out.println("Resumen de la orden:");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuestos: $" + IGV);
        System.out.println("Total a pagar: $" + total);
    }

    private void exportarOrden() {
        try {
            File archivo = new File("orden_amazon.txt");
            FileWriter escritor = new FileWriter(archivo);

            escritor.write("Detalles de la orden:\n");

            for (int i = 0; i < contenido.length; i++) {
                if (carrito[productos.length + i] > 0) {
                    escritor.write(contenido[i] + " - $" + precios[i] + " x " + carrito[productos.length + i] + " unidades\n");
                }
            }
            escritor.write("\n");
            escritor.write("Subtotal: $" + subtotal + "\n");
            escritor.write("Impuestos: $" + IGV + "\n");
            escritor.write("Total a pagar: $" + total + "\n");

            escritor.close();
            System.out.println("Orden exportada correctamente a orden_amazon.txt.puerquitos");
        } catch (IOException e) {
            System.out.println("Error al exportar la orden.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        amazonadrian amazon = new amazonadrian();
        amazon.iniciarCompra();
    }
}
