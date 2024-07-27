package oopc;

public class MyContructor {
    public static void main(String[] args) {

        // oopc
        // class
        // object
        // variable and function assign
        // this keyword

        // constructor
        // constructor is method that calls automatically when we create an object of aclass
        // constructor is used to assign initial value to the variable of a class
        // constructor name and class name is same

        Dummy d = new Dummy(12, 34);
        
    }
}

class Dummy {
    int roll;
    int age;

    // Dummy() {   // default constructor
    //     System.out.println("This is constructor");
    // }

    Dummy(int roll, int age) { // parameterized constrcutor
        this.roll = roll;
        this.age = age;
        display();
    }
    
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Age: " + age);
    }

}
