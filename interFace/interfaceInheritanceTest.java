                //interface inheritance 


interface Sum{
    void sum();
}
interface Sub extends Sum{
    void sub();
}
class SumSub implements Sub{
    @Override
    public void sum(){
        int a=10,b=2;
        int c=a+b;
        System.out.println("sum of "+a+" and "+b+" is  :"+c);
    }
     @Override
    public void sub(){
        int a=122,b=2;
        int c=a-b;
        System.out.println("sum of "+a+" and "+b+" is :"+c);
    }
}
public class interfaceInheritanceTest extends SumSub{
    public static void main(String[] args) {
        interfaceInheritanceTest obj=new interfaceInheritanceTest();
        obj.sum();
        obj.sub();
    }
}
