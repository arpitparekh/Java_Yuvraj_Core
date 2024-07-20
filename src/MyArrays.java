
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

        // group of similar similar type of datatype into one datatype

        int arr[] = { 1, 2, 3, 45, 6, 7, 8 };

        String names[] = { "Bascom", "Tops", "Dapple" };

        // fixed size
        // can't add or remove elements
        // can't change the size of the array
        // can't change the datatype of the array

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // for in ( : )

        for (String item : names) {
            System.out.println(item);
        }
        // Arrays
        System.out.println(Arrays.toString(arr));

        System.out.println(names[1]);

    }
}
