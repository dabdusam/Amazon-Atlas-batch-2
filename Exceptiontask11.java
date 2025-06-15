package Datastructure;

class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
}

public class Exceptiontask11 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

