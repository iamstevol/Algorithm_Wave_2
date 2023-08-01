package org.iamstevol;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {
        String str = "This is a boy";
        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str) {
        String[] newWord = str.split(" ");
        String[] result = new String[newWord.length];
        String newOne = "";
        for(int i = newWord.length - 1; i >= 0; i--) {
            result[(newWord.length - 1) - i] = newWord[i];
        }
        newOne = String.join(" ", result).trim();

        return (newOne);
    }

    public static String reverseCharacter(String str) {
        StringBuilder new1 = new StringBuilder(str);
        new1.reverse();
        return String.valueOf(new1);
    }
}
