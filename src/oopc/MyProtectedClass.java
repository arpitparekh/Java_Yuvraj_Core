package oopc;

public class MyProtectedClass {

    int a = 12;                // default
    public int b = 34;         // everywhere
    private int c = 55;        // no outside class
    protected int k = 77; // only for child
    
    protected void myFunction(){
        System.out.println("Hello");
    }

}


class AnotherProtectedClass extends MyProtectedClass {
    
    void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        // System.out.println("Value of c: " + c);
        System.out.println("Value of k: " + k);

    }

    public static void main(String[] args) {
        AnotherProtectedClass obj = new AnotherProtectedClass();
        obj.display();
    }

}
