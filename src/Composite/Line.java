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
public class Line extends AbstractComponent {

    private String name;

    public Line(String name) {
        this.name = "Line: " + name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name);
    }
    
}
