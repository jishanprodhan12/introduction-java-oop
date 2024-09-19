
package MultiThreading;

class A extends Thread{
    @Override
     public void run(){
         try{
                      for (int i = 0; i < 5; i++) {
             System.out.println("chlid thread ");
             Thread.sleep(1000);
            }
         }
         catch(InterruptedException e){
             System.out.println("Exception handled ");
         }

     }
}
public class TestSleepExtends {
    public static void main(String[] args) throws InterruptedException {
        
        A t=new A();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("main thread ");
            Thread.sleep(500);
        }
    }
 
}
