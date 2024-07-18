public class MyLoops {
    public static void main(String[] args) {
        
        // while loop
        // do..while loop
        // for .. loop
        // for in loop

        // initial value
        // condition
        // increment // decrement

        int a = 1;

        while (a < 10) {
            System.out.println(a);
            a++;
        }

        // print first 100 even numbers

        // 2 4 6 8 10

        System.out.println();

        int g = 2;

        while (g <= 100) {

            if (g % 2 == 0) {
                System.out.println(g);
            }

            g++;

        }
        
        // do..while

        // initial value
        // increment decrement
        // condtions

        System.out.println();

        int k = 0;

        do {
            System.out.println(k);  // 0  // 1
            k++;  // 1  // 2
        } while (k < 20); // 1<20  // 2<20

        // for loop

        // intial value
        // condition
        // increment // decrement in one staement

        System.out.println();

        for (int h1 = 20, k1=30; h1 >= 1 && k1>=20; h1--,k1--) { 
            System.out.println(h1 +" "+ k1);
        }

    }
}
