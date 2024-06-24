import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeProductos {
    Scanner input = new Scanner(System.in);
    void CategoriasInkaPacksPacksDeFarmacia(){
        //        Categorias / InkaPacks / Packs de Farmacia
        List<Producto> listaProducto = new ArrayList<Producto>();

        listaProducto.add(new Producto("1. Pack Vick Vaporub Ungüento 50 Gr + Vitapyrena Forte",18.70));
        listaProducto.add(new Producto("2. Pack Vick Vaporub Ungüento 110 Gr + Vitapyrena Forte",23.50));
        listaProducto.add(new Producto("3. Pack Hidratante y Limpiador Cetaphil Pro",217.00));
        listaProducto.add(new Producto("4. Pack Espuma de Limpieza y Loción Hidratante",201.10));
        listaProducto.add(new Producto("5. Pack Loción de Limpieza y Loción Ultra",206.70));
        listaProducto.add(new Producto("6. Pack Clearblue Plus Test Embarazo - 2 UN",30.90));
        listaProducto.add(new Producto("7. Pack Vick 44 Jarabe Sabor Cereza 120 ML",61.80));
        listaProducto.add(new Producto("8. Pack Vick 44 Jarabe Sabor Cereza 120 ML",30.00));
        listaProducto.add(new Producto("9. Pack Vick VapoRub Ungüento 100 Gr",24.60));
        listaProducto.add(new Producto("10. Pack Vick VapoRub 100 Gr + Vick Primera ",33.30));
        listaProducto.add(new Producto("11.Pack Vick VapoRub 100 Gr + Vick 44 Jarabe",27.60));
        listaProducto.add(new Producto("12. Pack Vick VapoRub 50 Gr + Defensa Solución Nasal 15 ML",28.90));
        listaProducto.add(new Producto("13. Pack Desenfriol Comprimido Recubierto + Redoxon",70.12));
        listaProducto.add(new Producto("14. Pack 1 Crema Regeneradora Bepanthen 100Gr + 1 Crema",94.00));
        listaProducto.add(new Producto("15. Pack 03 Bepanthen Baby Crema protectora",80.40));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    public  void comprarProducto(List<Producto> listaProducto) {

        System.out.println("\nIngrese el número del producto que desea comprar:");
        int numeroProducto = input.nextInt();
        if (numeroProducto > 0 && numeroProducto <= listaProducto.size()) {
            Producto productoSeleccionado = listaProducto.get(numeroProducto - 1);
            System.out.println("Ingrese la cantidad que desea comprar:");
            int cantidad = input.nextInt();
            calcularIgvProducto igv = new calcularIgvProducto(cantidad, productoSeleccionado.getProducto(), productoSeleccionado.getCosto());
            igv.verFactura();
            System.out.println("Metodo de pago tarjeta");
            pagotarjeta pagotarjeta = new pagotarjeta();
            pagotarjeta.Datos();
            pagotarjeta.pagotarjeta();
            pagotarjeta.Pagorealizado();
            System.exit(0);
        } else {
            System.out.println("Número de producto no válido.");
        }

    }



    void CategoriasInkaPacksPacksDeAdultoMayo(){

        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Pack Pañales para Adulto Cotidian Premium Talla M",112.90));
        listaProducto.add(new Producto("2. Pack Pañales para Adulto Cotidian Premium Talla G",112.90));
        listaProducto.add(new Producto("3. Pack 02 Ropa Interior Desechable Tena Pants",120.80));
        listaProducto.add(new Producto("4. Pack 02 Pañales de Adulto TENA Slip Ultra",118.80));
        listaProducto.add(new Producto("5. Pack 02 Pañales de Adulto TENA Slip",134.00));
        listaProducto.add(new Producto("6.Pack 02 Ropa Interior Desechable TENA ",62.80));
        listaProducto.add(new Producto("7. Pack 03 Toallas Higiénicas TENA ",69.30));
        listaProducto.add(new Producto("8. Pack 03 Toallas Higiénicas TENA Discreet Maxi",95.70));
        listaProducto.add(new Producto("9. Pack Pañales de adulto Secos premium",118.90));
        listaProducto.add(new Producto("10. Pack Ropa Interior de adulto Secos",51.50));

        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasInkaPacksPacksDeNutricionYbienestar(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Pack 02 Similac 3 HMO en Polvo 2.1 KG",334.90));
        listaProducto.add(new Producto("2. Pack 3 Ensure Advance Vainilla 1.4 KG",691.60));
        listaProducto.add(new Producto("3. Pack 01 Glucerna vainilla + 03",173.5));
        listaProducto.add(new Producto("4. Pack 01 Pediasure Triplesure Vainilla",191.50));
        listaProducto.add(new Producto("5. Pack 03 Complex Beauty Sunvit",49.90));

        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }



    void CategoriasPeruPasionNutricion(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Espirulina Orgánica Premium Muru Green",69.00));
        listaProducto.add(new Producto("2. Chocolate Kanka 55% Cacao 70gr",18.90));
        listaProducto.add(new Producto("3. Chocolate Kanka 72% Cacao 70gr",18.90));
        listaProducto.add(new Producto("4. Mantequilla de Maní Crunch con Sal de Maras",24.90));
        listaProducto.add(new Producto("5. Café Verde en Polvo 300 g Pakari Superfoods",59.90));

        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);

    }

    void CategoriasPerupasionHigieneYCuidadoPersonal(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Cepillo Ovalado The Ecobag Company Bambú",49.00));
        listaProducto.add(new Producto("2. Cepillo Dental de Bambú The Ecobag",15.00));
        listaProducto.add(new Producto("3. Acondicionador Sólido de Café Bionuna",35.00));
        listaProducto.add(new Producto("4. Gel de Baño Natural Saysi Modelador",65.00));
        listaProducto.add(new Producto("5. Gel de Baño Natural Saysi Suavizante (Rosas)",59.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    void CategoriasPerupasionDispositivosOrtopedicos(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Faja Dorso Lumbar Unisex Skeleton ",18.00));
        listaProducto.add(new Producto("2. Almohada Lumbar para Dormir",130.00));
        listaProducto.add(new Producto("3. Cojin Lumbar con Gel Ortopedico",79.90));
        listaProducto.add(new Producto("4. Almohada Viscoelástica",115.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    void CategoriasFarmaciaDolorGeneralisado(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Doloral 100mg/5ml Suspensión Oral",12.10));
        listaProducto.add(new Producto("2. Miodel Relax NF 450mg+35mg",79.70));
        listaProducto.add(new Producto("3. Reumafrost NF Ungüento",16.70));
        listaProducto.add(new Producto("4. Reumafrost NF Ungüento",21.50));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasFarmaciasResfriadoComun(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Panadol Antigripal NF Tableta",2.28));
        listaProducto.add(new Producto("2. Vick Vaporub Ungüento tópico",2.80));
        listaProducto.add(new Producto("3. Abrilar EA 575 Jarabe",23.10));
        listaProducto.add(new Producto("4. Panadol Forte Tableta",1.80));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasFarmaciaColicosMenstruales(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Ponstan Rd 220mg Tableta recubierta",7.79));
        listaProducto.add(new Producto("2. Anaflex Mujer NF 200mg Cápsula Blanda",8.85));
        listaProducto.add(new Producto("3. Tapsin Periodo 500 mg + 150 mg Tableta Recubierta",8.00));
        listaProducto.add(new Producto("4. Evecare Cápsulas",69.10));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasSaludCuidadoDeLaMujer() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Cluvax Cápsula Blanda Vaginal - Caja 3 UN",31.30));
        listaProducto.add(new Producto("2. Gynocanesten 1% Crema Vaginal",40.70));
        listaProducto.add(new Producto("3. Clindess Duo 100 Mg - 400 Mg Óvulo Vaginal",82.50));
        listaProducto.add(new Producto("4. Volusol 2 % Crema Vaginal - Tubo 15 G",64.10));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }
    void CategoriasSaludCuidadoDermatologo() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Minoxidil 5% Solución Cutánea",41.70));
        listaProducto.add(new Producto("2. Terbinafina 250mg Tableta",91.20));
        listaProducto.add(new Producto("3. Oxobroncol Adulto 150mg/15ml Jarabe",23.70));
        listaProducto.add(new Producto("4. Oxoeli Pediátrico 28mg/5ml",16.60));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasSaludAntineoplasicosInmunomoduladores() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Lorelina Depot 3.75mg Polvo para suspensión inyectable",295.20));
        listaProducto.add(new Producto("2. Tamoxifeno ACF 20mg Tableta",55.71));
        listaProducto.add(new Producto("3. Flutamida IDQ 250mg Tableta",152.91));
        listaProducto.add(new Producto("4. Vincristina PMG mg Solución Inyectable",240.30));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasMamaYBebePromocionesPraElCuidadoInfantil() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Pañales Huggies XXG Bigpack Natural Care",58.90));
        listaProducto.add(new Producto("2. Pañales Ninet Talla XL - Bolsa 48 UN",42.90));
        listaProducto.add(new Producto("3. Toallas Húmedas Huggies One&Done",26.50));
        listaProducto.add(new Producto("4. Pañales Huggies XG Bigpack",60.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasMamaYBebePromosionesEnNutricionInfantil() {
        List<Producto> listaProducto = new ArrayList<>();

        listaProducto.add(new Producto("1. Enfagrow Premium Pro Mental Niños",174.90));
        listaProducto.add(new Producto("2. Pack Pediasure Triplesure Sabor Chocolate 1.6 KG",314.90));
        listaProducto.add(new Producto("3. Pack Pediasure Triplesure Sabor Vainilla 1.6 KG",314.90));
        listaProducto.add(new Producto("4. Enfagrow Premium Pro Mental Sabor Natural",174.90));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasMamaYBebePanalesPraBebe() {
        List<Producto> listaProducto = new ArrayList<>();

        listaProducto.add(new Producto("1. Pañal Pampers Premium Care Talla XXG",83.90));
        listaProducto.add(new Producto("2. Pañales Huggies XXG Bigpack Natural Care",58.90));
        listaProducto.add(new Producto("3. Pañales Ninet Talla XL - Bolsa 48 UN",42.90));
        listaProducto.add(new Producto("4. Pañal Ninet Bebe Talla XXL - Bolsa 44 UN",42.90));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasNutricionParaTodosPromosionesEnSuplementosYVitaminas() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Creatine unflavored Polvo para Solución Oral",129.90));
        listaProducto.add(new Producto("2. Pack 2 Lipo 6 Black Nutrex Ultra Concentrate",219.90));
        listaProducto.add(new Producto("3. Pack 02 Vital Vitaminado Gluco Control",159.80));

        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasNutricionParaTodosSuplementosNutricionales() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Ensure Polvo Sabor Vainilla - Lata 850 G",100.90));
        listaProducto.add(new Producto("2. Ensure Advance Sabor Chocolate 400 gr",60.00));
        listaProducto.add(new Producto("3. Ensure Advance Sabor Chocolate - Lata 850 g",102.90));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }


    void CategoriasNutricionParaTodosSuplementosComplementos() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Ensure Polvo Sabor Vainilla - Lata 850 G",109.90));
        listaProducto.add(new Producto("2. Geriaplus Inmunoact Polvo Sabor platano",89.90));
        listaProducto.add(new Producto("3. Blemil Plus 2 Arroz Hidrolizado",95.00));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasDermatologiaCosmeticaPromocionesDermocosmetica() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Solución Micelar Bioderma Sébium H2O",103.90));
        listaProducto.add(new Producto("2. Gel De Limpieza Moussant Sébium Bioderma",70.80));
        listaProducto.add(new Producto("3. Crema Antienvejecimiento Mesoses Sesderma Suprema",172.5));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasDermatologiaCosmeticaCuidadoCapilar() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Shampoo Eucerin DermoCapillaire",105.22));
        listaProducto.add(new Producto("2. Pack Shampoo Anticaída Hair Capilar Seskavel",301.00));
        listaProducto.add(new Producto("3. Celamina Ultra Shampoo",96.50));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasBellezaPromocionesEnBelleza() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Serum Facial Revitalift L'Oreal Paris Skin Care",84.90));
        listaProducto.add(new Producto("2. Crema Facial Hidratante de Día Garnier Skin ",26.90));
        listaProducto.add(new Producto("3. Sérum Anti Manchas de Noche Garnier",59.90));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    void CategoriasBellezaTintesParaCabello() {
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("1. Tinte Koleston 30 Castaño Oscuro",33.90));
        listaProducto.add(new Producto("2. Tinte Koleston 67 Chocolat",33.90));
        listaProducto.add(new Producto("3. Tinte para Cabello Excellence #1 Negro - Kit 1 UN",32.90));
        for (int i = 0 ; i < listaProducto.size() ; i ++){

            System.out.printf("%-60s = s/.%.2f%n",listaProducto.get(i).getProducto(), listaProducto.get(i).getCosto());
        }
        comprarProducto(listaProducto);
    }

    String FINAL(){
        return "Gracias por la compra";
    }







    public static void main(String[] args) {

//        List<Producto> listaProducto;
//        new ArrayList<Producto> ();
ListaDeProductos categorias = new ListaDeProductos();
categorias.CategoriasInkaPacksPacksDeFarmacia();
categorias.CategoriasInkaPacksPacksDeAdultoMayo();
//        try




    }
}
