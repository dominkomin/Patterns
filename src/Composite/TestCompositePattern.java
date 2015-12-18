/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Andrea
 */
public class TestCompositePattern {
    
    public static void paintComponent(AbstractComponent drawable) {
        drawable.draw();
    }

    public static void main( String[] args ) {
        
        Line line1 = new Line("Line 1");
        Line line2 = new Line("Line 2");
        Square square = new Square("Square1",1);

        // Draw individual components - don't use composite pattern
        System.out.println("Draw individual components without using composite pattern");
        TestCompositePattern.paintComponent(line1);
        TestCompositePattern.paintComponent(line2);
        TestCompositePattern.paintComponent(square);
        
        // Build a composite object and draw it
        System.out.println("\nBuild a composite object and draw it");
        Drawing drawingGroup1 = new Drawing();
        drawingGroup1.add(line1);
        drawingGroup1.add(line2);
        drawingGroup1.add(square);
        
        Drawing drawingGroup2 = new Drawing();
        Line line3 = new Line("Line 3");
        Square square2 = new Square("Square2",2);
        drawingGroup2.add(line3);
        drawingGroup2.add(square2);
        
        drawingGroup1.add(drawingGroup2);
        
        TestCompositePattern.paintComponent(drawingGroup1);
        
    }
    
}
