/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shidhhi
 */
public class Challenage3 
{
    public static void main(String args[])
    {
        String s1="123ABC";
        String s2="456DEF";
        int s1As=0;
        int s2As=0;
        char a,b;
        int i=0;
        while(i<s1.length())
        {
            a=s1.charAt(i);
            b=s2.charAt(i);
            s1As=s1As+(int)a;
            s2As=s2As+(int)b;
            i++;
        }
        int as=s1As-s2As;
        System.out.print(as);
        
    }
}
