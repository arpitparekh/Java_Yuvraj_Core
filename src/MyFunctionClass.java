public class MyFunctionClass {
    public static void main(String[] args) {
        Bascom b = new Bascom();

        int result = 34 + b.function();
        System.out.println(result);


        System.out.println(b.sum(12, 5));
        
    }    
}

class Bascom{

    public Bascom() {
        System.out.println("Constrcutor");
    }

    // function is a block of code that runs when we call it
    // function name
    // function parameters
    // function body
    // function return type

    int function() {
        return 23;
    }

    int sum(int a, int b) {
        return a + b;
    }

}