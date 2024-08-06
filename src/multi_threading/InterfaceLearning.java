package multi_threading;

public class InterfaceLearning {

    public static void main(String[] args) {

        // multi threading
        // more then one process at single time
        // Thread
        System.out.println("Hello");

        // Thread
        // System.out.println(Thread.currentThread().getName()); // 1..5 (5 is highest priority) (1 is lowest)

        // there is 2 way to make a thread
        // by extending a thread class
        // by implementing an Runnable interface

        Rectangle r = new Rectangle();
        System.out.println(r.getSum(10, 20));
        System.out.println(r.getMul(12, 13));

    }
}

abstract class Area implements MyInterface {

    int a = 12;

    void fun() {

    }

    abstract void display();

}

interface MyInterface { // is collection of abstract method
    int getSum(int a, int b);

    int getMul(int a, int b);
}

interface MyInterface2 {  // is collection of abstract method

    int getSub(int a, int b);
}

class Circle extends Area {

    @Override
    void display() {

        System.out.println("This is display method");
    }

    @Override
    public int getSum(int a, int b) {
        return a + b;
    }

    @Override
    public int getMul(int a, int b) {
        return a * b;
    }
}

class Rectangle implements MyInterface, MyInterface2 {

    @Override
    public int getSum(int a, int b) {

        return a + b;
    }

    @Override
    public int getMul(int a, int b) {

        return a * b;

    }

    @Override
    public int getSub(int a, int b) {
        return a - b;
    }

}

interface I1 {
    void dummy();
}

interface I2 extends I1 { 
    void dummy2();
}

class D implements  I2{

    @Override
    public void dummy() {
       
    }

    @Override
    public void dummy2() {
       
    }
    
}
