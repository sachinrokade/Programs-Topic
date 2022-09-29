package com.example.interPro;

import java.util.*;

public class WordOccurenceCount {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("a","b","c","a","b");
        Map<String, Integer> map = new HashMap<String, Integer>();


        System.out.println(""+(10-10*10+10));
       // list.stream().distinct().filter(p->p%2!=0).forEach(a->System.out.println(a));



        for (String i:list){
            Integer j=map.get(i);
            //System.out.println(map.get(i));
            map.put(i,(j==null) ? 1 : j+1);
        }
        System.out.println(map);

        //CollectionsFrequency(list);
    }

    private static void CollectionsFrequency(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(list);
        for (Integer i:set){
            System.out.println(i+" = "+ Collections.frequency(list,i));
        }
    }
}
