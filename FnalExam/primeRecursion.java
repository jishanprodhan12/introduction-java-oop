
package FnalExam;
import java.util.Scanner;
public class primeRecursion {
    int i,count=1;
    //recursionMethod
    public int  isPrime(int num){
        if(num==0 || num==1){
            System.out.println(num+" is not prime number ");
        }
        else {
            for ( i = 2; i <=num; i++) {
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num+" is a prime number ");
            }
            else{
                System.out.println(num+" is not a prime number ");
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        primeRecursion obj=new primeRecursion();
        System.out.println("enter your last two digits of student id  ");
        obj.isPrime(in.nextInt());
        //my last two digit is 41.              
        
        
    }
    
}
