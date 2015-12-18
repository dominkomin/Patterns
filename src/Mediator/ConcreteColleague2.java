/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Andrea
 */
public class ConcreteColleague2 extends Colleague {
    
    public ConcreteColleague2(Mediator b) {
        super(b);
    }

    @Override
    public void receive(String msg) {
        System.out.println("ConcreteColleague2 received: " + msg);
    }
    
}
