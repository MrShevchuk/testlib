package org.brainacad;

import java.util.List;

/**
 * Created by Brainacad4 on 24.06.2020.
 */
public class Main {

    public static void main(String[] args) {

        List<String> fruits = Lists.newArrayList("banana", "papaya", "apple", "kiwi");
        fruits.forEach(System.out::println);

        List<String> reverseFruits = List.reverse (fruits);
        reverseFruits.forEach(System.out::println);
    }

}
