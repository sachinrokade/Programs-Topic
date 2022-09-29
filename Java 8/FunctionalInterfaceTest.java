package com.example.com.example.funcationl;

@FunctionalInterface
interface FuncationB {

    public void testB();

}
@FunctionalInterface
interface FuncationSq {
    public void squre(int s);

}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        FuncationB b=()-> System.out.println("hi");

        FuncationSq sq=(a)-> System.out.println("Squre is "+(a*a));

        sq.squre(2);
        b.testB();

    }
}