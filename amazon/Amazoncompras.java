import java.util.Scanner;

public class Amazoncompras {
    pagotarjeta loro = new pagotarjeta();
    tracking huevo = new tracking();
    envio raton = new envio();



    public Scanner adrian;


    public String[] electronica = {
            "Estabilizador de cardán de 3 ejes para smartphone S/360.80 💻",
            "POPULO Kit de destornillador eléctrico de 4 V - S/139.08 📱",
            "Frameo - Marco de fotos digital con WiFi de 10.1 pulgadas- S/210.32 📷",
            "USB C Charger iPhone Charger Fast Charging 3Pack- S/71.56 🖥",
            "Cable Lightning [certificado Apple MFi] Cargador de iPhone - S/33.76📱",
            "Bose QuietComfort - Auriculares ultra inalámbricos con cancelación de ruido - S/1,809.42 🎧",
            "Canon EOS R6 Mark II RF24-4.134 in F4 L ES USM KIT - S/13,082.22 📷",
            "GearIT - Cable Ethernet Categoría 6: - S/227.54 ",
            "Auriculares TOZO T6 (edición clásica) True Wireless: - S/113.73 🎧",
            "STREBITO - Juego de destornilladores de precisión de 142 piezas: - S/118.07 ️",
            "samtechT Cerradura de puerta inteligente de entrada sin llave - S/337.59 ",
            "Plumero de aire comprimido 4.0, soplador de aire inalámbrico - S/109.59 ",
            "CCV Plumero de aire comprimido – Plumero eléctrico de aire: - S/324.83 ",
            "Juego de ajedrez electrónico - S/844.23 ",
            "FS FAHM iFixit Manta Kit de Driver – 112 Bit Driver Kit - S/258.82 📱",
            "Juego de destornilladores de precisión para reparación de teléfono, kit de reparación de bricolaje 130 en 1 - S/410 🖥️",
            "Apple Watch Series 6 - S/133.07 ⌚",
            "Elikliv EDM9 - Microscopio digital LCD de 7 pulgadas, 1200X - S/332.99 ",
            "Cable USB C a USB C, paquete de 5 cables de carga USB C de 6 pies- S/36.96 🖨️",
            "Barra de Sonido LG - S/328 🎶",
            "Smart TV Samsung - S/615 📺",
            "Monitor LG UltraWide - S/287 🖥️",
            "iPad Pro - S/369 📱",
            "Auriculares Sony WH-1000XM4 - S/123 🎧",
            "Drone DJI Mavic Air 2 - S/656 🚁",
            "Nintendo Switch - S/287 🎮",
            "Cámara Canon EOS Rebel T7 - S/410 📷",
            "Impresora Epson EcoTank - S/328 🖨️",
            "SSD Samsung 1TB - S/615 💾",
            "Xbox Series X - S/410 🎮",
            "Altavoces Bose SoundLink - S/205 🎶",
            "MacBook Pro - S/820 💻",
            "Google Pixel 5 - S/287 📱",
            "Monitor ASUS ROG Swift - S/410 🖥️",
            "Apple Watch Series 6 - S/328 ⌚",
            "Sony PlayStation 5 - S/492 🎮",
            "Impresora 3D Creality Ender 3 - S/287 🖨️",
            "Barra de Sonido LG - S/328 🎶"
    };

    public double[] electronicaPrecios = {
            360.80,139.08,210.32,71.56,33.76,1,809.42,13,082.22,227.54, 113.73,118.07,337.59,109.59,324.83,258.82,
            410, 492, 615, 287, 369, 123, 656, 287, 410, 328,
            615, 410, 205, 820, 287, 410, 328, 492, 287, 328
    };

    public String[] libros = {
            "Aprende español para adultos principiantes: 7 libros en 1: ¡Habla español en 30 días! S/133.08 📚",
            "Sabiduría Financiera: El Dinero se hace en la Mente: - S/55.12 📚",
            "Vivir en Plenitud - S/49.79  📚",
            "De Mí Para Mí, La Tormenta Pasará - S/64.02 📚",
            "Valentía (Spanish Edition) - S/51.89 📚",
            "Si lo crees, lo creas  S/0.00 gratis 📚",
            "Hábitos atómicos (Español neutro) - S/145.58",
            "Los cuatro acuerdos: una guía práctica para la libertad personal - S/34.41 📚",
            "Romper el círculo / It Ends with Us (Edición en español) - S/43.89 📚",
            "Padre Rico, Padre Pobre (Edición 25 Aniversario) - S/ 60.31📚",
            "Las mujeres que aman demasiado / Women Who Love Too Much - S/33.65 📚",
            "El Alquimista: Una Fábula Para Seguir Tus Sueños - S/37.61 📚",
            "El secreto de la paz personal - S/11.45 📚",
            "EL PODER DE ESTAR SOLO - S/45.79 📚",
            "Las Musas: Poesía entre cartas - S/45.92 📚",
            "Las mujeres que aman demasiado / Women Who Love Too Much - S/33.65 📚",
            "Querido yo: Vamos a estar bien - S/75.07 📚",
            "Cómo hacer que te pasen cosas buenas - S/86 📚",
            "Psicología oscura: Una guía esencial - S/51.76 📚",
            "Cómo ser la clave de tu éxito - S/37.84  📚",
            "EL PODER DEL PENSAMIENTO POSITIVO: - S/38.27 📚",
            "Decisiones que transforman / Transformational Decisions: - S/ 26.25 📚",
            "Detox De Dopamina: - S/26.77  📚",
            "Fabricante de lágrimas: - S/34.44 📚",
            "Los 7 Métodos Altamente Efectivos Para Aprender Inglés Fluido - S/71.21 📚",
            "Piense y Hágase Rico - S/ 33.0 📚",
            "EL PODER DE CREER EN TI: - S/69.36 📚",
            "Las mujeres que aman demasiado / Women Who Love Too Much - S/34.10 📚",
            "Las Meditaciones de Marco Aurelio: - S/29.23 📚",
            "Este dolor no es mío - S/105.92 📚",
            "Sabiduría Financiera: El Dinero se hace en la Mente - S/55.18 📚",
            "Inteligencia Emocional: 4 Libros en 1: - S/80.44   📚"
    };

    public double[] librosPrecios = {
            205, 123, 102, 82, 61, 74, 49, 41, 57, 115,
            90, 70, 65, 78, 131, 53, 45, 86, 98, 107
    };
    public String[] librosNino ={
            "¿Qué debería hacer Danny? (Serie El poder de elegir) - S/45.93",
            " animales grupo estrellitas.: libro para colorear, letra minúscula y mayúscula; para niños. (spanish edition) - S/22.99",
            "Eres un Niño Maravilloso y Único: Cuentos Infantiles fascinantes que inspiran Valor, Autosuficiencia y Confianza. +3 Bonos Exclusivos (Spanish Edition)\n" +
                    "Edición en Español - S/38.31",
            "Eres un Chico Fantástico: Historias inspiradoras sobre el valor, la fuerza interior y la confianza en sí mismo (Spanish Edition) - S/44.03 ",
            "Mis sentimientos me hacen más fuerte: Libro para niños sobre los sentimientos que enseña a identificar y expresar las grandes emociones  - S/51.36",
            "Libro en español para niños: Estimulación de lenguaje: de 2-5 años: juegos didácticos para niños de 3 años - S/34.52",
            "La perseverancia me hace más fuerte: Libro de las emociones para niños sobre autoconfianza, gestión de la frustración, autoestima y mentalidad de crecimiento - S/45.25",
            "Aprender a Escribir Letras y Números Para Niños: Libro de actividades preescolar: Libro de escritura para niños +3 años S/25.86",
            "Naciste para brillar: Inspirador libro infantil para potenciar la autoestima de las niñas. Perfecto para niñas a partir de 6 años. (Libros motivacionales para niños y niñas)- S/34.63",
            "Libro de aprendizaje en español e inglés para niños de 2, 3, 4, 5, 6 años, más de 420 palabras, juguetes de aprendizaje para aprender español, libros interactivos de audio parlantes, juguete -S/99.86",
            "Eres un Chico Fantástico: Historias inspiradoras sobre el valor, la fuerza interior y la confianza en sí mismo - S/44.03",
            "La perseverancia me hace más fuerte: Libro de las emociones para niños sobre autoconfianza, gestión de la frustración, autoestima y mentalidad de crecimiento - S/45.25",
            "La oruga muy hambrienta: Spanish board book - S/29.93",



    };
    public double [] librosNinosPrecios={
            45.93,22.99,38.31,44.03,51.36,34.52,45.25,25.86,34.63,99.86,44.03,45.25,29.93
    };
    public String[] ropa = {
            "Camisa Polo - S/82 👕",
            "Jeans Levi's - S/205 👖",
            "Zapatos Adidas - S/328 👟",
            "Sombrero de Paja - S/123 🎩",
            "Bufanda de Lana - S/102 🧣",
            "Guantes de Cuero - S/184 🧤",
            "Gafas de Sol Ray-Ban - S/615 🕶️",
            "Chaqueta de Cuero - S/820 🧥",
            "Gorro de Lana - S/143 🧢",
            "Botas Timberland - S/492 🥾",
            "Mochila North Face - S/328 🎒",
            "Pantalones Cargo - S/225 👖",
            "Abrigo de Invierno - S/738 🧥",
            "Sandalias Birkenstock - S/369 👡",
            "Chaqueta de Mezclilla - S/307 👕",
            "Blusa de Seda - S/266 👚"
    };

    public double[] ropaPrcios = {
            82, 205, 328, 123, 102, 184, 615, 820, 246, 143, 492, 328, 225, 738, 369, 307, 266
    };


    public String[] hogarjardin = {
            "Sofá Seccional - S/2460 🛋️",
            "Mesa de Comedor - S/1640 🍽️",
            "Juego de Sala de Patio - S/820 🛋️",
            "Cama King Size - S/1230 🛏️",
            "Escritorio de Oficina - S/492 🪑",
            "Lámpara de Pie - S/328 💡",
            "Mesa de Centro - S/287 🪑",
            "Silla Ergonómica - S/410 🪑",
            "Estantería Modular - S/123 📚",
            "Mesa de Noche - S/205 🪑",
            "Alfombra - S/369 🪑",
            "Cortinas - S/82 🪟",
            "Plantas de Interior - S/123 🌿",
            "Set de Herramientas de Jardín - S/205 🛠️",
            "Asador de Carbón - S/615 🍖",
            "Columpio de Jardín - S/820 🌳",
            "Piscina Inflable - S/820 🏊‍♂️",
            "Barbacoa de Gas - S/2460 🍖",
            "Fuente de Agua - S/820 ⛲",
            "Mesa de Picnic - S/1230 🍽️"
    };

    public double[] hogarjardinprecio = {
            2460, 1640, 820, 1230, 492, 328, 287, 410, 123, 205,
            369, 82, 123, 205, 615, 820, 820, 2460, 820, 1230
    };

    public String[] deporte = {
            "Bicicleta Estática - S/820 🚴",
            "Pesas y Mancuernas - S/615 🏋️",
            "Cinta de Correr - S/2460 🏃",
            "Guantes de Boxeo - S/410 🥊",
            "Pelota de Yoga - S/164 🧘",
            "Balón de Fútbol - S/287 ⚽",
            "Raqueta de Tenis - S/287 🎾",
            "Colchoneta de Gimnasio - S/410 🧘",
            "Bádminton Set - S/82 🏸",
            "Balón Medicinal - S/820 🏀",
            "Tabla de Surf - S/738 🏄‍♂️",
            "Cuerda para Saltar - S/123 🏃",
            "Bolso de Gimnasio - S/164 🎒",
            "Ropa Deportiva - S/410 👕",
            "Pistola de Paintball - S/246 💥",
            "Gafas de Natación - S/82 🏊‍♂️",
            "Esterilla de Yoga - S/123 🧘",
            "Bicicleta de Montaña - S/287 🚵‍♂️",
            "Máquina de Remo - S/328 🚣",
            "Equipo de Escalada - S/410 🧗"
    };

    public double[] deportePrecio = {
            820, 615, 2460, 410, 164, 287, 287, 410, 82, 820,
            738, 123, 164, 410, 246, 82, 123, 287, 328, 410
    };

    public String[] accesoriosdecasa = {
            "Refrigeradora LG - S/2460 🧊",
            "Lavadora Samsung - S/1640 🧺",
            "Microondas Panasonic - S/820 🍽️",
            "Licuadora Oster - S/123 🥤",
            "Batidora KitchenAid - S/492 🍰",
            "Cafetera Nespresso - S/328 ☕",
            "Aspiradora Dyson - S/287 🧹",
            "Horno Eléctrico - S/410 🍳",
            "Freidora de Aire - S/123 🍟",
            "Plancha de Vapor - S/205 👔",
            "Exprimidor de Jugos - S/369 🍊",
            "Dispensador de Agua - S/82 🚰",
            "Robot de Cocina - S/1230 🤖",
            "Secadora de Ropa - S/2050 🧴",
            "Máquina de Helados - S/615 🍦",
            "Molinillo de Café - S/820 ☕",
            "Tostadora de Pan - S/820 🍞",
            "Batidora de Mano - S/246 🥣",
            "Barra de Sonido - S/410 🎶",
            "Filtro de Agua - S/820 💧"
    };

    public double[] accesoriosdecasaprecio = {
            2460, 1640, 820, 123, 492, 328, 287, 410, 123, 205,
            369, 82, 1230, 2050, 615, 820, 820, 246, 410, 820
    };

    public String[] juguetes = {
            "LEGO Star Wars - S/820 🪐",
            "Muñeca Barbie - S/615 👩‍🦰",
            "Carro de Control Remoto - S/246 🚗",
            "Set de Trenes - S/410 🚂",
            "Rompecabezas 1000 Piezas - S/164 🧩",
            "Peluche Gigante - S/287 🧸",
            "Juego de Mesa Monopoly - S/287 🎲",
            "Pista de Carreras - S/410 🏎️",
            "Consola de Videojuegos - S/820 🎮",
            "Patineta - S/369 🛹",
            "Kit de Ciencia - S/738 🔬",
            "Dron para Niños - S/123 🚁",
            "Juguete Educativo - S/164 📚",
            "Pelota de Fútbol - S/410 ⚽",
            "Muñeco de Acción - S/246 🦸‍♂️",
            "Kit de Arte y Manualidades - S/820 🎨",
            "Casa de Muñecas - S/820 🏠",
            "Tablero de Dardos - S/246 🎯",
            "Set de Cocina de Juguete - S/410 🍳",
            "Puzzle de Dinosaurios - S/287 🦖"
    };

    public double[] juguetesprecio = {
            820, 615, 246, 410, 164, 287, 287, 410, 820, 369,
            738, 123, 164, 410, 246, 820, 820, 246, 410, 287
    };
    public String [] SaludBelleza = {
            "Cleverfy Vaporizadores de ducha para aromaterapia, paquete de 18 bombas de ducha con aceites esenciales. Cuidado personal y relajación, regalos de cumpleaños para mujeres y hombres. Juego morado - S/92.46",
            "Beauty of Joseon Máscara de brillo de arroz molido y miel Cuidado de sebo de poros para piel sensible seca Cuidado de la piel coreana 5.1 fl oz, 5.07 fl.oz - S/66.60",
            "Gorro para aliviar la migraña, gorro para aliviar el dolor de cabeza y migraña. Alivio del dolor de cabeza con gel caliente/frío, bolsa de hielo con cara y ojos, máscara de compresión negraGorro para aliviar la migraña, gorro para aliviar el dolor de cabeza y migraña. Alivio del dolor de cabeza con gel caliente/frío, bolsa de hielo con cara y ojos, máscara de compresión negra  - S/62.72",

    };
    public double [] saludBellezaPrecio = {
            92.46,66.60,62.72
    };
    public double totalCompra;

    public Amazoncompras() {
        this.adrian = new Scanner(System.in);
        this.totalCompra = 0.0; // Inicializamos el total de la compra en 0
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido a Amazon");
        System.out.println("1. Electrónicos 💻");
        System.out.println("2. Libros 📚");
        System.out.println("3. Ropa y Accesorios 👕");
        System.out.println("4. Hogar y Jardín 🏡");
        System.out.println("5. Deportes y Fitness 🏋️");
        System.out.println("6. Electrodomésticos 🍳");
        System.out.println("7. Juguetes y Juegos 🎲");
        System.out.println("8. Salud y Belleza 💅");
        System.out.println("9. Total a pagar");
        System.out.println("10. Rastrea tu pedido");
        System.out.println("11. Pagar");
        System.out.println("12. Salir ❌");
        System.out.println("13. BUSCADOR");
        System.out.print("Seleccione una opción: ");
    }


    public void mostrarProductos(String[] productos, double[] precios) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }
        System.out.println((productos.length + 1) + ". Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = adrian.nextInt();
        adrian.nextLine();

        if (opcion > 0 && opcion <= productos.length) {
            double precioProducto = precios[opcion - 1];
            System.out.println("Ha seleccionado " + productos[opcion - 1] + " por S/ " + precioProducto);
            this.totalCompra += precioProducto;
        } else if (opcion == productos.length + 1) {

        } else {
            System.out.println("Opción inválida.");
        }
    }



    public void comprarMenu() {
        System.out.println("Ha seleccionado comprar el producto seleccionado.");
    }

    public void comprarExtra() {
        System.out.println("Ha seleccionado comprar accesorios adicionales.");
    }

    public void mostrarTotalPagar() {
        System.out.println("Total a pagar: S/ " + this.totalCompra);
    }
    public String aea(){
        int opcion;
        do {
            mostrarMenu();
            opcion = adrian.nextInt();
            adrian.nextLine();

            switch (opcion) {
                case 1:
                    mostrarProductos(electronica,electronicaPrecios);
                    break;
                case 2:
                    System.out.println("subcategoria de libros");
                    System.out.println("1. libro para adultos ");
                    System.out.println("2. libros para niños");
                    System.out.println("selecciona una opcion");
                    int opcionelibros = adrian.nextInt();
                    switch (opcionelibros){
                        case 1:
                            mostrarProductos(libros,librosPrecios);
                            break;
                        case 2:
                            mostrarProductos(librosNino, librosNinosPrecios);
                            break;
                        default:
                            System.out.println("opcion invalida");
                            break;
                    }
                    break;
                case 3:

                    mostrarProductos(ropa, ropaPrcios);
                    break;
                case 4:
                    mostrarProductos(hogarjardin, hogarjardinprecio);
                    break;
                case 5:
                    mostrarProductos(deporte, deportePrecio);
                    break;
                case 6:
                    mostrarProductos(accesoriosdecasa, accesoriosdecasaprecio);
                    break;
                case 7:
                    mostrarProductos(juguetes, juguetesprecio);
                    break;
                case 8:mostrarProductos(SaludBelleza, saludBellezaPrecio);
                    break;
                case 9:
                    mostrarTotalPagar();
                    break;
                case 10:
                    huevo.track();
                    break;
                case 11:
                    if(totalCompra == 0){
                        System.out.println("¡Aun no tenes nada en el carrito, agrega algo para continuar! ");
                    }else{
                        mostrarTotalPagar();
                        System.out.println("Primero ingresa tu direccion de envio");
                        raton.envi();
                        System.out.println("Ingresa tu informacion de facturacion");
                        loro.Datos();
                        if(totalCompra == 40000.0){
                            System.out.println("Fondos insuficientes, ingrese otro metodo de pago");
                        }else{
                            raton.imprimir();
                            loro.Pagorealizado();
                        }
                    }
                    break;
                case 12:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                case 13:
                    buscador();
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
                    break;
            }
        } while (opcion != 12);
        adrian.close();
        return null;

    }




    public void buscarProducto(String productoBuscado) {
        boolean encontrado = false;

        for (int i = 0; i < electronica.length; i++) {
            if (electronica[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en electrónicos:");
                System.out.println(electronica[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + electronicaPrecios[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < libros.length; i++) {
            if (libros[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en libros:");
                System.out.println(libros[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + librosPrecios[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < librosNino.length; i++) {
            if (librosNino[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en libros de niños:");
                System.out.println(librosNino[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + librosNinosPrecios[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < ropa.length; i++) {
            if (ropa[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en ropa:");
                System.out.println(ropa[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + ropaPrcios[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < hogarjardin.length; i++) {
            if (hogarjardin[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en hogar jardin:");
                System.out.println(hogarjardin[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + hogarjardinprecio[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < deporte.length; i++) {
            if (deporte[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en deporte:");
                System.out.println(deporte[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + deportePrecio[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < accesoriosdecasa.length; i++) {
            if (accesoriosdecasa[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en accesorios de casa:");
                System.out.println(accesoriosdecasa[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + accesoriosdecasaprecio[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < juguetes.length; i++) {
            if (juguetes[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en juguetes:");
                System.out.println(juguetes[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + juguetesprecio[i]);
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < SaludBelleza.length; i++) {
            if (SaludBelleza[i].toLowerCase().contains(productoBuscado.toLowerCase())) {
                System.out.println("------------------------------------");
                System.out.println("Producto encontrado en Salud y belleza:");
                System.out.println(juguetes[i]);
                System.out.println("------------------------------------");
//                System.out.println("Precio: S/ " + saludBellezaPrecio[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("--------------------------------------------------");
            System.out.println("Producto no encontrado XD");
            System.out.println("En el siguiente link encontraras mas info sobre lo que buscas...");
            System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            System.out.println("--------------------------------------------------");
        }
    }
    public void buscador(){
        Amazoncompras catalogo = new Amazoncompras();
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el producto a buscar");
        String buscar = input.nextLine();
        catalogo.buscarProducto(buscar);
    }




    public static void main(String[] arg) {

        Amazoncompras catalogo = new Amazoncompras();
        Amazon ronaldo = new Amazon();
        Acoount acoountLeo = new Acoount();
//        acoountLeo.opciones();
        ronaldo.iniciar();
        catalogo.aea();

    }
}