/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Andrea
 * 
 * Invoker class
 * 
 */
public class InvokerControlPanel {

    private Command on,
                    off;

    public InvokerControlPanel(Command on, Command off) {
        // the concrete Command objects register themselves with the invoker
        this.on = on;
        this.off = off;
    }

    // the invoker calls a concrete Command, which executes the Command on the receiver 
    void on() {
        on.execute();
    }

    // the invoker calls a concrete Command, which executes the Command on the receiver 
    void off() {
        off.execute();
    }

}