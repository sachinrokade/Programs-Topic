/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shidhhi
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternCap 
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //String li[]=new String[3];
       // li[0]=in.nextLine();
       // li[1]=in.nextLine();
        //li[2]=in.nextLine();
        //capsOut(li[0]);
        //capsOut(li[1]);
        //capsOut(li[2]);
        capsOut("awdjkasd102");
        
    }
    public static void capsOut(String in)
    {
        String words[]= in.split(" ");
        for(String word:words)
        {
            Pattern pat = Pattern.compile("^[A-Z]");
            Matcher match = pat.matcher(word);
            if(match.find())
                System.out.println(word);
        }
        
    }

}