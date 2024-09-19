        //interface to value 

interface myInterface {
    static int a=12;
}
public class testInterfaceOfValue implements myInterface{
    static int b=120;
    int c=420;
    int d=a+b+c;
    public static void main(String[] args) {
        testInterfaceOfValue obj=new testInterfaceOfValue();
        System.out.println("value of a is : "+myInterface.a);
        System.out.println("value of b is : "+testInterfaceOfValue.b);
        System.out.println("value of c is : "+obj.c);
        System.out.println("value of d is : "+obj.d);
    }
}
