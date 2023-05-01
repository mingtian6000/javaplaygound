package org.example.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//demos how to convert a list to map
//how to covert a map to list?
public class StreamCollector {
    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a","b","c","aa","bb","cc");
        Set<String> set1 = givenList.stream().collect(Collectors.toSet()); // default is hashSet
        List<String> list1 = givenList.stream().collect(Collectors.toList()); //default is arrayList

        System.out.println(set1.toString());
        System.out.println(list1.toString());
        // what if I don;t want default type?
        Set<String> set2 = givenList.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        List<String> list2 = givenList.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(set2.toString());
        System.out.println(list2.toString());

        //function.identity
        Map<String, Integer> map = givenList.stream().collect(Collectors.toMap(Function.identity(), String::length, (a, b)->a));
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);
        List<String> listFromMapKey = map2.keySet().stream().collect(Collectors.toList());
        List<Integer> listFromMapValue = map2.values().stream().collect(Collectors.toList());
        String[] arrFromMapKey = map2.keySet().stream().toArray(String[]::new);
    }
}
