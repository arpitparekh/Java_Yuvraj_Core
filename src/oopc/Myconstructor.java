package oopc;

public class Myconstructor {

    public static void main(String[] args) {

        L l = new L();

        // 25
        // 12
        // 34

    }

}

class K {

    K() {                      // this refer to the current class instance
        this(12);
        System.out.println(34);
    }

    K(int a) {
        this(15, 10);   
        System.out.println(a);
    }

    K(int a,int b){
        System.out.println(a+b);
    }

}

class L extends K{    // super refer to the parent class instance

    L() {
        
    }
    
}
