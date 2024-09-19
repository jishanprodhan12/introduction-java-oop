
package incapsulation;


public class person {
    private String name;
    private int age;
    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public  void setAge(int age){
        this.age=age;
        if(age<=0){
            throw new IllegalArgumentException("age is  never negative ");
        }
    }
    public int  getAge(){
        return age;
    }
}
