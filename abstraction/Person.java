package abstraction;
import java.util.Scanner;
class Person {
     String name;
     String address;
     int age;
     Person(){
         System.out.println("Enter your name\tage\tsalary\t and address: ");
     }
}
class Employee extends  Person{
    Scanner in=new Scanner(System.in);
     double salary;
     Employee(){
         super();
         super.name=in.nextLine();
         super.age=in.nextInt();
         this.salary=in.nextDouble();
         Scanner s=new Scanner(System.in);
         super.address=s.nextLine();

     }
     void show(){
         System.out.println();
         System.out.println("Name is "+super.name+"\nage : "+super.age+"\nsalary : "+this.salary+"\naddress : "+super.address);
     }
}
