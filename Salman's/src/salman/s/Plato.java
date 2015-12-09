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
public class Plato {

    public Plato(String nombre, double price, int coccion, ArrayList<Ingredient> ingredientes) {
        this.nombre = nombre;
        this.price = price;
        this.coccion = coccion;
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingredient> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredient> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCoccion() {
        return coccion;
    }

    public void setCoccion(int coccion) {
        this.coccion = coccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String nombre;
    ArrayList<Ingredient> ingredientes = new ArrayList();
    double price;
    int coccion;
}
