import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class envio {
    Scanner gato = new Scanner(System.in);
    String pais,region,ciudad,distrito,direccion,codigopostal,numerocasa;
    public void envi(){
        enviopais();
        codidopostal();
        direccion();
        escribir();
    }
    public String enviopais(){
        System.out.println("Ingresa tu pais de residencia");
        pais = gato.nextLine();
        System.out.println("Ingresa el nombre de tu departamento");
        region = gato.nextLine();
        System.out.println("Ingresa el nombre de tu localidad");
        ciudad = gato.nextLine();
        System.out.println("Ingresa el nombre de tu distrito");
        distrito = gato.nextLine();
        return null;
    }    
    public String codidopostal(){
        System.out.println("Ingresa tu codigo postal");
        codigopostal = gato.nextLine();
        if (codigopostal.length() != 5){
            System.out.println("Codigo postal invalido");
            return codidopostal();
        }
        return null;
    }
    public String direccion(){
        System.out.println("Ingresa tu direccion");
        direccion = gato.nextLine();
        return null;
    }
    public void escribir(){
        Date horadetucasa = new Date();
        SimpleDateFormat formatoedhroa = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hora = formatoedhroa.format(horadetucasa);
        System.out.println("Orden creada con exito");
        System.out.println("Fecha y Hora de la creacion de la orden");
        System.out.println(hora);
        System.out.println("Tu direccion de envio es: ");
        System.out.println(pais); 
        System.out.println(region); 
        System.out.println(ciudad);
        System.out.println(codigopostal);
        System.out.println(distrito);  
        System.out.println(direccion);
        System.out.println("Tu numero de tracking es: 442268652");
    }
    public static void main(String[] args) {
        envio raton = new envio();
        raton.envi();
    }
}
