/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Client {
    
    public static void main(String[] args) {
        Soda soda = new Soda();
        WarmDrink warmDrink = new WarmDrink();
        Snack snack = new Snack();
        soda.setSuccessor(warmDrink);
        warmDrink.setSuccessor(snack);
        while (true) {
            System.out.print("Enter the amount to insert in the dispenser: ");
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            soda.handleRequest(new CoinRequest(amount));    
        }
    }

}