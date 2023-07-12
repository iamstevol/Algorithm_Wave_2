package org.iamstevol;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        //WHILE LOOP
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        char letter = 'A';
        while (letter <= 'z') {
            System.out.println(letter);
            letter++;
        }
//
//        //DO-WHILE LOOP {POST-TEST LOOP}
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            System.out.println("Type a number: ");
            value = scanner.nextInt();
            System.out.println(value);
        } while (value != 0);

        System.out.println("Hi");
        Scanner scanner1 = new Scanner(System.in);
        int sum = 0;
        while (scanner1.hasNextInt()) {
            int elem = scanner1.nextInt();
            sum += elem;
        }
        System.out.println(sum);


    }
}
