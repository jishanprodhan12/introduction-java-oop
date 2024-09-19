
package Recursion;

import java.util.Scanner;

public class factTest {
    public static void main(String[] args) {
        factLogic obj=new factLogic();
        Scanner in =new Scanner(System.in);
        System.out.print("enter your range : ");
        int num=in.nextInt();
        int result=obj.fact(num);
        System.out.println("factorial of "+num+" is : "+result);
        
    }
    
}
