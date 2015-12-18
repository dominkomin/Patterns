/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Andrea
 */
public class TestDecorator {

    public static void main(String[] args) {
        Drink tea = new Tea();
        System.out.println(tea.getName() + ": " + tea.cost() + " DKK");
        Sweetener sweetTea = new Sweetener(tea); // wrap a tea with a sweetener
        System.out.println(sweetTea.getName() + ": " + sweetTea.cost() + " DKK");
        
        Drink coffee = new Coffee();
        System.out.println(coffee.getName() + ": " + coffee.cost() + " DKK");
        Sweetener sweetCoffee = new Sweetener(coffee); // wrap a coffee with a sweetener
        System.out.println(sweetCoffee.getName() + ": " + sweetCoffee.cost() + " DKK");

        Sweetener sweetCappuccino = new Sweetener( new Cappuccino()); // wrap a cappuccino with a sweetener
        System.out.println(sweetCappuccino.getName() + ": " + sweetCappuccino.cost() + " DKK");
    }
}
