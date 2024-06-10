import java.util.Scanner;
public class pagotarjeta {
    String tarjeta,name,apellidos;
    int cvv,huevo,mes;
    public void Datos(){
        Scanner gato = new Scanner(System.in);
        System.out.println("Ingrese el nombre(s) del Titular de la tarjeta");
        name = gato.nextLine();
        System.out.println("Ingrese los apellidos del Titular de la tarjeta");
        apellidos = gato.nextLine();
    }
    public String pagotarjeta() {
        Scanner rata = new Scanner(System.in);
        System.out.println("Ingrese el numero de su tarjeta");
        tarjeta = rata.nextLine();
        if(tarjeta.length() > 16 && tarjeta.length() > -1){
            System.out.println("Numero de tarjeta invalido");
            return pagotarjeta();
        }
        System.out.println("Ingrese la fecha de vencimiento de  la tarjeta");
        System.out.println("Mes");
        mes = rata.nextInt();
        System.out.println("Año");
        huevo = rata.nextInt();
        System.out.println("Ingrese el CVV o codigo de seguridad");
        cvv = rata.nextInt();
        System.out.println("Realizando Pago.....");
        if(mes > 12 && huevo > 9999 && cvv > 999 ){
            System.out.println("Datos no validos");
            return pagotarjeta();
        }
        return null;
    }
    public void Pagorealizado(){
        System.out.println("-----------------------------------------------");
        System.out.println("Pago realizado con éxito");
        System.out.println("Detalles del pago:");
        System.out.println("Número de tarjeta: " + tarjeta);
        System.out.println("Titular de la tarjeta: " + name + "" + apellidos);
        System.out.println("Fecha de vencimiento: " + mes);
        System.out.println("CVV: " + cvv);
        System.out.println("------------------------------------------------");
        System.out.println("¡Gracias por su compra!, Estimado " + name);


    }
    public static void main(String [] args) {
        pagotarjeta rata = new pagotarjeta();
        rata.Datos();
        rata.pagotarjeta();
        rata.Pagorealizado();
    }
}