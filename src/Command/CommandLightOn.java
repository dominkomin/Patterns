/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Andrea
 * 
 * A concrete command
 * 
 */
public class CommandLightOn implements Command {

    private ReceiverLight light;
    
    public CommandLightOn (ReceiverLight light) {
        this.light = light;
    }
    
    @Override
    public void execute() {        
        light.turnOn();
    }
}
