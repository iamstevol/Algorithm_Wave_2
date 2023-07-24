package org.iamstevol;

import java.util.*;

public class Student implements Comparable<Student> {
    int age;
    String colour;

    @Override
    public int compareTo(Student that) {
        if (this.colour == "White") {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> col = new ArrayList<>(Arrays.asList("Yellow", "White", "Black"));

        Collections.sort(col);
        System.out.println(col);
    }

}
