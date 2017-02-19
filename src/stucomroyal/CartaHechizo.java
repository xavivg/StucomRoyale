
package stucomroyal;


public class CartaHechizo extends Carta{
    private int lvlalcance;
    private String mode;

    public CartaHechizo(String nombre, int lvlalcance, String mode, int costeElixir, int lvlife) {
        super(nombre, costeElixir, lvlife);
        this.lvlalcance = lvlalcance;
        this.mode = mode;
    }

    public int getLvlalcance() {
        return lvlalcance;
    }

    public void setLvlalcance(int lvlalcance) {
        this.lvlalcance = lvlalcance;
    }

    public String isMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
     //TODO: Logic code about what does it do
    public void activar(ListaCartas listadef, ListaCartas listaEnemigo){
        int magic = ((this.lvlalcance*2)/3);
        
        if(this.mode.equals("ataque")){
            for(Carta carta : listaEnemigo.getLista()){
                  carta.setLvlife(carta.getLvlife()-magic);
            }
        }
         if(this.mode.equals("defensa")){
            for(Carta carta : listaEnemigo.getLista()){
                  carta.setLvlife(carta.getLvlife()+magic);
            }
        }
    }
    @Override
    public String toString() {
        return super.toString() + "mode = " + mode + ", alcance = " + lvlalcance + ']';
    }
}
