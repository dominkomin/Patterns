/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Andrea
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator cb = new ConcreteMediator();
 
        ConcreteColleague1 a1 = new ConcreteColleague1(cb);
        ConcreteColleague2 a2 = new ConcreteColleague2(cb);

        cb.addAgent(a1);
        cb.addAgent(a2);

        a1.send("Some message from colleague 1");
        a2.send("Another message from colleague 2");
    }
}
