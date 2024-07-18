public class Myconditions {
    public static void main(String[] args) {
        
        // condiitonal statement 
        // controls the flow the program

        // if else
        // if else ladder
        // nested if else
        // ternary operator
        // switch

        int h = 23;

        if (h > 30) {
            System.out.println("less then 30");
        } else {
            System.out.println("Not Less then 30");
        }


        boolean b = false;

        if (b || 12<34) {
            // if will run in this conditionl  
        } else {

        }

        // if else ladder

        int o = 66;

        if (o < 0) {
            System.out.println("Negative");
        } else if (o > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }
        

        // nested if

        int d = 34;

        if (d > 12) {
            if (d < 5) {
                System.out.println("inner if");
            } else {
                System.out.println("innner else");
            }
        } else {
            if (d < 5) {
                System.out.println("inner if 2");
            } else {
                System.out.println("innner else 2");
            }
        }

        // ternary operator

        // ?  :

        // if else one liner  // find greater of 2 numbers

        int number = (40 < 45) ? 45 : 40;

        System.out.println(number);

        // find maxium of 3 numbers using if else

        int a1 = 200;
        int b1 = 99;
        int c1 = 56;

        if (a1 > b1 && a1 > c1) {
            System.out.println(a1+" is greater");
        }else if(b1<c1){
            System.out.println(c1+" is greater");
        } else {
            System.out.println(b1 + "is greater");
        }
        
        // find maxium of 4 numbers using if else

        int a2 = 3499;
        int b2 = 444;
        int c2 = 544;
        int d2 = 94;
        
        if (a2 > b2 && a2 > c2 && a2 > d2) {
            System.out.println(a2+" is greater");
        } else if (b2 > c2 && b2 > d2) {
            System.out.println(b2+" is greater");
        } else if (c2 > d2) {
            System.out.println(c2+" is greater");
        } else {
            System.out.println(d2 + " is greater");
        }
        
        // find if number is divisable by 5 and 11

        int number1 = 55;

        if (number1 % 11 == 0 && number1 % 5==0) {
            System.out.println("is divisible");
        } else {
            System.out.println("is not divisible");
        }

        

    }
}
