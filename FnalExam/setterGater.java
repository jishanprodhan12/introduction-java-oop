
package FnalExam;

import java.util.Scanner;
public class setterGater {
 
    private String name;
    public void setName(String name){
        this.name=name;
        
    }
    public String getName(){
        
        return this.name;
    }
    public void show(){
        System.out.println("your name is "+this.name);
    }
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        setterGater obj=new setterGater();
        System.out.println("enter your name ");
        obj.setName(in.nextLine());
        
        obj.show();
        
    }
}
