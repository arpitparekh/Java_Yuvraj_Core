
import java.util.Arrays;

public class ArrayProgram {

    public static void main(String[] args) {
        
         /*
         
         Program
         Given an array Arr[] of size N.
         For every element in the array, the task is to find the index of the farthest element 
         in the array to the right which is smaller than the current element
         and make an array of that element's index.
         
         [12,45,57,4,2,565,1,34,75,56,34,45]
         
         * 
         */
        
         int arr[] = { 12, 45, 57, 4, 2, 565, 1, 34, 75, 56, 34, 45 };

         for (int i = 0; i < arr.length; i++) {

             int smallest = arr[i]; // 12
             int index = i;

             for (int j = i + 1; j < arr.length; j++) {

                 if (arr[j] < smallest) {
                     smallest = arr[j];
                     index = j;
                 }
             }

             arr[i] = index;
         }
         
         System.out.println(Arrays.toString(arr));

         /*
          
         
         Given an array arr[], 
         the task is to replace every element of the array with the sum of elements 
         on its right side.
         
          */

          int arr2[] = { 12, 45, 57, 4, 2, 565, 1, 34, 75, 56, 34, 45 };

        for (int i = 0; i < arr2.length; i++) {

            int sum = 0;
                
            for (int j = i + 1; j < arr2.length; j++) {

                sum = sum + arr2[j];

            }

            arr2[i] = sum;

        }
         
         System.out.println(Arrays.toString(arr2));

        /*
         
         Given an array arr[] of N integers, 
         the task is to find the number of pairs of array elements (arr[i], arr[j]) 
         such that the difference between the pairs is equal to the difference when the digits of 
         both the numbers are reversed. 

         {1,2,4,68,78,8,6,4,3,5,6,7,7,5,4} = 78-68  == 87-86
         
        */

    }
    
}
