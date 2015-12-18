/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author Andrea
 */
public class Soda extends CoinDispenser {

    @Override
    public void handleRequest(CoinRequest request) 
    {
        if (request.getAmount() < (2*CoinDispenser.C_MIN_AMOUNT) ) {
            System.out.println("For " + request.getAmount()+ "DKK you can get a soda");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }    
        }    
    }
  
}
