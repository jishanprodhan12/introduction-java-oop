
package FnalExam;

import java.util.Scanner;

public class qn4 {
    private int carNum;
    int sell;
    Scanner in=new Scanner(System.in);
    public void setCarNumber(int carNum){
        this.carNum=carNum;
    }
    public int getCatNumber(){
        return this.carNum;
    }
    public void show(){
        System.out.println("brand Model : BMW");
        System.out.println("Model year : 2020");
        System.out.println("Price : 20,5000");
    }
    public void sellCars(){
        System.out.println("enter sell quantity : ");
        this.sell=in.nextInt();
        if(this.carNum<this.sell){
            System.out.println("not enough quntity");
        }else {
            System.out.println(this.sell+" cars sell suscessfull");
            int sel= this.carNum-this.sell;
            System.out.println(sel+" rest cars");

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      q4 obj=new q4();
      obj.show();
        System.out.println("enter your car numbers: ");
      obj.setCarNumber(s.nextInt());
      obj.getCatNumber();
      obj.sellCars();
    }
}
