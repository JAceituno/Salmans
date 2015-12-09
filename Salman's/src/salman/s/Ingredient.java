/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salman.s;

/**
 *
 * @author megarokr
 */
public class Ingredient {

    public Ingredient(String name, double quantity, String unit, String tipo) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double toUnit(String unit){
        if(!this.unit.equalsIgnoreCase(unit)){
            if(tipo.equalsIgnoreCase("Volumen")){
                if(this.unit.equalsIgnoreCase("Litros")){
                    if(unit.equalsIgnoreCase("mililitros")){
                        return quantity*1000;
                    }
                    else if(unit.equalsIgnoreCase("galones")){
                        return quantity*0.2642;
                    }
                }
                else if(this.unit.equalsIgnoreCase("mililitros")){
                    if(unit.equalsIgnoreCase("litros")){
                        return quantity*0.01;
                    }
                    else if(unit.equalsIgnoreCase("galones")){
                        return quantity*0.0002642;
                    }
                }
                else if(this.unit.equalsIgnoreCase("galones")){
                    if(unit.equalsIgnoreCase("mililitros")){
                        return quantity*3785;
                    }
                    else if(unit.equalsIgnoreCase("litros")){
                        return quantity*3.785;
                    }
                }
            }
            else if(tipo.equalsIgnoreCase("Masa")){
                if(this.unit.equalsIgnoreCase("kilogramos")){
                    if(unit.equalsIgnoreCase("gramos")){
                        return quantity*1000;
                    }
                    else if(unit.equalsIgnoreCase("libras")){
                        return quantity*2.205;
                    }
                    else if(unit.equalsIgnoreCase("onzas")){
                        return quantity*35.27;
                    }
                }
                else if(this.unit.equalsIgnoreCase("libras")){
                    if(unit.equalsIgnoreCase("kilogramos")){
                        return quantity*0.4536;
                    }
                    else if(unit.equalsIgnoreCase("gramos")){
                        return quantity*453.6;
                    }
                    else if(unit.equalsIgnoreCase("onzas")){
                        return quantity*16;
                    }
                }
                else if(this.unit.equalsIgnoreCase("onzas")){
                    if(unit.equalsIgnoreCase("kilogramos")){
                        return quantity*0.02835;
                    }
                    else if(unit.equalsIgnoreCase("libras")){
                        return quantity*0.0625;
                    }
                    else if(unit.equalsIgnoreCase("gramos")){
                        return quantity*28.35;
                    }
                }
                else if(this.unit.equalsIgnoreCase("gramos")){
                    if(unit.equalsIgnoreCase("kilogramos")){
                        return quantity*0.001;
                    }
                    else if(unit.equalsIgnoreCase("libras")){
                        return quantity*0.002205;
                    }
                    else if(unit.equalsIgnoreCase("onzas")){
                        return quantity*0.03527;
                    }
                }
            }
        }
        return quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity + unit;
    }
    String name;
    double quantity;
    String unit;
    String tipo;
}
