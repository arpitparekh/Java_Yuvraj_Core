package oopc;

public class MyKeywords {

    public static void main(String[] args) {

        // this
        // super
        // static
        // final
        High h = new High(177);
        High h1 = new High(77);
        High h2 = new High(67);

        System.out.println(High.b);
        System.out.println(h.a);

        System.out.println();

        System.out.println(High.b);
        System.out.println(h1.a);

        System.out.println();

        System.out.println(High.b);
        System.out.println(h2.a);

        High.b = 45;

        System.out.println(High.b);
        System.out.println(h.a);

        System.out.println();

        System.out.println(High.b);
        System.out.println(h1.a);

        System.out.println();

        System.out.println(High.b);
        System.out.println(h2.a);

        h1.display();
        High.fun();
        
    }
}

class High {

    final int num = 23;

    static { // singleton
        System.out.println("Static block");
    }

    static int b = 12;
    int a = 12;

    High() {
        System.out.println("Constructor");
    }

    High(int a) {
        this.a = a;
    }

    final void display() {
        b = 23;
    }

    static void fun() {
        System.out.println("Fun method");
    }
}

class Low extends High {

}
