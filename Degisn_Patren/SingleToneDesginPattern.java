package com.example.DP;

public class SingleToneDesginPattern {

    public static SingleToneDesginPattern singleToneDesginPattern;

    private SingleToneDesginPattern(){

    }

    public static SingleToneDesginPattern getInstance(){

        if(singleToneDesginPattern==null)
        {
            singleToneDesginPattern= new SingleToneDesginPattern();
           return singleToneDesginPattern;
        }
            return singleToneDesginPattern;
    }
}

class Test{
    public static void main(String[] args) {

        SingleToneDesginPattern s=SingleToneDesginPattern.getInstance();
        SingleToneDesginPattern s2=SingleToneDesginPattern.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}