    //  start(); run();
    package MultiThreading;

    class A extends Thread {
        @Override 
        public void run(){
            for(int i=1;i<=5;i++){
                System.out.println("child thread ");
            }
        }
    }
    public class TestThread {
        public static void main(String[] args ){
            A t=new A();
            t.start();
        }
    }
    