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
            System.out.println("╔══════ •\uD83E\uDD8B.•\uD83D\uDC9C•.¸\uD83C\uDF3A¸.•\uD83D\uDC99•.\uD83C\uDF1F•.•\uD83D\uDC99•.¸\uD83C\uDF3A¸.•\uD83D\uDC9C•.\uD83E\uDD8B•══════╗\n" +
                    ":·.·:¨\uD83C\uDF38¡BIENVENIDO A LA TIENDA DE INKAFARMA! \uD83C\uDF38¨:·.·:\n" +
                    "╚══════ •\uD83E\uDD8B.•\uD83D\uDC9C•.¸\uD83C\uDF3A¸.•\uD83D\uDC99•.\uD83C\uDF1F•.•\uD83D\uDC99•.¸\uD83C\uDF3A¸.•\uD83D\uDC9C•.\uD83E\uDD8B•══════╝" );

            System.out.println("Presione 1 para iniciar sesión:");
            System.out.println("Presione 2 para crear una cuenta:");
            System.out.println("Presione 0 para salir:");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (iniciarSesion(scanner)) {
                        continuar = false;
                    }
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

    private boolean iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        if (verificarCredenciales(usuario, contraseña)) {
            System.out.println(" ╔══════.¸¸.\uD83E\uDDE1.¸¸.\uD83C\uDF1C¸.\uD83E\uDD16.¸¸.❄\uFE0F.¸¸.\uD83E\uDDE1.¸══════╗\n" +
                    " ╞══\uD83C\uDF3A══\uD83C\uDF1F\uD83C\uDF1F˖°°¡Bienvenido AH INKAFARMA!°°°˖\uD83C\uDF1F\uD83C\uDF1F══\uD83C\uDF3A══╡\n " +
                    "╚══════.¸¸.\uD83D\uDC07.¸¸.\uD83E\uDD40¸.\uD83D\uDC9B.¸¸.\uD83E\uDD40.¸¸.\uD83D\uDC24.¸══════╝");
            return true;
        } else {
            System.out.println("╔══════⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F══════╗\n" +
                    "Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo \n" +
                    "╚══════⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F⚠\uFE0F══════╝ ");
            return false;
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

            System.out.println(" ╔══════.¸¸.\uD83E\uDDE1.¸¸.\uD83C\uDF1C¸.\uD83E\uDD16.¸¸.❄\uFE0F.¸¸.\uD83E\uDDE1.¸══════╗\n" +
                    " ╞══\uD83C\uDF3A══\uD83C\uDF1F\uD83C\uDF1F˖°°¡Bienvenido AH INKAFARMA!°°°˖\uD83C\uDF1F\uD83C\uDF1F══\uD83C\uDF3A══╡\n " +
                    "╚══════.¸¸.\uD83D\uDC07.¸¸.\uD83E\uDD40¸.\uD83D\uDC9B.¸¸.\uD83E\uDD40.¸¸.\uD83D\uDC24.¸══════╝");
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
