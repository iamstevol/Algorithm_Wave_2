package org.iamstevol;

import java.io.IOException;

public class ArrayIndex {

    static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        try {
            System.out.println(array);
        } catch (Exception e) {
            System.out.println("Index not found");
        }

    }
}
