/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class ConcreteMediator implements Mediator {

    private ArrayList<Colleague> agents;

    public ConcreteMediator() { 
        agents = new ArrayList<>();
    }

    public void addAgent(Colleague agent) {
        agents.add(agent);
    }

    @Override
    public void send(String msg, Colleague agent) {
        //let all other agents know
        for (Colleague a: agents) {
            //but do not inform the agent itself
            if(a != agent) {
                a.receive(msg);
            }
        }
    }
    
}
