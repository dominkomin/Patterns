/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Andrea
 */
public abstract class DrinkDecorator extends Drink {

    protected Drink drink;

    public DrinkDecorator(Drink d){
        this. drink = d;
    }
	
    @Override
    public abstract String getName();
    
}
