package org.iamstevol;

import java.util.Arrays;

public class BrokenOrder {

    public static void main(String[] args) {
        int[] n = {1, 3, 2,5};

        System.out.println(Arrays.toString(checker(n)));
    }


    static int[] checker(int[] arg) {
        int temp;
        for (int i = 1; i < arg.length; i++) {
            if(arg[i] < arg[i - 1]) {
                temp = arg[i - 1];
                arg[i-1] = arg[i];
                arg[i] = temp;
            }
        }
        return arg;
    }
}
