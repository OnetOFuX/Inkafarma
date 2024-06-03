import java.util.HashMap;
import java.util.Scanner;

public class inkafarma {

    private static HashMap<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {

        usuarios.put("ronaldo", "12345");
        usuarios.put("david", "12345");
        usuarios.put("leo", "12345");
        usuarios.put("ademir", "12345");

        Scanner scanner = new Scanner(System.in);

        System.out.println("!BIENVENIDO A LA TIENDA DE INKAFARMA ¡");
        System.out.println("Presione 1 para iniciar sesión:");
        System.out.println("Presione 2 para crear una cuenta:");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.println("Ingrese su nombre de usuario:");
            String usuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contraseña = scanner.nextLine();

            if (verificarCredenciales(usuario, contraseña)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido AH INKAFARMA!");
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
            }
        } else if (opcion == 2) {
            System.out.println("Ingrese un nuevo nombre de usuario:");
            String nuevoUsuario = scanner.nextLine();

            if (usuarios.containsKey(nuevoUsuario)) {
                System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro nombre de usuario.");
            } else {
                System.out.println("Ingrese una contraseña para su nueva cuenta:");
                String nuevaContraseña = scanner.nextLine();
                usuarios.put(nuevoUsuario, nuevaContraseña);
                System.out.println("¡Cuenta creada exitosamente! Iniciando sesión...");
                iniciarSesion(nuevoUsuario, nuevaContraseña);
            }
        } else {
            System.out.println("Opción no válida. Por favor, inténtelo de nuevo.");
        }
    }

    private static boolean verificarCredenciales(String usuario, String contraseña) {
        if (usuarios.containsKey(usuario)) {
            String contraseñaAlmacenada = usuarios.get(usuario);
            return contraseñaAlmacenada.equals(contraseña);
        }
        return false;
    }

    private static void iniciarSesion(String usuario, String contraseña) {
        if (verificarCredenciales(usuario, contraseña)) {
            System.out.println("Inicio de sesión automático exitoso. ¡Bienvenido AH INKAFARMA!");
        } else {
            System.out.println("Error al iniciar sesión automáticamente. Por favor, inicie sesión manualmente.");
        }
    }
}