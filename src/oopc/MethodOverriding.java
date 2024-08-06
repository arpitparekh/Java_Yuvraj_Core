package oopc;

public class MethodOverriding {
    public static void main(String[] args) {
         Gun g = new Gun();
         g.jump();
   }
}

class Fun {
    void jump() {
        System.out.println("Fun is jumping");
    }

}

class Gun extends Fun {

    @Override
    void jump() {
        System.out.println("Gun is jumping");
    }

}
