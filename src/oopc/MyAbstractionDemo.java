package oopc;

public class MyAbstractionDemo {

    // कोई सामान्‍य धारणा जिसका आधार कोई वास्‍तविक व्‍यक्ति, वस्‍तु या स्थिति न हो
    public static void main(String[] args) {

        // abstarct class
        // abstract class no object nai bane
        // abstract class gives implementation to another class
        SharifEmployee se = new SharifEmployee();
        se.fun();
        se.display();
        
    }

}

abstract class KamchorBoss {   // kam chor boss

    // we can create one more abstract method inside abstract class
    int a = 12;

    void display() {
        System.out.println("display method");
    }

    abstract void fun();  // abstract method is the method without any body
}

class SharifEmployee extends KamchorBoss {

    @Override
    void fun() {
        System.out.println("fun method");
    }

    @Override
    void display() {
        super.display();

        System.out.println("This is Child Display");
    }

}
