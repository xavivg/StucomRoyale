/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyal;

/**
 *
 * @author usu26
 */
public class CartaTropa extends Carta {
    
    private int lvlattack;
    
    public CartaTropa(String nombre, int costeElixir, int lvlife, int lvlattack) {
        super(nombre, costeElixir, lvlife);
        this.lvlattack = lvlattack;
    }

    public int getLvlattack() {
        return lvlattack;
    }

    public void setLvlattack(int lvlattack) {
        this.lvlattack = lvlattack;
    }
    

    //TODO: Logic code about what does it do
    
    public void ataca(Carta carta){
       int vidaRes = 0;
       vidaRes = (carta.getLvlife()-(this.lvlattack/2));
       carta.setLvlife(vidaRes);
   }
    
    @Override
    public String toString() {
        return super.toString() + "nivel de alcance = " + lvlattack + ']';
    }
}
