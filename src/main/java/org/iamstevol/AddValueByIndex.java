package org.iamstevol;

import java.util.Arrays;
import java.util.Scanner;

public class AddValueByIndex {
    // write a method here

    // don't change the code below

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add your array");
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        System.out.println("Input the index");
        int index = scanner.nextInt();
        System.out.println("Input the value you want to add");
        long value = scanner.nextLong();
        addValueByIndex(index, value, array);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void addValueByIndex(int index, long value, long... array) {
        try {
            if (index >= 0 && index < array.length) {
                array[index] += value;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
    }
}
