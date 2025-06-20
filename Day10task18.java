class Test extends Thread{
    public void run(){
        System.out.println("thread started.");
    }
}

public class Day10task18 {
    public static void main(String args[]){

        Test t1 = new Test();

        t1.run();
    }
}