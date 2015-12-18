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
public class CommandLightOff implements Command {

    private ReceiverLight light;
    
    public CommandLightOff (ReceiverLight light) {
        this.light = light;
    }
    
    @Override
    public void execute() {        
        light.turnOff();
    }
    
}
