
package stucomroyal;

public class CartaEstructura extends Carta{
    private int lvlDefense;

    public CartaEstructura(String nombre, int costeElixir, int lvlife, int lvlDefense) {
        super(nombre, costeElixir, lvlife);
        this.lvlDefense = lvlDefense;
    }

    public int getLvlDefense() {
        return lvlDefense;
    }

    public void setLvlDefense(int lvlDefense) {
        this.lvlDefense = lvlDefense;
    }
    //TODO: Logic code about what does it do
      public void subirVida(ListaCartas listaCartas){
        for(Carta carta: listaCartas.getListacartas()){
            carta.setLvlife(carta.getLvlife()+(this.lvlDefense+8));
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "nivel de defensa = " + lvlDefense + ']';
    }
}
