package org.iamstevol.collection;

import java.util.*;

public class CollectionMethods {

    public static void main(String[] args) {
        List<String> set1 = new ArrayList<>(Arrays.asList("Boy", "Girl", "Tree"));
        List<Integer> set2 = new ArrayList<>(Arrays.asList(10, 34, 12, 4));

//        try {
//            set2.removeIf(n -> n == 10);
//        } catch (UnsupportedOperationException e) {
//            System.out.println(set2);
//        } finally {
//            System.out.println(set2);
//        }

        Iterator<Integer> n = set2.iterator();
        while (n.hasNext()) {
            int ni = n.next();
            System.out.println(ni);
        }
    }
}


