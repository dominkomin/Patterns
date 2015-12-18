/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Andrea
 * 
 * This is the colleague class
 * 
 */
public abstract class Colleague {

    private Mediator broker;

    public Colleague(Mediator broker) {
        this.broker = broker;
    }

    //send a message via the mediator
    public void send(String msg) {
        broker.send(msg, this);
    }

    //access the mediator
    public Mediator getBroker() {
        return broker;
    }
    
    public abstract void receive(String msg);
}
