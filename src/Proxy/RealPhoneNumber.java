/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Andrea
 */
public class RealPhoneNumber implements PhoneService {

    private String phoneNr;

    public RealPhoneNumber(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    @Override
    public void dial() {
        System.out.println("Dialing " + phoneNr);
    }

}
