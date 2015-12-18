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
public class CommandLockerClose implements Command {
    
    private ReceiverLocker locker;

    public CommandLockerClose(ReceiverLocker locker) {
        this.locker = locker;    
    }

    @Override
    public void execute() {
        locker.closeLocker();    
    }
    
}
