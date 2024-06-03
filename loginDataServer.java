import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class loginDataServer {

    // Función para guardar datos de inicio de sesión
    public static void saveLoginData(String username, String password, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println("Username: " + username + ", Password: " + password);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String filePath = "login_data.txt";

        saveLoginData(username, password, filePath);
        System.out.println("Login data saved successfully.");

        scanner.close();
    }
}
