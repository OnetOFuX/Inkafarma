import java.util.Scanner;

public class pagotarjeta {

    Scanner rata = new Scanner(System.in);
    String tarjeta,name,apellidos;
    int cvv,huevo,mes;
    public void Datos(){
        System.out.println("Ingrese el nombre(s) del Titular de la tarjeta");
        name = rata.nextLine();
        System.out.println("Ingrese los apellidos del Titular de la tarjeta");
        apellidos = rata.nextLine();
        tarjeta();
        fecha();
        Codigoseguridad();
        aea();

    }

    public String tarjeta() {
        System.out.println("Ingrese el numero de su tarjeta");
        tarjeta = rata.nextLine();
        if(tarjeta.length() != 16){
            System.out.println("Numero de tarjeta invalido");
            return tarjeta();
        }
        System.out.println("Ingrese la fecha de vencimiento de  la tarjeta");
        return null;
    }
    public String fecha(){
        System.out.println("Mes");
        mes = rata.nextInt();
        System.out.println("Año");
        huevo = rata.nextInt();
        if(mes > 12 || mes <= 1 && huevo > 2050 || huevo < 2023){
            System.out.println("Fecha no valida, ingrese una fecha correcta");
            return fecha();
        }
        return null;
    }
    public String Codigoseguridad(){
        System.out.println("Ingrese el CVV o codigo de seguridad");
        cvv = rata.nextInt();
        if(cvv > 999 || cvv < 100){
            System.out.println("Datos no validos");
            return Codigoseguridad();
        }
        return null;
    }
    public void aea(){
        System.out.println("Realizando Pago.....");
    }
    public void Pagorealizado(){

        String x;
        System.out.println("Pago realizado con éxito");
        System.out.println("****************************************************");
        System.out.println("Detalles del pago:");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("Titular de la tarjeta: " + name + " " + apellidos);
        if (tarjeta.length()>= 10) {
            x = tarjeta.substring(0, tarjeta.length() - 10);
            x += "x".repeat(10);
            System.out.println("Número de tarjeta: " + x);
        }

    }
    public static void main(String [] args) {
        pagotarjeta loro = new pagotarjeta();
        loro.Datos();

    }
}