package overridding;


public class overriding {
    void eat(){
        System.out.println("cow eat grass");
    }
}
class dog extends overriding{
    @Override
    void eat(){
        System.out.println("dog eat goo");
    }

}

