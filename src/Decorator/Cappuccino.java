/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Andrea
 */
public class Cappuccino extends Drink {

    public Cappuccino() {
        name = "cappuccino";   
    }

    @Override
    public float cost() { 
        return 13.50f;
    }
    
}
