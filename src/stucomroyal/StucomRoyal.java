package stucomroyal;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;

public class StucomRoyal {

    private static ListaJugador listaJugador = new ListaJugador();
    private static ListaCartas listaCartasGlobales = new ListaCartas();
    private static ListaCartas cartasBatallaJugadorUno = new ListaCartas();
    private static ListaCartas cartasBatallaJugadorDos = new ListaCartas();
    //Crear jugadores
    private static Jugador dalas = new Jugador("Dalas", "amiguitosmios", 0);
    private static Jugador ivan = new Jugador("Ivan", "ivanyvienen", 0);
    private static Jugador alfredo = new Jugador("Alfredo", "maduro", 0);
    private static Jugador brian = new Jugador("Brian", "designer", 0);

    //Crear Cartas
    //Carta Dalas
    private static CartaTropa tropaDalas = new CartaTropa("TropaD1", 4, 100, 100);
    private static CartaTropa tropaDalas2 = new CartaTropa("TropaD2", 4, 100, 100);
    private static CartaEstructura estructuraDalas = new CartaEstructura("estructuraD1", 4, 20, 40);
    private static CartaEstructura estructuraDalas2 = new CartaEstructura("estructuraD2", 3, 100, 100);
    private static CartaHechizo hechizoDalas = new CartaHechizo("HechizoD1", 4, "mode", 100, 100);
    private static CartaHechizo hechizoDalas2 = new CartaHechizo("HechizoD2", 4, "mode", 100, 100);
    //carta Ivan
    private static CartaTropa tropaIvan = new CartaTropa("TropaI1", 4, 100, 100);
    private static CartaEstructura estructuraIvan = new CartaEstructura("estructuraI1", 4, 100, 100);
    private static CartaHechizo hechizoIvan = new CartaHechizo("HechizoI1", 4, "mode", 100, 100);
    //carta Alfredo
    private static CartaTropa tropaAlfredo = new CartaTropa("TropaA1", 4, 100, 100);
    private static CartaEstructura estructuraAlfredo = new CartaEstructura("estructuraA1", 4, 100, 100);
    private static CartaHechizo hechizoAlfredo = new CartaHechizo("HechizoA1", 4, "mode", 100, 100);
    //carta Brian
    private static CartaTropa tropaBrian = new CartaTropa("TropaB1", 4, 100, 100);
    private static CartaEstructura estructuraBrian = new CartaEstructura("estructuraB1", 4, 100, 100);
    private static CartaHechizo hechizoBrian = new CartaHechizo("HechizoB1", 4, "mode", 100, 100);

    public static void main(String[] args) {
        // TODO code application logic here
        listaJugador.getLista().add(dalas);
        listaJugador.getLista().add(ivan);
        listaJugador.getLista().add(alfredo);
        listaJugador.getLista().add(brian);

        //TODO poner cartas al arraylist generico
        listaCartasGlobales.getLista().add(tropaDalas);
        listaCartasGlobales.getLista().add(estructuraDalas);
        listaCartasGlobales.getLista().add(hechizoDalas);

        listaCartasGlobales.getLista().add(tropaIvan);
        listaCartasGlobales.getLista().add(estructuraIvan);
        listaCartasGlobales.getLista().add(hechizoIvan);

        listaCartasGlobales.getLista().add(tropaAlfredo);
        listaCartasGlobales.getLista().add(estructuraAlfredo);
        listaCartasGlobales.getLista().add(hechizoAlfredo);

        listaCartasGlobales.getLista().add(tropaBrian);
        listaCartasGlobales.getLista().add(estructuraBrian);
        listaCartasGlobales.getLista().add(hechizoBrian);

        //add cards to <list cartas> of each player
        dalas.getListaCartas().addCard(tropaDalas);
        dalas.getListaCartas().addCard(tropaDalas2);
        dalas.getListaCartas().addCard(estructuraDalas);
        dalas.getListaCartas().addCard(estructuraDalas2);
        dalas.getListaCartas().addCard(hechizoDalas);
        dalas.getListaCartas().addCard(hechizoDalas2);

        ivan.getListaCartas().addCard(tropaIvan);
        ivan.getListaCartas().addCard(estructuraIvan);
        ivan.getListaCartas().addCard(hechizoIvan);

        alfredo.getListaCartas().addCard(tropaAlfredo);
        alfredo.getListaCartas().addCard(estructuraAlfredo);
        alfredo.getListaCartas().addCard(hechizoAlfredo);

        brian.getListaCartas().addCard(tropaBrian);
        brian.getListaCartas().addCard(estructuraBrian);
        brian.getListaCartas().addCard(hechizoBrian);

        mostrarmenu();
        int opcion = 0;
        do {
            opcion = tools.InputData.pedirEntero("Introduce una opción");
            switch (opcion) {
                case 1:
                    conseguirCartas();
                    break;

                case 2:
                    //batalla
                    getPlayers();
                    break;
                case 3:
                    //ranking jugadores por trofeos desc
                    Ranking();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
            }
        } while (opcion != 4);

    }

    public static void conseguirCartas() {//case 1
        Jugador jugador = getJugador();

        if (jugador != null) {
            validUserCards(jugador);
        } else {
            System.out.println("No valido!");
        }
    }
    public static void getPlayers() {//case 2
        Jugador jugadorUno = getJugador();
        if (jugadorUno == null || jugadorUno.getListaCartas().getLista().size() != 6) {
            System.out.println("Algo salió mal con el jugador 1...");
            if (jugadorUno.getListaCartas().getLista().size() != 6) {
                System.out.println("El jugador 1 no tiene el numero de cartas necesarias para empezar!");
            }
        } else {
            Jugador jugadorDos = getJugador();
            if (jugadorDos == null || jugadorDos.getListaCartas().getLista().size() != 6) {
                System.out.println("Algo salió mal con el jugador 2...");
                if (jugadorDos.getListaCartas().getLista().size() != 6) {
                    System.out.println("El jugador 2 no tiene el numero de cartas necesarias para empezar!");
                }
            } else {
                //Login Valido
                //Seleccionamos cartas de cada jugador
                getCartasBatalla(jugadorUno, jugadorDos);
            }
        }

    }
    public static void getCartasBatalla(Jugador jugadorUno, Jugador jugadorDos) {
        
            System.out.println("Preparando batalla...");
            cartasBatallaJugadorUno = llenaArraysBatalla(jugadorUno);//obtener cartas y guadarlas en un array para después recrear batalla
            cartasBatallaJugadorDos = llenaArraysBatalla(jugadorDos);
            System.out.println("Mazo de batalla de " + jugadorUno.getNombre());
            System.out.println(cartasBatallaJugadorUno);
            System.out.println("Mazo de batalla de " + jugadorDos.getNombre());
            System.out.println(cartasBatallaJugadorDos);
            System.out.println("-------------Empezamos!---------------");

            simularBatalla(jugadorUno,jugadorDos);
    }
    public static ListaCartas llenaArraysBatalla(Jugador jugador){
        ListaCartas cartasBatalla = new ListaCartas();
        int contCarta = 0;
        String cardName = "";
        System.out.println("Jugador: " + jugador.getNombre() + ", selecciona 3 cartas. Aqui tienes tu lista:");
        
        for (Carta cartaActual : jugador.getListaCartas().getLista()) {
            if (cartaActual instanceof CartaEstructura) {
                System.out.println(contCarta + ")" + cartaActual.toString());
            }
            if (cartaActual instanceof CartaHechizo) {
                System.out.println(contCarta + ")" + cartaActual.toString());
            }
            if (cartaActual instanceof CartaTropa) {
                System.out.println(contCarta + ")" + cartaActual.toString());
            }
            contCarta++;
        }
        do{
            try{                        //take a look after
            cardName = tools.InputData.pedirCadena("Introduce el nombre de la carta que desees agregar");//falta controlar el coste elixir.
            //buscamos la carta por nombre
            Carta carta = jugador.getListaCartas().encontrarCarta(jugador.getNombre());
            //añadimos la carta
            cartasBatalla.addCard(carta);
            System.out.println("Carta agregada!");
            }catch(Exception e){
                System.out.println(e);
            }
        }while(cartasBatalla.getLista().size() <=3);
        return cartasBatalla;
    }
    private static void simularBatalla(Jugador jugadorUno, Jugador jugadorDos){ //batalla
        int turno = (int) Math.floor(Math.random() * 2);
        int selectAtack = (int) Math.floor(Math.random() * 3);
        
        if(turno==1){
            //Empieza jugador1
            System.out.println("Empiza "+jugadorUno.getNombre());
            turnoJugadorUno();
            System.out.println("Turno de  "+jugadorDos.getNombre());
            turnoJugadorDos();
            
        }else{
            //Empieza jugador2
            System.out.println("Empiza "+jugadorDos.getNombre());
            turnoJugadorDos();
            System.out.println("Turno de  "+jugadorUno.getNombre());
            turnoJugadorUno();  
        }
        
        
        
    }
    
       public static void turnoJugadorUno(){
        int selectAtack = (int) Math.floor(Math.random() * 3);
        for(Carta cartaActual: cartasBatallaJugadorUno.getLista()){
                if(cartaActual instanceof CartaTropa){
                    System.out.println("La carta "+cartaActual.getNombre()+" ataca a "+cartasBatallaJugadorDos.getLista().get(selectAtack).getNombre()+"!");
                    ((CartaTropa) cartaActual).ataca(cartasBatallaJugadorDos.getLista().get(selectAtack));
                    
                    System.out.println("Resultado:");
                    System.out.println(cartaActual.getNombre()+" "+cartaActual.getLvlife()+"\t"+cartasBatallaJugadorDos.getLista().get(selectAtack).getNombre()+" "+cartasBatallaJugadorDos.getLista().get(selectAtack).getLvlife());
                    
                }
                if(cartaActual instanceof CartaEstructura){
                    System.out.println("La carta "+cartaActual.getNombre()+" regenera vida al resto de tus cartas!");
                    ((CartaEstructura) cartaActual).subirVida(cartasBatallaJugadorUno);
                }
                if(cartaActual instanceof CartaHechizo){
                    System.out.println("La carta "+cartaActual.getNombre()+" es activada con el modo"+((CartaHechizo) cartaActual).isMode()+"!");
                    ((CartaHechizo) cartaActual).activar(cartasBatallaJugadorUno, cartasBatallaJugadorDos);
                }
                
                selectAtack = (int) Math.floor(Math.random() * 3);
                System.out.println("");
                
                System.out.println("-turno-");
            }
        
    }
    public static void turnoJugadorDos(){
        int selectAtack = (int) Math.floor(Math.random() * 3);
        
        for(Carta cartaActual: cartasBatallaJugadorDos.getLista()){
                if(cartaActual instanceof CartaTropa){
                    System.out.println("La carta "+cartaActual.getNombre()+" ataca a "+cartasBatallaJugadorUno.getLista().get(selectAtack).getNombre()+"!");
                    ((CartaTropa) cartaActual).ataca(cartasBatallaJugadorUno.getLista().get(selectAtack));
                    
                    System.out.println("Resultado:");
                    System.out.println(cartaActual.getNombre()+" "+cartaActual.getLvlife()+"\t"+cartasBatallaJugadorUno.getLista().get(selectAtack).getNombre()+" "+cartasBatallaJugadorUno.getLista().get(selectAtack).getLvlife());
                }
                if(cartaActual instanceof CartaEstructura){
                    System.out.println("La carta "+cartaActual.getNombre()+" regenera vida al resto de tus cartas!");
                    ((CartaEstructura) cartaActual).subirVida(cartasBatallaJugadorDos);
                }
                if(cartaActual instanceof CartaHechizo){
                    System.out.println("La carta "+cartaActual.getNombre()+" es activada con el modo"+((CartaHechizo) cartaActual).isMode()+"!");
                    ((CartaHechizo) cartaActual).activar(cartasBatallaJugadorDos, cartasBatallaJugadorUno);
                }
                 selectAtack = (int) Math.floor(Math.random() * 3);
                 System.out.println("");
                 System.out.println("-turno-");
            }
        
       
    }
    
    
    private static void validUserCards(Jugador jugador) {
        int contCarta = 0;
        int opAddCarta = 0;
        boolean repAddCarta = false;
        if (jugador.getListaCartas().getLista().size() < 6) {//mostrar cartas disponibles a poner
            System.out.println("Hola " + jugador.getNombre());
            System.out.println("Cartas disponibles: ");
            for (Carta cartaActual : listaCartasGlobales.getLista()) {
                System.out.println(contCarta + "=" + cartaActual);
                contCarta++;
            }

            do {
                System.out.println("Total de cartas en tu mazo: " + jugador.getListaCartas().getLista().size());
                int rest = 6 - jugador.getListaCartas().getLista().size();
                System.out.println("Puedes añadir hasta " + rest + " en total");

                int numCarta = tools.InputData.pedirEntero("Selecciona el numero de una carta que desees agregar a tu mazo: ");

                if (listaCartasGlobales.getLista().size() > numCarta) {//si el numero de carta puede existir
                    if (jugador.getListaCartas().existCard(listaCartasGlobales.getLista().get(numCarta))) {//y si existe...
                        System.out.println("Esta carta ya existe");
                    } else {
                        jugador.getListaCartas().addCard(listaCartasGlobales.getLista().get(numCarta));
                        System.out.println("carta " + numCarta + " añadida correctamente");
                    }
                } else {
                    System.out.println("Este numero de carta no existe o ya ha sido introducido");
                }
                contCarta = 0;
                for (Carta cartaActual : jugador.getListaCartas().getLista()) {
                    if (cartaActual instanceof CartaEstructura) {
                        System.out.println(contCarta + ")" + cartaActual.toString());
                    }
                    if (cartaActual instanceof CartaHechizo) {
                        System.out.println(contCarta + ")" + cartaActual.toString());
                    }
                    if (cartaActual instanceof CartaTropa) {
                        System.out.println(contCarta + ")" + cartaActual.toString());
                    }
                    contCarta++;
                }

            } while (jugador.getListaCartas().getLista().size() < 6);

        } else {//mostrar cartas actuales que ya son 6
            System.out.println("Tienes estas 6 cartas:");
            for (Carta cartaActual : jugador.getListaCartas().getLista()) {
                if (cartaActual instanceof CartaEstructura) {
                    System.out.println(contCarta + "]" + cartaActual.toString());
                }
                if (cartaActual instanceof CartaHechizo) {
                    System.out.println(contCarta + "]" + cartaActual.toString());
                }
                if (cartaActual instanceof CartaTropa) {
                    System.out.println(contCarta + "]" + cartaActual.toString());
                }
                contCarta++;
            }
        }
        mostrarmenu();
    }

    public static void mostrarmenu() {
        System.out.println("---MENU---");
        System.out.println("1· Conseguir cartas");
        System.out.println("2· Batalla");
        System.out.println("3· Ranking por trofeos");
        System.out.println("4· Exit");
    }

    public static void login() {
        String name;
        String passwd;
        boolean valid = false;
        do {
            System.out.println("**LOGIN**");

            name = tools.InputData.pedirCadena("Your name here:");
            passwd = tools.InputData.pedirCadena("Your password here:");
            for (Jugador def : listaJugador.getLista()) {
                if (def.getNombre().equals(name)) {
                    if (def.getPassword().equals(passwd)) {
                        valid = true;
                    }
                }
            }
        } while (valid == false);
        mostrarmenu();
    }

    public static Jugador getJugador() {
        String name;
        String passwd;
        Jugador player = new Jugador();
        do {
            name = tools.InputData.pedirCadena("Your name here:");
            passwd = tools.InputData.pedirCadena("Your password here:");
            for (Jugador def : listaJugador.getLista()) {
                if (def.getNombre().equals(name)) {
                    if (def.getPassword().equals(passwd)) {
                        player = def;
                    }
                }
            }
        } while (player.getNombre() == null);
        return player;
    }
        public static void Ranking(){
        System.out.println("Ranking:");
        for(Jugador jugadorActual: listaJugador.getLista()){
            System.out.println(jugadorActual.getNombre()+" "+jugadorActual.getNumTrofeos());
        }
    }

}
