/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;


/**
 *
 * @author Andrea
 */
public class Sweetener extends DrinkDecorator {

    public Sweetener(Drink d)
	{
		super(d);
	}

	@Override
    public String getName() {
        return "sweetened " + drink.getName();
    }

    @Override
    public float cost() {
        return drink.cost() + 2.95f;
    }
}
