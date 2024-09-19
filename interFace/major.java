        //interface


interface ClassA{
void firstMethod();
}
interface ClassB{
    void secondMethod();
   
}
interface ClassC{
    void thirdMethod();
}
public  class Major implements ClassA,ClassB,ClassC {
    @Override
    public void firstMethod(){
        System.out.println("this first method ");
    }
    @Override 
    public void secondMethod(){
        System.out.println("this is second method");
    }
    @Override
    public void thirdMethod(){
        System.out.println("this is third Method ");
    }
    public static void main(String[] args ){
        Major m=new Major();
        m.firstMethod();
        m.secondMethod();
        m.thirdMethod();
    }
    
}
