/*
 */
package stucomroyal;


import java.util.ArrayList;

public class ListaCartas {

    private ArrayList<Carta> lista;

    public ListaCartas() {

        lista = new ArrayList<>();

    }
    public ArrayList<Carta> getListacartas(){
        return lista;
    }
    public ArrayList<Carta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Carta> lista) {
        this.lista = lista;
    }
     public void addCard(Carta carta){
        if(this.lista.size()<6){
            this.lista.add(carta);
        }else{
            System.out.println("No puedes añadir más de 6 cartas!");
        }
    }
    
    @Override
    public String toString() {
        return "listaCartas [ " + lista + " ]";
    }
    
    public boolean existCard(Carta carta){
        boolean exists = false;
        for(Carta cartadef: lista){
            if(cartadef.equals(carta)){
                exists = true;
            }
        }
        return exists;
    }
}
