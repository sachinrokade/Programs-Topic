/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sroka
 */
class A 
{
    String a="A";
 }

class B extends A
{
    String a="B";
    {
        System.out.println(super.a);
    }
}
class C extends B
{
    String a="C";
    {
        System.out.println(super.a);
    }
}

public class Inher 
{
    public static void main(String ar[])
    {
        C c=new C();
       // System.out.println(c.a);
    }
}
