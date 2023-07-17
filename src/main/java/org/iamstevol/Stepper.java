package org.iamstevol;

import java.util.Arrays;

public class Stepper {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int steps = 2;
        rotate(arr, steps);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static void rotate(int[] arr, int rotation) {
    //Two solutions to this same problem
        //Solution 1
        if (arr.length <= 1) {
            return; // No need to rotate if array has 0 or 1 element
        }

        int n = arr.length;
        rotation = rotation % n; // Adjust rotation if it's larger than array size

        // Perform rotation
        for (int i = 0; i < rotation; i++) {
            int lastElement = arr[n - 1];

            // Shift elements to the right
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            // Place the last element at the front
            arr[0] = lastElement;
        }

    //Solution 2
        int counter = 0;
         int last = arr[arr.length - 1];
        while(counter < rotation) {
//            int last = arr[arr.length - 1];
            for(int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            counter++;
        }
    }
}
