/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyal;
public class Jugador {
    private String nombre;
    private String password;
    private String numTrofeos;
    private ListaCartas listacartas;

    public Jugador(String nombre, String password, String numTrofeos, ListaCartas listacartas) {
        this.nombre = nombre;
        this.password = password;
        this.numTrofeos = numTrofeos;
        this.listacartas = listacartas;
    }

    public Jugador() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumTrofeos() {
        return numTrofeos;
    }

    public void setNumTrofeos(String numTrofeos) {
        this.numTrofeos = numTrofeos;
    }

    public ListaCartas getListacartas() {
        return listacartas;
    }

    public void setListacartas(ListaCartas listacartas) {
        this.listacartas = listacartas;
    }
    
    
}
