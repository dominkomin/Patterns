/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author Andrea
 */
public abstract class CoinDispenser {

    public static final int C_MIN_AMOUNT = 15;
    public CoinDispenser next;

    public void setSuccessor(CoinDispenser next) {
        this.next = next;
    }

    abstract public void handleRequest(CoinRequest request);

}
