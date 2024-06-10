import java.util.HashMap;
import java.util.Scanner;

public class ronaldo {

    private HashMap<String, String> usuarios = new HashMap<>();

    public ronaldo() {
        usuarios.put("ronaldo", "12345");
        usuarios.put("david", "12345");
        usuarios.put("leo", "12345");
        usuarios.put("ademir", "12345");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¡BIENVENIDO A LA TIENDA DE INKAFARMA!");
            System.out.println("Presione 1 para iniciar sesión:");
            System.out.println("Presione 2 para crear una cuenta:");
            System.out.println("Presione 0 para salir:");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    iniciarSesion(scanner);
                    break;
                case 2:
                    crearCuenta(scanner);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("¡Gracias por visitar INKAFARMA! ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, inténtelo de nuevo.");
                    break;
            }
        }
    }

    private void iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        if (verificarCredenciales(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido AH INKAFARMA!");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
        }
    }

    private void crearCuenta(Scanner scanner) {
        System.out.println("Ingrese un nuevo nombre de usuario:");
        String nuevoUsuario = scanner.nextLine();

        if (usuarios.containsKey(nuevoUsuario)) {
            System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro nombre de usuario.");
        } else {
            System.out.println("Ingrese una contraseña para su nueva cuenta:");
            String nuevaContraseña = scanner.nextLine();
            usuarios.put(nuevoUsuario, nuevaContraseña);
            System.out.println("¡Cuenta creada exitosamente! Iniciando sesión...");
            iniciarSesionAutomatica(nuevoUsuario, nuevaContraseña);
        }
    }

    private void iniciarSesionAutomatica(String usuario, String contraseña) {
        if (verificarCredenciales(usuario, contraseña)) {
            System.out.println("Inicio de sesión automático exitoso. ¡Bienvenido AH INKAFARMA!");
        } else {
            System.out.println("Error al iniciar sesión automáticamente. Por favor, inicie sesión manualmente.");
        }
    }

    private boolean verificarCredenciales(String usuario, String contraseña) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña);
    }

    public static void main(String[] args) {
        ronaldo tienda = new ronaldo();
        tienda.iniciar();
    }
}