import java.util.Scanner;

public class login {
    String correo, contraseña, nombre, apellido, dni, telefono;
    Scanner rata = new Scanner(System.in);
    public String Crearcuenta() {
        System.out.println("⢀⣀⣀⣀⣀⠀⠀⠀⠀⣀⣀⡀⢀⣀ ⠀⣀⣀⣀⣀⠀⠀⠀⠀⣀⣀⣀⣀⣀⡀⠀⠀⣀⣀⣀⣀⣀⣀⡀⠀  ⢀⣀⣀⣀⠀⠀⠀⠀⢀⢀⣀⠀⣀⣀⠀\r\n" + //
                        "⠀⣴⣿⡿⠿⢿⣿⣷⡀⠀⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣷⠀⢀⣾⣿⡿⠿⣿⣿⣧⠀⠀⠿⠿⠿⣿⣿⣿⠇⠀⣴⣿⡿⠿⣿⣿⣆⠀ ⢸⣿⣿⣿⣿⣿⣿⣆⠀\r\n" + //
                        "⠀⠉⢉⣁⣠⣼⣿⣿⡇⠀⣿⣿⡏⠀⠈⣿⣿⡇⠀⢹⣿⣿⠀⠈⠉⣉⣀⣤⣼⣿⣿⠀⠀⠀⠀⣴⣿⣿⠋⠀⢰⣿⣿⠁⠀⠀⢸⣿⣿⡄⢸⣿⣿⠃⠀⢹⣿⣿\r\n" + //
                        "⢀⣾⣿⡿⠛⢹⣿⣿⡇⠀⣿⣿⡇⠀⠀⣿⣿⡇⠀⢸⣿⣿⠀⢠⣾⣿⠟⠛⢹⣿⣿⠀⠀⢀⣾⣿⡿⠁⠀⠀⢸⣿⣿⠀⠀⠀⢀⣿⣿⡇⢸⣿⣿⠀⠀⢸⣿⣿\r\n" + //
                        "⢸⣿⣿⣇⣀⣼⣿⣿⣇⠀⣿⣿⡇⠀⠀⣿⣿⡇⠀⢸⣿⣿⠀⢸⣿⣿⣄⣀⣾⣿⣿⣄⠠⣿⣿⣿⣿⣷⣶⠀⠈⣿⣿⣧⣀⣼⣿⡿⠁⢸⣿⣿⠀⠀⢸⣿⣿⠀\r\n" + //
                        "⠀⠛⠿⠿⠿⠋⠹⠿⠋⠀⠿⠿⠇⠀⠀⠿⠿⠃⠀⠸⠿⠿⠀⠈⠻⠿⠿⠟⠋⠻⠟⠁⠀⠛⠉⠉⣉⠉⠛⠇⠀⠈⠻⠿⠿⠿⠛⠁⠀⠸⠿⠿⠀⠀⠸⠿⠟⠀\r\n" + //
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠐⢶⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠞⠛⠛⠻⣍⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⢿⡒⠦⢤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⠤⣶⡾⠃⢠⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⠲⠤⣈⣉⠉⠙⠒⠒⠒⠒⠚⠛⠉⣉⣩⡤⠖⠋⠁⠀⠰⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⠛⠛⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    
        System.out.println("//////////////////////////////////////////");
        System.out.println("---Para continuar debe crear una cuenta---");
        System.out.println("//////////////////////////////////////////");
        System.out.println("Ingrese sus nombre(s)");
        nombre = rata.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = rata.nextLine();
        System.out.println("Ingrese su dni");
        dni = rata.nextLine();
        System.out.println("Ingrese su telefono");
        telefono = rata.nextLine();
        System.out.println("Ingrese su correo electronico");
        correo = rata.nextLine();
        System.out.println("Cree una contraseña");
        contraseña = rata.nextLine();

        return null;
    }

    public String Login() {

        int intentos = 0;
        int maxintentos = 4;
        boolean ini = false;
        System.out.println("///////////////////////////////////////");
        System.out.println("------Para contiuar inicie sesion------");
        System.out.println("///////////////////////////////////////");
        System.out.println("Ingrese su correo electronico");
        String correo2 = rata.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña2 = rata.nextLine();
        if (correo.equals(correo2) && contraseña.equals(contraseña2)) {
            System.out.println("");
            System.out.println("----> Bienvenido " + nombre + "" + apellido);
            ini = true;
        } else {
            System.out.println("");
            intentos++;
            int intentosres = maxintentos - intentos;
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            System.out.println("Intentos restantes " + intentosres);
            return Login();
        }
        if (!ini) {
            System.out.println("Limite de Intentos alcanzado");
        }
        return null;
    }
    public void log(){
        Crearcuenta();
        Login();
    }
    public static void main(String[] args) {
        login rata = new login();
        rata.log();
    }
}
