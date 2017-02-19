
package stucomroyal;


import java.util.ArrayList;
import java.util.List;

public class ListaJugador {

    private ArrayList<Jugador> lista;

    public ListaJugador() {

        lista = new ArrayList<>();

    }
    public ArrayList<Jugador> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }
    
    @Override
    public String toString() {
        return "ListaJugador[" + lista + "]";
    }
}
