import java.util.Scanner;
public class chabots {
    public static   void main (String[]args){
        chabots heuvos1 = new chabots();
        heuvos1.adrian();
    }
    void adrian(){
        Scanner adrian = new Scanner(System.in);
        int opcionSeleccionado;


        do {
            System.out.println("¡Hola! \uD83D\uDC4B Te damos la bienvenida al chatbot de inkafarma:");
            System.out.println("1.call center");
            System.out.println("2.compras por whatsapp");
            System.out.println("3.aliviamed");
            System.out.println("4 salir");
            opcionSeleccionado = adrian.nextInt();
            switch (opcionSeleccionado) {
                case 1:
                    System.out.println("has seleccionado la opcion 1 de llamar a 941795884");
                    System.out.println(" seleciona 1 para realizar tu pedido  ");
                    System.out.println("selecione 2 para recibir acesoria farmaceutica");
                    int subopcion1 = adrian.nextInt();
                    if (subopcion1 == 1) { //poner sub opciones.
                        System.out.println(" acaba de seleccionar la opcion 1. 1: podra realizar cualquier pedido mediante este link https://inkafarma.pe/?utm_source=google&utm_medium=cpc&utm_campaign=inkafarma-202401-ao-sub-ecom-null-branding_marca-google_search-do-conversiones-null-null-null-web-null-null&utm_content=texto-abierto-null-null-inkafarmabrand&utm_term=01_01-null-varios-texto-inkafarmabrand&gad_source=1&gclid=Cj0KCQjwsaqzBhDdARIsAK2gqnfw4sA_eIKh7AbU6KlwIRPDZyWPVR0HIWjg9cF1jOc8jxt43gf0MsEaAn2JEALw_wcB  ");
                        //sub opciones
                    } else if (subopcion1 == 2) {
                        System.out.println("acaba de seleccionar la opcion 1. 2: acontinuacion se le cotactara una doctora para recetarle medicamentos");
                    } else {
                        System.out.println("subopcion no valida. por favor seleccione una subopcion del 1.1 al 1.2");
                    }
                    break;
                case 2:
                    System.out.println(" has seleccionado la opcion 2 para compras por whatsapp elige una de estas tres opciones para continuar:");
                    System.out.println("selecciona 1 consultar productos via llamada ");
                    System.out.println("seleccione 2 comprar ahora ");
                    System.out.println("selecciona 3 otras consultas");
                    int subopcion2 = adrian.nextInt();
                    if (subopcion2 == 1) {
                        System.out.println("acaba de selecionar la opcion 1. 1: dentro de pocos segundo le llamaremos y prodra hacer su consulta de productos via llamada ");
                    } else if (subopcion2 == 2)
                        System.out.println("acaba de selecionar la opcion 2. 2: ¿En qué categoría te gustaría realizar tu consulta? \uD83E\uDD14 Te proporcionamos el enlace al Catálogo ->  https://inkafarma.pe/encartes  \uD83D\uDCDA para que puedas explorar nuestras ofertas.");
                    else if (subopcion2 == 3){
                        System.out.println("acaba de selecionar la opcion 3. 2: otras consultas para poder ayudarle con mas consulta se le recomienda llamar al numero (01) 314 2020 ");
                    }
                    else {
                        System.out.println("subopcion no valida. por favor seleccionar una subopcion del 1.1 al 2.2.");

                    }
                    break;
                case 3:
                    System.out.println("has seleccionado la opcion 3 aliviamed ¡Hola! \uD83D\uDC4B! Te doy la bienvenida a Aliviamed\uD83D\uDC9A, somos un servicio de telemedicina.Estamos para brindarte atención médica de calidad de manera conveniente y segura.  Antes de continuar, necesitamos que aceptes nuestra política de privacidad para garantizar la protección de tus datos.\uD83D\uDC49 https://telemedicina-paciente.farmaciasperuanas.pe/doc/PP-IKF");
                    System.out.println("seleccione 1 si acepta  ");
                    System.out.println("seleccione 2 si no acepta nuestras politicas");
                    int subopcion3 = adrian.nextInt();
                    if (subopcion3 == 1) {
                        System.out.println("acaba de selccionar la opcion 1. " +
                                "1:Hola! \uD83D\uDC9A Para realizar consultas, compras ó conocer nuestras promociones de productos, ponte en contacto con nuestro Whatsapp de Delivery \uD83D\uDC49 997 551 917Gracias \uD83D\uDE42");
                    }else if (subopcion3 ==2){
                        System.out.println(" acaba de seleccionar la opcion 2. " +
                                "2: Gracias por escribirnos. \n" +
                                "Si nos necesitas nuevamente, recuerda que siempre estamos listos para ayudarte por este medio");

                    }
                    else {
                        System.out.println("subopcion no valida.por favor selecciona una subopcion del 3");
                    }
                    break;
                case 4:
                    System.out.println(" has seleccionado la opcion 4: salir");
                    break;
                default:
                    System.out.println("opcion no valida. por fabor seleccina una opcion del 1 al 4");
            }
        }while (opcionSeleccionado != 4) ;
    }
}
