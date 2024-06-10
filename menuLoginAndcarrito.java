public class menuLoginAndcarrito {

    public  void printMenu() {
        String[] categories = {"|1.- Categorías|\uD83D\uDD3D", "2.- Tienda deportiva|", "3.- Perú Pasión|", "4.- Dermocosmética|", "5.- Botiquín|", "6.- Belleza|",
                "7.- Fórmulas infantiles|", "8.- Bienestar|", "9.- Blog|", "|10.- Agora Club|", "|11.- Aliviamed|", "|12.- Catálogo|",};

        String[] icons = {"  ", "|❚█══█❚", "|\uD83D\uDC97", "|\uD83D\uDC85\uD83C\uDFFB", "|\uD83E\uDDF0", "|\uD83D\uDC51",
                "|\uD83C\uDF7C", "  |\uD83E\uDDD8\uD83C\uDFFB", "|\uD83D\uDCDD", "", "", ""};


        for (int i = 0; i < categories.length; i++) {
            System.out.printf("%s %s\t", icons[i], categories[i]);
            System.out.println("");
        }

    }
    public void loginAndCarrito(){
        System.out.println();
        System.out.printf("%160s %-30s", "|INCIA SESION|", "|\uD83D\uDED20|");

    }

    public static void main(String[] args) {
        menuLoginAndcarrito menu = new menuLoginAndcarrito();

        menu.printMenu();
        menu.loginAndCarrito();
    }
}
