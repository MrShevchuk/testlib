package org.brainacad;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Brainacad4 on 24.06.2020.
 */
public class Main {

    public static void main(String[] args) {

        List<String> fruits = Lists.newArrayList("banana", "papaya", "apple", "kiwi");
        fruits.forEach(System.out::println);

        Set<Integer> testSet = Sets.newLinkedHashSet();
        Set<Integer> testSetNative = new


        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);

        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("key", "first");
        map.put("key", "second");
        System.out.println(map);


        Map<String, List<String> oldMap =  new HashMap<>();
        if (oldMap.containsKey("Key"))



    }

}
