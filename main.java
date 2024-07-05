package main;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    static final String URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASSWORD = "";
    static Map<String, Usuario> usuarios = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    static class Usuario {
        String nombre;
        String apellido;
        String correo;
        String contraseña;

        Usuario(String nombre, String apellido, String correo, String contraseña) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.contraseña = contraseña;
        }
    }

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa a la base de datos MySQL");

            while (true) {
                System.out.println("\nBienvenido a Amazon");
                System.out.println("1. Iniciar sesión");
                System.out.println("2. Crear cuenta");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        iniciarSesion(con);
                        break;
                    case 2:
                        registrarUsuario(con);
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        }

    }

    static void iniciarSesion(Connection con) throws SQLException {
        System.out.println("\nIniciar sesión en Amazon");
        System.out.print("Nombre de usuario o correo electrónico: ");
        String nombreUsuarioCorreo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        String query = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contraseña = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, nombreUsuarioCorreo);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("¡Bienvenido, " + rs.getString("nombre") + "!");
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos.");
            }
        }
    }

    static void registrarUsuario(Connection con) throws SQLException {
        System.out.println("\nCrear una cuenta de Amazon");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        if (usuarios.containsKey(correo)) {
            System.out.println("Error al crear la cuenta. El correo electrónico ya está en uso.");
        } else {
            String query = "INSERT INTO usuarios (nombre, apellido, correo, contraseña) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, nombre);
                stmt.setString(2, apellido);
                stmt.setString(3, correo);
                stmt.setString(4, contraseña);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("¡Cuenta creada exitosamente!");
                    usuarios.put(correo, new Usuario(nombre, apellido, correo, contraseña));
                } else {
                    System.out.println("Error al registrar el usuario.");
                }
            }

        }
    }




}