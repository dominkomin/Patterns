/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Andrea
 */
public class ConcreteColleague1 extends Colleague {
    
    public ConcreteColleague1(Mediator b) {
        super(b);
    }

    @Override
    public void receive(String msg) {
        System.out.println("ConcreteCollegue1 received: " + msg);
    }
    
}
