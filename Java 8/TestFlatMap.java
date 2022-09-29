package com.example.com.example.funcationl;

import java.util.*;
import java.util.stream.Collectors;

public class TestFlatMap {

    public static void main(String[] args) {

        Map<String,Integer> map1=new HashMap<>();
        map1.put("a", 3);
        map1.put("ba", 4);


        Map<String,Integer> map2=new HashMap<>();
        map2.put("a", 3);
        map2.put("ba", 47);

        List< Map<String,Integer>>  list=new ArrayList<>();
        list.add(map1);
        list.add(map2);
        System.out.println(list);

        System.out.println(
                list.stream().map(Map :: keySet).collect(Collectors.toList()));
        System.out.println(
        list.stream().map(Map :: keySet).flatMap(Collection::stream).collect(Collectors.toList()));


    }
}
