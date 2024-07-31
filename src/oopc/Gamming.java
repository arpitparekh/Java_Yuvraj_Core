package oopc;

public class Gamming {

    public static void main(String[] args) {

        Client c = new Client(23);
        // System.out.println(c.f1(77));


        int result = 20 + c.f1(56);
        System.out.println(result);



        // output
        // 450
        // 56
        // 

    }
}

class Hover {

    Hover() {

    }

    public Hover(int x) {
        f1(x * 10);
    }

    int f1(int num) {
        System.out.println(num);
        return num + 56;
    }

}

class Fly extends Hover {

    Fly(int f) {
        super(45);
    }

}

class Client extends Fly {

    Client(int j) {
        super(34);
    }

}
