/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Andrea
 */
public class Coffee extends Drink {

    public Coffee() {
        name = "coffee";   
    }

    @Override
    public float cost() { 
        return 8.75f;
    }
    
}
