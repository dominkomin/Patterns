/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Andrea
 */
public class Tea extends Drink {

    public Tea() {
        name = "tea";   
    }

    @Override
    public float cost() { 
        return 5.95f;
    }

}
