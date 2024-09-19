
interface Value{
   static int a=5;
    void jishan();
    int c=10;
    
}

public class valueAccess implements Value {
    @Override
    public void jishan(){
        System.out.println("my name is jishan.");
    }
    int b=4;
    public static void main(String[] args) {
        valueAccess ref=new valueAccess();
        ref.jishan();
        System.out.println("value of a is "+valueAccess.a);
        System.out.println("value of a is "+Value.a);
        System.out.println("value of b is "+ref.b);
        System.out.println("value of c is "+Value.c);
        
    } 
}