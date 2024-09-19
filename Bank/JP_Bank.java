
package Bank;

import java.util.*;
//import java.io.*;

interface BankSirvice{
    void CreateAccount();
    void ShowAccountDetails();
    void Deposit();
    void Withdraw();
    void CheckBalance();
    //void ChangePassword();
    //void Statement();
}
class BankDetails {
    Scanner in=new Scanner(System.in);
    final int postCode=1751;
    final void bankDetails(){
        System.out.println("============ Jishan Bank Ltd ============");
        System.out.println("Branch :\t Mouchak ");
        System.out.println("Branch code : 1141");
        System.out.println("post code: "+postCode);
        System.out.println("Gazipur , Mouchak");
    }
    
}
class Account extends BankDetails{
    String user,pass,repass;
    
    void input(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter user name: ");
        this.user=s.nextLine();
        System.out.print("enter password: ");
        this.pass=s.nextLine();
        System.out.print("retype password: ");
        repass=s.nextLine();
    }
    void checkSetPassword(){
        if(this.pass.equals(this.repass)){
            System.out.println("Account create successfully..");
        }
        else {
            System.out.println("worng password!");
            System.out.println("try again later.!");
        }
    }
    void ShowAccountDetails(){
        try{
            if (this.pass.equals(this.repass)){
                System.out.println("User Name: "+this.user);
                System.out.println("password: "+this.pass);
            }else {
                System.out.println("Account dose not create yet.");
            }

        }
        catch (Exception showAccount){
                System.out.println("Account dose not create yet.");
        }
    }
}
class CreateAccount extends Account{
int choice;

     void dispCreate() {
         System.out.println("press 1: create a new account ");
         System.out.println("press 2: Exit.!");
     }

     void createAccount() {
         System.out.println("=====Welcome to our bank====");
         this.dispCreate();
         System.out.print("please enter a number: ");
         this.choice = in.nextInt();
         switch (this.choice) {
             case 1:
                 this.input();
                 break;
             case 2:
                 System.out.println("exiting...thank your for using our system.");
                 break;
             default:
                 System.out.println("wrong ! input");
                 System.out.println("try again later thank you");
                 break;
         }
         try {
             this.checkSetPassword();
         } catch (Exception e) {
             System.out.println("account can't create...");
         }
     }
         void viewOrSkip(){
             try{
         if(this.pass.equals(this.repass)){
         System.out.println("press 1:  account details ");
         System.out.println("press 2:  skip details ");
         System.out.print("enter your choice: ");
         int op = in.nextInt();
         switch (op) {
             case 1:
                 try {
                     this.ShowAccountDetails();
                 } catch (Exception d) {
                     System.out.println(d);
                 }
                 break;
             case 2:
                 System.out.println("skip successfully..");
                 break;
             default:
                 System.out.println("wrong input.");
                 break;
            }
         }
         else{
             try{
                 System.out.println("account create yet.!");
             }
             catch(Exception nu){
                 System.out.println("account create yet ");
             }
             
         }
     }
      catch(Exception t){
          System.out.println(t);
        }
    }
}
class Deposit extends CreateAccount{
    protected double deposit;
    public void setDeposit(){
      
        try{
            
            if(this.pass.equals(this.repass)){
                 float iniBal=0;
                
         System.out.println("main balance is "+iniBal+" taka");
        Scanner d=new Scanner(System.in);
        double dp;
        System.out.print("enter deposit ammount: ");
        dp=d.nextDouble();
        dp+=iniBal;
        this.deposit=dp;   
        }
        else {
            System.out.println("account create yet..");
        }
        }
        catch(Exception dpx){
            System.out.println(dpx);
    }
    }
    public double getDeposit(){
        
            return this.deposit;
      
    }
    public void showDeposit(){
        System.out.println("deposit balance is : "+this.getDeposit());
        System.out.println("current balance is "+this.getDeposit());
    }
}
class Withdraw extends Deposit{
    protected double withdraw;
    public void setWithdraw(){
        try{
           double wd;
        Scanner Wd=new Scanner(System.in);
         System.out.print("enter withdraw ammount: ");
        wd=Wd.nextDouble();
        this.withdraw=wd; 
        }
        catch(Exception WITH){
            System.out.println(WITH);   
        }
        
    }
    public double getWithdraw(){
        return this.withdraw;
    }
    public void showWithDraw(){
        if(this.withdraw<=this.deposit){
        System.out.println("withdraw ammount request is : "+this.getWithdraw());
        System.out.println(this.getWithdraw()+" Take withdraw successful..");
        System.out.println("Please collect your money ");
        }
        else {
            System.out.println("withdraw unsuccessful..");
            System.out.println("your main balance is lower then withdraw balance .");
        }
    }
}
class Currentbalance extends Withdraw{
    protected double currnetBalance;
    public double getCurrnetBalance(){
        if(this.withdraw<=this.deposit){ 
       return this.deposit-this.withdraw;
        }
        else
            
        return this.deposit;      
    }
    public void showCurrentMoney(){
        System.out.println("current balance is : "+this.getCurrnetBalance());
    }
}
class ServiceChoice extends Currentbalance{ 
   public void serviceMenu(){
        System.out.println("======================");
        System.out.println("===welcome to our Bank===");
        System.out.println("press 0: create account");
        System.out.println("press 1: Show Account Details");
        System.out.println("press 2: Deposit");
        System.out.println("press 3: withdraw");
        System.out.println("press 4: current balance");
        System.out.println("press 5: Exit.");
        System.out.println("=======================");
         int end=1;
    do {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a key: ");
        int key=input.nextInt();
        if (key==5){
            ++end;
            break;
        }
        switch (key){
            case 0: 
                this.createAccount();
                break;
            case 1: this.ShowAccountDetails();
            break;
            case 2: this.setDeposit();
            this.getDeposit();
            this.showDeposit();
            break;
          case 3: this.setWithdraw();
            this.getWithdraw();
            this.showWithDraw();
            break;
            case 4: this.getCurrnetBalance();
            this.showCurrentMoney();
            break;
            case 5: 
                System.out.println("Exit.!");
               break;
            default:
                System.out.println("wrong input! try again");
                break; 
        }
    }while(end!=2);
   }
}
public class JP_Bank extends ServiceChoice {
    
  /*  public static void main(String[] args) {
        ServiceChoice obj=new ServiceChoice();
        obj.bankDetails();
        obj.serviceMenu();
        
        
    }*/
}
