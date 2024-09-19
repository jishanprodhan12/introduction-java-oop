import java.util.Scanner;

public class Qn3 {
    String name1,name2;
   static  int id=1141;
    

    public void student(String name ){
        this.name1=name;
        if(name1.equals("jishan"))
        {
             System.out.println("City University");

            System.out.println("Name:  "+this.name1);
            System.out.println("roll: 1141");
            id++;
        }
        else{
            System.out.println("worng user name .!");
        }
        if(id==1142){
                System.out.println("Name :  Rasel");
                System.out.println("Roll : 1142");
            } 
        }
         
    public static void main(String[] args) {
        Qn3 obj=new Qn3();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name ");
        obj.student(in.nextLine());

    }
        
    }
    
