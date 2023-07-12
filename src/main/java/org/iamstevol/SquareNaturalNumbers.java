package org.iamstevol;

import java.util.Scanner;

public class SquareNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int input = scanner.nextInt();
        while (num * num <= input) {
            int square = num * num;
            System.out.println(square);
            num++;
        }
    }
}
