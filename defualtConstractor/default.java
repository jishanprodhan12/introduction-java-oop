
package defualtConstractor;


public class defualt {
    int a; String b; boolean c;
    //cons
    defualt(){
        a=30; b="coke"; c=true;
    }
    //method 
    void dis(){
        System.out.println(a+" "+b+" "+c);   
    }
    //method overloading
    void dis(int x){
        System.out.println("method overloading ");
        System.out.println(x);
        
    }
    
}
