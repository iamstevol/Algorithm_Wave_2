package org.iamstevol;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class New {

    public static void main(String[] args) {

        List<Integer> nu = Arrays.asList(1,2,3,3);

        //The simplified mode
        Function<Integer, Integer> n2 = n -> n * 2;

        Function<Integer, Integer> n1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Predicate<Integer> num = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        /* Also parallelStream could be used to stream the data,
        which helps to spin multiple thread that helps to make the class run faster,
        It's better to use it on filter */

        Integer n = nu.stream().reduce(1, (c, e) -> c * e);
        System.out.println("nekwe");
        System.out.println(n);
    }
}
