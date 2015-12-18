/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author Andrea
 */
public class CoinRequest {
    
    public int amount;

    public CoinRequest(int amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

}
