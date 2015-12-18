/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Andrea
 */
public class TollFreeNumberProxy implements PhoneService {

    private RealPhoneNumber realPhoneNumber;
    private String phoneNr;

    public TollFreeNumberProxy(String phoneNr) {
        // a real phone number should be extracted from the toll
        // free number starting with 800; for now, to keep it
        // simple, just remove the 800 and assume that the reminding
        // number is the actual real phone number
        this.phoneNr = phoneNr.substring(3); 
    }

    @Override
    public void dial() {
        realPhoneNumber = new RealPhoneNumber(phoneNr);
        realPhoneNumber.dial();
    }

}
