import java.util.Random;
import java.util.Scanner;

public class tracking {

    Scanner raton = new Scanner(System.in);
    int gato;

    public String camaron(){
        Random ardilla = new Random();
        String[] localizacion = {"Recibido por la empresa de reparto,","Salio del Pais de origen (US)","En reparto","Orden creada","Llego al pais de destino (PE)","Control de Aduana","Accion necesario en Aduana","Se perdio tu paquete xD"};
        int dias = ardilla.nextInt(90) + 1;
        for (int i = 0; i < 1; i++) {
            String city = localizacion[ardilla.nextInt(localizacion.length)];
            System.out.println((i + 1) + ": " + city + ", Tiempo de entrega estimado: " + dias + " Dias");
        }
        return null;
    }
    
    public void track(){
    
        System.out.println("Ingresa tu numero de Tracking");
        gato = raton.nextInt();
        if (gato == 442268652){
            camaron();
        }
    }

    public static void main(String[] args) {
        tracking huevo = new tracking();
        huevo.track();
    }
}
