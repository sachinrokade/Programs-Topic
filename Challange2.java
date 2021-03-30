/*
 * Programming Challenges Question - 2
Sam wants to select a username in order to register on a website.
The rules for selecting a username are:

1. The minimum length of the username must be 5 characters and the maximum may be 10.
2. It should contain at least one letter from A-Z
3. It should contain at least one digit from 0-9
4. It should contain at least one character from amongst @#*=
5. It should not contain any spaces
public class Challange2 
{
    String uname;
    int ascii;
    int length,i;
    public String chaeck(String name)
    {
        uname=name;
        length=uname.length();
        char toChA[] = null;
        for(i=0;i<=length;i++)
        {
            char ch=uname.charAt(i);
            ascii=(int)ch;
            toChA[i]=(char) ascii;
            if(length>=5&&length<=10)
            {
                
                 System.out.println(toChA[i]);
            }
            return "Fall";
        }
        return "0";
    }
    public static void main(String args[])
    {
        Challange2 ch=new Challange2();
        String r=ch.chaeck("AZZZ09");
        System.out.println(r);
    }
}

 */


import java.util.regex.*;
import java.util.Scanner;

public class Challange2 {

    public static void main(String[] args) 
    {
        String[] Array = new String[4];
        try (Scanner in = new Scanner(System.in)) {
            String pattern = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";
            
            for (int i = 0; i < Array.length; i++) 
            {
                Array[i] = in.nextLine();
            }
            System.out.println(""); //print empty line
            
            for (int i = 0; i < Array.length; i++)
            {
                if (Array[i].matches(pattern))
                {
                    System.out.println("PASS");
                }
                else {
                    System.out.println("FAIL");
                }
            }
        }

    }
} //*/
