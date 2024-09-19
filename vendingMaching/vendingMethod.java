
package vendingmaching;

import java.util.Scanner;
public class vendingMethod {
VendingMaching op =new VendingMaching();
displayMenu n=new displayMenu();
inPutCash cash=new inPutCash();

   int choiceing(){
       int attemp=1;
        while (true) {
            Scanner m=new Scanner(System.in);
            double balance;  
            balance=m.nextDouble();
//           double balance= cash.getCash();
            
            
            n.displayMenu();
      
            System.out.println("Current Balance: "+balance);
            System.out.println("Enter your choice (1-6)");

        int choice;
        choice =m.nextInt();
        
        switch (choice) {
            case 1:
                {
                    double cokeprice= VendingMaching.cokeprice;
                    if (balance >= cokeprice) {
                        System.out.println("Enjoy your Coke!");
                        balance -= cokeprice;
                        System.out.println("current balance "+balance );
                        n.displayMenu();
                    } else {
                        System.out.println("Not enough balance.\n");
                        System.out.println("Get more cash");
                    }
                }
                break;

            case 2:
                {
                    double chipsPrice= VendingMaching.chipsPrice;
                    if (balance >= chipsPrice) {
                        System.out.println("Enjoy your chips!");
                        balance -= chipsPrice;
                    } else {
                        System.out.println("Not enough balance.");
                         System.out.println("Get more cash");
                    }
                }
                break;

            case 3:
                {
                    double candyPrice=VendingMaching.candyPrice;
                    if (balance >= candyPrice) {
                        System.out.println("Enjoy your candy!");
                        balance -= candyPrice;
                    } else {
                        System.out.println("Not enough balance.\n");
                         System.out.println("Get more cash");
                    }
                }
                break;

            case 4:
                {
                    double iceCreamPrice=VendingMaching.iceCreamPrice;
                    if (balance >= iceCreamPrice) {
                        System.out.println("Enjoy your Ice-cream !");
                        balance -= iceCreamPrice;
                    } else {
                        System.out.println("Not enough balance.\n");
                         System.out.println("Get more cash");
                    }
                }
                break;

            case 5:
                {
                    double waterPrice=VendingMaching.waterPrice;
                    if (balance >= waterPrice) {
                        System.out.println("Enjoy your Water!");
                        balance -= waterPrice;
                    } else {
                        System.out.println("Not enough balance.\n");
                         System.out.println("Get more cash");
                    }
                }
                break;    
    
                
            case 6:
                System.out.println("Exiting the vending machine. Please take your change: "+ balance);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.\n");
                break;
        }
        attemp++;
//        if(attemp==2)
//        {
//            m.close();
//        }
       }
        
    }
}
