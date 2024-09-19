
package com.mycompany.swing;
import java.util.Scanner;
public class forLoop {
       int a,b,c;
       static int sum=0;
                     
    public static void main(String[] args) {
        
        forLoop obj=new forLoop();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the frist number : ");
        obj.a= in.nextInt();
        System.out.println("enter second number : ");
        obj.b=in.nextInt();
        forLoop.sum=obj.a+obj.b;
        obj.c=sum;
        System.out.println("sum of "+obj.a+" and "+ " "+obj.b+" is : "+obj.c);
            
    }
    
}
