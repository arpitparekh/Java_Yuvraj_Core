package oopc;

public class PolymorphismClass {

    public static void main(String[] args) {

        // polymorphism
        // poly  // morphism
        // many forms

        // method overloading
        // method overriding   // inheritance

        // method overloading
        // no of parameter
        // type of parameter
        // order of parameter must be different
        // return type does not have any effect on method overloading

        Fun f = new Fun();
        f.fun(12, "Yash");
        f.fun("Bascom", 23);

        A a = new A();
        System.out.println(a.yourNumber());

    }
}

class Fun {

    public void fun(String name, int a) {
        System.out.println("fun method : " + a + " " + name);
    }

    public int fun(int a, String name) {
        System.out.println("fun method :  " + a + " " + name);
        return 12;
    }

}

class A { // funciton returning a function
    
    B b;

    A() {
        b = new B();
    }

    int yourNumber() {
        return b.myNumber();
    }

}

class B {

    int myNumber() {
        return 12;
    }
    
}
