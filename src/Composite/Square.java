/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Andrea
 * 
 * This is a leaf i.e. a concrete implementation of the AbstractComponent
 * 
 */
public class Square extends AbstractComponent {

    private String name;
    private int number;

    public Square(String name, int number) {
        this.name = "Square: " + name + " " + number;
        this.number = number;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing " + name);
    }
    
}