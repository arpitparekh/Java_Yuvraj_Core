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

    static {                                      // singleton
        System.out.println("Static block");
    }

    static int b  = 12;
    int a = 12;

    High(int a) {
        this.a = a;
    }

    void display() {
        b = 23;
    }

    static void fun() {
        System.out.println("Fun method");
    }

}
