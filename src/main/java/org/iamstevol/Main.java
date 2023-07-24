package org.iamstevol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Comparator<String> com = (String i, String j) -> {
            if (i.length() > j.length()) {
                return -1;
            } else {
                return -1;
            }

            //This could also be written like this
//            Comparator<String> com = (i, j) -> i.length() > j.length() ? 1:-1;
        };

        List<String> names = new ArrayList<>();
        names.add("Sad");
        names.add("as");
        names.add("safe");

        Collections.sort(names, com);
        System.out.println(names);
    }
}