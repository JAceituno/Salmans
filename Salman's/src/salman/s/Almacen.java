/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salman.s;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author megarokr
 */
public class Almacen {
    
    public Almacen() {
    }

    public ArrayList<Stack<Ingredient>> getAlmacen() {
        return almacen;
    }

    public void setAlmacen(ArrayList<Stack<Ingredient>> almacen) {
        this.almacen = almacen;
    }
    
    public boolean hasIngredient(String name){
        for (int i = 0; i < almacen.size(); i++) {
            if (almacen.get(i).peek().getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hasIngredient(Ingredient ingredient){
        for (int i = 0; i < almacen.size(); i++) {
            if (almacen.get(i).peek().getName().equalsIgnoreCase(ingredient.getName())) {
                if (almacen.get(i).size() > 1) {
                    double tempdouble = 0;
                    Stack<Ingredient> tempStack = new Stack();
                    for (int j = 0; j < almacen.get(i).size(); j++) {
                        Ingredient temp = almacen.get(i).pop();
                        tempdouble += almacen.get(i).peek().toUnit(ingredient.getUnit());
                        tempStack.push(temp);
                    }
                    for (int j = 0; j < tempStack.size(); j++) {
                        almacen.get(i).push(tempStack.pop());
                    }
                    return tempdouble  >= ingredient.getQuantity();
                }
                else{
                    return almacen.get(i).peek().toUnit(ingredient.getUnit()) >= ingredient.getQuantity();
                }
            }
        }
        return false;
    }
    
    public void addToStorage(Ingredient ingredient){
        for (int i = 0; i < almacen.size(); i++) {
            if (almacen.get(i).peek().getName().equalsIgnoreCase(ingredient.getName())) {
                almacen.get(i).push(ingredient);
                break;
            }
        }
        if (!hasIngredient((ingredient.getName()))) {
           Stack temp = new Stack();
           temp.push(ingredient);
           almacen.add(temp);
        }
    }

    ArrayList<Stack<Ingredient>> almacen = new ArrayList();
}
