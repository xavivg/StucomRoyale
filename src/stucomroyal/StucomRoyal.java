package stucomroyal;

/**
 *
 * @author usu26
 */
public class StucomRoyal {

    private static ListaJugador listaJugador = new ListaJugador();
    private static ListaCartas listaCartasGlobales = new ListaCartas();
    private static ListaCartas cartasBatallaJugadorUno = new ListaCartas();
    private static ListaCartas cartasBatallaJugadorDos = new ListaCartas();
    //Crear jugadores
    private static Jugador dalas = new Jugador("Dalas", "amiguitosmios", 4);
    private static Jugador ivan = new Jugador("Ivan", "ivanyvienen", 6);
    private static Jugador alfredo = new Jugador("Alfredo", "maduro", 3);
    private static Jugador brian = new Jugador("Brian", "designer", 5);

    //Crear Cartas
    //Carta tropa
    public static void main(String[] args) {
        // TODO code application logic here
        listaJugador.getLista().add(dalas);
        listaJugador.getLista().add(ivan);
        listaJugador.getLista().add(alfredo);
        listaJugador.getLista().add(brian);

        mostrarmenu();
        int opcion = 0;
        do {
            switch (opcion) {
                case 1:
                    //conseguirCartas
                    break;

                case 2:
                    //batalla
                    break;
                case 3:
                    //ranking jugadores por trofeos desc
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
            }
        } while (opcion != 4);

    }

    public static void mostrarmenu() {
        System.out.println("1· Conseguir cartas");
        System.out.println("2· Batalla");
        System.out.println("3· Ranking por trofeos");
        System.out.println("4· Exit");
    }

}
