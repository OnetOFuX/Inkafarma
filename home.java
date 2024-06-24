import java.util.Scanner;
public class home {
    Scanner rata = new Scanner(System.in);
    public String Home(){
        String[] categorias = {"1) Suscripciones", "2) Ofertas del dia", "3) Servicio al cliente", "4) Listas", "5) Tarjetas de regalo", "6) Vender","7) Carrito","8) Pedidos y Devoluciones"};
        int opcion;
        System.out.println("Seleccione una opción:");
            for (String option : categorias) {
                System.out.println(option);
            }
        opcion = rata.nextInt();
        switch (opcion) {
            case 1:
            int sub;
                String[] suscripciones = {"Amazon Music","E-Reader Kinddle y Libros","Amazon AppStore","Amazon Prime Video","Amazon Prime"};
                for (String sus : suscripciones) {
                    System.out.println(sus);
                }
                sub = rata.nextInt();
                switch (sub) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }

                
                break;
            case 2:

                break;

            default:
                break;
        }

    return null;
}
public boolean Suscripciones(){

    return false;
}
    public static void main(String[] args) {
        home gato = new home();
    
        gato.Home();
    
    }
}