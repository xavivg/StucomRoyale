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
    
    
}
