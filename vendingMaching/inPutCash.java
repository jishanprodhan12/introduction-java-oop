
package vendingmaching;
public class inPutCash {
    private double cash;
    public void setCash(double balance){
        this.cash=balance;
        if(balance <=0){
            throw new IllegalArgumentException("money is never negative number ");
//            System.out.println("balance is never negative number");
        }
    }
    public double getCash(){
        return this.cash;
    }
}
