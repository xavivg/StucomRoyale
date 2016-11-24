/*
 */
package stucomroyal;

/**
 */
public abstract class Carta {
    private String nombre;
    private Integer costeElixir;
    private Integer lvlife;

    public Carta() {
    }

    public Carta(String nombre, Integer costeElixir, Integer lvlife) {
        this.nombre = nombre;
        this.costeElixir = costeElixir;
        this.lvlife = lvlife;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCosteElixir() {
        return costeElixir;
    }

    public void setCosteElixir(Integer costeElixir) {
        this.costeElixir = costeElixir;
    }

    public Integer getLvlife() {
        return lvlife;
    }

    public void setLvlife(Integer lvlife) {
        this.lvlife = lvlife;
    }
    
    
    
    
}
