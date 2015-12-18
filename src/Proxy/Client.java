/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Andrea
 */
public class Client {
    
    public static void main(String[] args) {
        PhoneService ps = new TollFreeNumberProxy("+800123456");
        ps.dial();
    }
    
}
