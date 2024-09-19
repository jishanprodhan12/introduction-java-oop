
package inheritance;

import java.util.Scanner;

public class usingSuper {

     usingSuper() {
        System.out.println("HELLO WORLD!");
    }

    Scanner in=new Scanner(System.in);
    void inputName(){
        System.out.println("enter your name ");
    }
    void inputId(){
        System.out.println("Enter your id ");
    }
    String batch="61 (B) "   ;
}
 class students extends usingSuper{
    public void jishan(){
        
        String name ; 
        int id;
        super.inputName();
        name=super.in.nextLine();
        super.inputId();
        id=super.in.nextInt();
        System.out.println("name is : "+name);
        System.out.println("id number is : "+id);
        System.out.println("batch "+super.batch);
       
    }
    void niloy(){
        
        String name;
        int id;
        super.inputName();
        name=super.in.nextLine();
        super.inputId();
        id=super.in.nextInt();
        System.out.println("name is : "+name);
        System.out.println("id number is : "+id);
        System.out.println("batch "+super.batch);
       
    }
//     public static void main(String[] args) {
//         students ref=new students();
//         ref.jishan();
//         ref.niloy();
//     }

}
