/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Andrea
 * 
 * This is a Composite
 * 
 */
public class Drawing extends AbstractComponent {

    ArrayList<AbstractComponent> compositeObjs = new ArrayList<>();
    
    public void add(AbstractComponent cd) {
        compositeObjs.add(cd);
    }
    
    public void remove(AbstractComponent cd) {
        compositeObjs.remove(cd);
    }
    
    @Override
    public void draw() {
        // Iterate over the components
        for(int i=0; i < compositeObjs.size(); ++i) {
            // Obtain a reference to the component and invoke its draw method
            AbstractComponent component = compositeObjs.get(i);
            component.draw();
        }
    }
    
}
