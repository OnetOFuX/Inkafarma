import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DAVID {

    String correo, contraseña, nombre, apellido, dni, telefono;
    ListaDeProductos lita1 = new ListaDeProductos();

List<Producto> listaProducto = new ArrayList<Producto>();
    public void Inkafarma() {
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("--------------Bienvenido a Inkafarma--------------");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("                                                  ");
    }

    public String Crearcuenta() {
        Scanner rata = new Scanner(System.in);
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
        Scanner sasha = new Scanner(System.in);
        int intentos = 0;
        int maxintentos = 4;
        boolean ini = false;
        System.out.println("///////////////////////////////////////");
        System.out.println("------Para contiuar inicie sesion------");
        System.out.println("///////////////////////////////////////");
        System.out.println("Ingrese su correo electronico");
        String correo2 = sasha.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña2 = sasha.nextLine();
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

    public void Menu() {
        System.out.println("|1.- Categorías|\uD83D\uDD3D");
        System.out.println("|2.- Tienda deportiva|❚█══█❚");
        System.out.println("|3.- Perú Pasión|\uD83D\uDC97");
        System.out.println("|4.- Dermocosmética|\uD83D\uDC85\uD83C\uDFFB");
        System.out.println("|5.- Botiquín|\uD83E\uDDF0");
        System.out.println("|6.- Belleza|\uD83D\uDC51");
        System.out.println("|7.- Fórmulas infantiles|\uD83C\uDF7C");
        System.out.println("|8.- Bienestar|\uD83E\uDDD8\uD83C\uDFFB");
        System.out.println("|9.- Blog|\uD83D\uDCDD");
        System.out.println("|10.- Agora Club|");
        System.out.println("|11.- Aliviamed|");
        System.out.println("|12.- Catálogo|");
        System.out.println();
        System.out.println("13.- chat bot");

    }

    public void menu2() {
        Scanner ardilla = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("Elija una de las opciones");
        System.out.println("***************************");
        int opc = ardilla.nextInt();
        switch (opc) {
            case 1:
                System.out.println("---------------------------");
                System.out.println("1.-Inka Packs");
                System.out.println("2.-Peru Pasion");
                System.out.println("3.-Farmacia");
                System.out.println("4.-Salud");
                System.out.println("5.-Mamá y Bebe");
                System.out.println("6.-Nutricion para Todos");
                System.out.println("7.-Dermatologia y Cosmetica");
                System.out.println("8.-Belleza");
                System.out.println("---------------------------");
                int opc_cat = ardilla.nextInt();
                switch (opc_cat) {
                    case 1:
                        System.out.println("1.- Packs de Farmacia");
                        System.out.println("2.- Packs de Adulto mayor");
                        System.out.println("3.- Packs de Nutricion y Bienestar");
                        int opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasInkaPacksPacksDeFarmacia();

                                // Solicitar al usuario que elija un producto
                                lita1.comprarProducto(listaProducto);



                            case 2:
                                lita1.CategoriasInkaPacksPacksDeAdultoMayo();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 3:
                                lita1.CategoriasInkaPacksPacksDeNutricionYbienestar();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("1.- Nutricion");
                        System.out.println("2.- Higiene y Cuidado Personal");
                        System.out.println("3.- Dispositivos Ortopedicos");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasPeruPasionNutricion();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasPerupasionHigieneYCuidadoPersonal();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 3:
                                lita1.CategoriasPerupasionDispositivosOrtopedicos();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("1.- Dolor Generalizado");
                        System.out.println("2.- Resfriado Comun");
                        System.out.println("3.- Colicos Menstruales");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasFarmaciaDolorGeneralisado();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasFarmaciasResfriadoComun();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 3:
                                lita1.CategoriasFarmaciaColicosMenstruales();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("1.- Cuidado de la Mujer");
                        System.out.println("2.- Cuidado Dermatologico");
                        System.out.println("3.- Antineoplásicos e Inmunomoduladores");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasSaludCuidadoDeLaMujer();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasSaludCuidadoDermatologo();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 3:
                                lita1.CategoriasSaludAntineoplasicosInmunomoduladores();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 5:
                        System.out.println("1.- Promociones para el cuidado infantil");
                        System.out.println("2.- Promociones en Nutricion Infantil ");
                        System.out.println("3.- Pañales para bebe");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasMamaYBebePromocionesPraElCuidadoInfantil();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasMamaYBebePromosionesEnNutricionInfantil();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 3:
                                lita1.CategoriasMamaYBebePanalesPraBebe();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("1.- Promosiones En Suplementos Y Vitaminas");
                        System.out.println("2.- Suplementos Nutricionales");
                        System.out.println("3.- Suplementos / Complementos");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasNutricionParaTodosPromosionesEnSuplementosYVitaminas();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasNutricionParaTodosSuplementosNutricionales();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 3:
                                lita1.CategoriasNutricionParaTodosSuplementosComplementos();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 7:
                        System.out.println("1.- Promociones Dermocosmetica");
                        System.out.println("2.- Cuidado Capilar");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasDermatologiaCosmeticaPromocionesDermocosmetica();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasDermatologiaCosmeticaCuidadoCapilar();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    case 8:
                        System.out.println("1.- Promociones En Belleza ");
                        System.out.println("2.- Tintes para Cabello");
                        opcionFinal = ardilla.nextInt();
                        switch (opcionFinal) {
                            case 1:
                                lita1.CategoriasBellezaPromocionesEnBelleza();
                                lita1.comprarProducto(listaProducto);
                                break;
                            case 2:
                                lita1.CategoriasBellezaTintesParaCabello();
                                lita1.comprarProducto(listaProducto);
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Opcion no disponible");
                        break;
                }
                break;

            case 2:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 3:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 4:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 5:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 6:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 7:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 8:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 9:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 10:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 11:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;

            case 12:
                System.out.println("N   N   A   DDDD    A   ");
                System.out.println("NN  N  A A  D   D  A A  ");
                System.out.println("N N N AAAAA D   D AAAAA ");
                System.out.println("N  NN A   A D   D A   A ");
                System.out.println("N   N A   A DDDD  A   A ");
                break;
            case 13:
                chabots huevos1 = new chabots();
                huevos1.adrian();
                
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }


    public static void main(String[] args) {
        DAVID rata = new DAVID();
        rata.Inkafarma();
        rata.Crearcuenta();
        rata.Login();
        rata.Menu();
        rata.menu2();
    }
}
