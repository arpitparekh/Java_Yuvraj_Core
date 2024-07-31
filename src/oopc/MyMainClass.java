package oopc;

public class MyMainClass {
    public static void main(String[] args) {

        // oopc
        // class
        // object
        // functions  // function calling function
        // constructor

        // polymorphism
        // multiple function with same name

        // inheritance  // 
        // in inheritance we can use property and function of one class into another
        // we want to resue one class properties and function into another class

        Parent p = new Parent("Vinod", "Vastrapur", 56);
        Parent p1 = new Parent();

        // this keyword means class own instance

        Child c = new Child();
        c.name = "Pintu";
        c.age = 25;
        c.address = "Vastrapur";
        c.height = 23.34f;
        c.marks = 45;
        c.display();

    }
}

class Parent {

    String name;  // null
    String address;
    int age;

    Parent() {
        
    }

    Parent(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}


class Child extends Parent {

    float height;
    float marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age is : " + age);
        System.out.println("Height is : " + height);
        System.out.println("Marks are : " + marks);
    }

}

class A {
    void fun() {
        
    }
}

class B {
    void fun() {

    }
}

// class C  extends A,B{
    
// }

// multiple inheritance is not possible in java




