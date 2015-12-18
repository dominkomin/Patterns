/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Andrea
 */
public abstract class Drink {

    protected String name = "a drink";

    public String getName() {
        return name;
    }

    public abstract float cost();
 }
