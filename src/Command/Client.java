/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Andrea
 * 
 * A client class
 * 
 */
public class Client {

    public static void main(String[] args) {                
        ReceiverLight light = new ReceiverLight();
        Command lightOn = new CommandLightOn(light);
        Command lightOff = new CommandLightOff(light);
        InvokerControlPanel controlPanelLight = new InvokerControlPanel(lightOn,lightOff);       
        controlPanelLight.on();
        controlPanelLight.off();

        ReceiverLocker locker = new ReceiverLocker();
        Command lockerOpen = new CommandLockerOpen(locker);
        Command lockerClose = new CommandLockerClose(locker);
        InvokerControlPanel controlPanelLocker = new InvokerControlPanel(lockerOpen,lockerClose);
        controlPanelLocker.on();
        controlPanelLocker.off(); 
    }

}
