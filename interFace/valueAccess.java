
package Interface;
interface Value{
   static int a=5;
    void jishan();
    int c=10;
    
}

public class ValueAccess implements Value {
    @Override
    public void jishan(){
        System.out.println("my name is jishan.");
    }
    int b=4;
    public static void main(String[] args) {
        ValueAccess ref=new ValueAccess();
        ref.jishan();
        System.out.println("value of a is "+ValueAccess.a);
        System.out.println("value of a is "+Value.a);
        System.out.println("value of b is "+ref.b);
        System.out.println("value of c is "+Value.c);
        
    } 
}
