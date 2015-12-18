/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Andrea
 * 
 * This is the mediator interface
 * 
 */
public interface Mediator {
    public void send(String msg, Colleague agent);  
}
