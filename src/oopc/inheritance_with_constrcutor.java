package oopc;

public class inheritance_with_constrcutor {
    public static void main(String[] args) {
        SmallDemo sd = new SmallDemo();

        Z z = new Z(20);
        
    }
}

class Demo {

    Demo(int a) {
        System.out.println("Demo class constructor : "+ a);
    }

}

class SmallDemo extends Demo {

    // child class constructor always calls parent class default constcutor

    SmallDemo() {
        super(12); // 
        System.out.println("SmallDemo class constructor");
    }

    SmallDemo(int c) {
        super(12);
        System.out.println(" c is " + c);
    }

}

/////////////////////////////////////  constrcutor chaining //////////////////

class X {

    X() {
        
    }

    int myFunction(int a) {    // method
        System.out.println("X class constructor : " + a);
        return 10;
    }
}

class Y extends X {

    public Y(int a) {
        super.myFunction(13);
    }
    
}

class Z extends Y {
    Z(int a) {              // 20
        super(a-10);
    }
}
