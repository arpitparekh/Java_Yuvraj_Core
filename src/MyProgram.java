public class MyProgram {
    public static void main(String[] args) {
        
        // factorial
        // fibonacci
        // prime
        // palindrome
        // armstrong
        // sum of digit
        // no of digit
        // factors // 12  // 1 2 3 4 6 12
        // harmonic numbers
        // perfect number
        // 6 // sum of factors

        // 4! = 4*3*2*1

        int n = 10;
        int i = 1;

        // 10*9*8*7*6*5*4*3*2*1

        int factorial = 1; // 1 // 2  // 6

        for (; i <= n;) {

            // 1..10
            // factorial = factorial * i;
            factorial *= i; // 2*3 = 6

            i++;
        }
        
        // fibonacci
        // 0 1 1 2 3 5 8 13

        int p = 0;  // 0  // 1  // 1 // 2 // 3  // 5
        int q = 1;  // 1  // 1 // 2  // 3  // 5  // 8

        int x = 10;

        for (i = 1; i <= x; i++) {

        System.out.print(p+" ");
            
        int r = p + q; 
        p = q;  
        q = r;

        }

    }
}
