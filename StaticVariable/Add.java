package StaticVariable;
//static without obj.
public class Add {
    public static int a=5;
    public static int b=5;
    public int c;
    public int adding(){
        this.c=Add.a+Add.b;
        System.out.println(c);
        
        return 0;
    }
}
