/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salman.s;

import java.util.ArrayList;

/**
 *
 * @author megarokr
 */
public class Orden {

    public Orden(int direccion, String owner, ArrayList<Plato> platos) {
        this.costo =0;
        this.tiempo=0;
        for (int i = 0; i < platos.size(); i++) {
            this.costo += platos.get(i).getPrice();
            this.tiempo += platos.get(i).getCoccion();
        }
        this.direccion = direccion;
        this.owner = owner;
        this.platos = platos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    ArrayList<Plato> platos = new ArrayList();
    double costo;
    int tiempo;
    int direccion;
    String owner;
    
}
