import java.sql.*;
import java.util.Scanner;

class Usuario {
    String nombreUsuario;
    String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}

class Tienda {
    private Connection conn;

    public Tienda() {
        conectarBaseDeDatos();
    }

    private void conectarBaseDeDatos() {
        try {
            String url = "jdbc:mysql://localhost:3306/TiendaDB";
            String usuario = "trespepitos";
            String contrasena = "rew";
            conn = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario autenticarUsuario(String nombreUsuario, String contrasena) {
        try {
            String query = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contrasena = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, contrasena);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getString("nombreUsuario"), rs.getString("contrasena"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean registrarUsuario(String nombreUsuario, String contrasena) {
        try {
            String query = "INSERTAR usuarios (nombreUsuario, contrasena) VALUES ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, contrasena);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

public class prueba_amazon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();
        Usuario usuarioActual = null;

        System.out.println("Bienvenido a la tienda!");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Crear cuenta");
        System.out.print("Seleccione una opción: ");
        int opcionInicio = scanner.nextInt();
        scanner.nextLine();

        if (opcionInicio == 1) {
            System.out.print("Ingrese nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese contraseña: ");
            String contrasena = scanner.nextLine();
            usuarioActual = tienda.autenticarUsuario(nombreUsuario, contrasena);
            if (usuarioActual == null) {
                System.out.println("Usuario o contraseña incorrectos.");
                return;
            } else {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido " + usuarioActual.getNombreUsuario() + "!");
            }
        } else if (opcionInicio == 2) {
            System.out.print("Ingrese nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Ingrese contraseña: ");
            String contrasena = scanner.nextLine();
            if (tienda.registrarUsuario(nombreUsuario, contrasena)) {
                System.out.println("Usuario registrado con éxito.");
            } else {
                System.out.println("Error al registrar el usuario.");
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
