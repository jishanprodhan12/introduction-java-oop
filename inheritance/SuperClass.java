
package inheritance;

public class SuperClass {
    String name;
    int age,id;
    void input(){
        System.out.println("Enter your name age id");
    }
    public static void main(String[] args) {
        subClass obj=new subClass();
        obj.input();
        obj.dispSetu();
        obj.dispNiloy();
        obj.dispRaihan();
        obj.DispJishan();
        obj.dispRasel();
    }
}
