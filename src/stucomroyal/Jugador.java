/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyal;
public class Jugador {
    private String nombre;
    private String password;
    private int numTrofeos;
    private ListaCartas listaCartas;

    public Jugador(String nombre, String password, int numTrofeos) {
        this.nombre = nombre;
        this.password = password;
        this.numTrofeos = numTrofeos;
        this.listaCartas = new ListaCartas();
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

    public int getNumTrofeos() {
        return numTrofeos;
    }

    public void setNumTrofeos(int numTrofeos) {
        this.numTrofeos = numTrofeos;
    }

    public ListaCartas getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ListaCartas listacartas) {
        this.listaCartas = listacartas;
    }
    
    
}