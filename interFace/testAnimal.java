        //interface Animal


interface Animal{
    void legs();
    void sleep();
    void eat();
    void sound();
}
 class Cow implements Animal{
    @Override
    public void legs(){
        System.out.println("have four legs ");
    }
    @Override
    public void sleep(){
        System.out.println("cow sleeping ");
    }
    @Override 
    public void eat(){
        
        System.out.println("Eating Grass ");
    }
    @Override 
    public void sound(){
        System.out.println("hamba hamba ");
    }
}
class Dog extends Cow{
    @Override
    public void legs(){
        System.out.println("have four legs ");
    }
    @Override
    public void sleep(){
        System.out.println("dog sleeping ");
    }
    @Override 
    public void eat(){
       // super.eat();
        System.out.println("Eating meat ");
    }
    @Override 
    public void sound(){
        System.out.println("boww bow ");
    }
}
class Cat extends Dog{
    @Override
    public void legs(){
        System.out.println("have four legs ");
    }
    @Override
    public void sleep(){
        System.out.println("cat sleeping ");
    }
    @Override 
    public void eat(){
        
        System.out.println("Eating milk ");
    }
    @Override 
    public void sound(){
        System.out.println("meo meo ");
    }
}
public class testAnimal extends Cat{
    public static void main(String[] args) {
        testAnimal t=new testAnimal();
        Cow c=new Cow();
        Dog d=new Dog();
        Cat ca=new Cat();
        c.legs(); c.sound(); c.eat(); c.sleep();
        d.legs(); d.sound(); d.eat(); d.sleep();
        ca.legs(); ca.sound(); ca.eat(); ca.sleep();
        
    }
    
}
