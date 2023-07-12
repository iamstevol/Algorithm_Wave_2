package org.iamstevol;

import java.util.Scanner;

public class AnonymousReversedString {

    public static void main(String[] args) {
        System.out.print("Insert a word: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                String reversedWord = "";
                String[] splitWord = str.split("");
                for (int i = splitWord.length - 1; i >= 0 ; i--) {
                    reversedWord += splitWord[i];
                }
                return reversedWord;
            }
        };
        System.out.println(reverser.reverse(line));
    }
}

interface StringReverser {
    String reverse(String str);
}
