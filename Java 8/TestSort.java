package com.example.com.example.funcationl;

import java.util.*;
import java.util.stream.Collectors;

public class TestSort {
    public static void main(String[] args) {

        String s="Rahul";
        
        stringCharSort("DBCA");

        Emp em3 = new Emp(6,3);
        Emp em2 = new Emp(4,2);
        Emp em1 = new Emp(1,4);

        List<Emp> list=new ArrayList<>();
        list.add(em1);
        list.add(em2);
        list.add(em3);

        //secondH(list);
        allCom(list);
        System.out.println(
                list.stream()
                        .sorted(Comparator.comparing(Emp :: getSal)
                        .thenComparing(Emp::getId)).collect(Collectors.toList())
        );
        System.out.println(
        list.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).collect(Collectors.toList()));
    }

    private static void allCom(List<Emp> list){
        Comparator<Emp> byId=(Emp e1,Emp e2)->Integer.compare(e1.getId(), e2.getId());
        Comparator<Emp> byName=(Emp e1,Emp e2)->Integer.compare(e1.getSal(), e2.getSal());

        System.out.println("All SOrt"+
        list.stream().sorted(byName.thenComparing(byId)).collect(Collectors.toList())
        );

    }
    private static void secondH(List<Emp> list) {
        Optional<Emp> emp = list.stream()
                .sorted(Comparator.comparingInt(Emp::getSal).reversed()).skip(1).findFirst();

        System.out.println(
                " 2nd"+ emp.get()
        );

    }

    private static void stringCharSort(String str) {


        List<Character> list= str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(
                " ABC"+
                list.stream().sorted().collect(Collectors.toList())
        );

    }

}
 class Emp {
    int sal;
    int id;
     public Emp(int sal,int id) {
        this.id=id;
        this.sal=sal;
     }

     public int getSal() {
         return sal;
     }

     public void setSal(int sal) {
         this.sal = sal;
     }

     public int getId() {
         return id;
     }

     public void setIdl(int id) {
         this.id = id;
     }

     @Override
     public String toString() {
         return "Emp{" +
                 "sal=" + sal +
                 ", id=" + id +
                 '}';
     }
 }

