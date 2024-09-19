
package vendingmaching;

import static java.lang.System.in;
import java.util.Scanner;
public class VendingMaching {
    static double cokeprice = 25;
    static double chipsPrice = 15;
    static double candyPrice = 5;
    static double iceCreamPrice = 50;
    static double waterPrice = 15;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        displayMenu ref=new displayMenu();
        vendingMethod obj=new vendingMethod();
        inPutCash cash=new inPutCash();
          
          ref.displayMenu();
        System.out.println("Please enter Money first \t");
       // cash.setCash(in.nextDouble());
        obj.choiceing();
        
    }
}
