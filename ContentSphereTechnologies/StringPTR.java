/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContentSphereTechnologies;

/**
 *
 * @author sroka
 */
public class StringPTR 
{
   public static void main(String[] args) 
   {
       System.out.print(""+MatchesPattern("abcjkhkhabckhbkkabc","abc"));
    }
    public static int MatchesPattern(String msg,String p)
    {
        int c=0;
        char pattern[]=p.toCharArray();
        char s[]=msg.toCharArray();
        for (int i = 0; i < s.length; i++)
        {
            //if(!s[i].equals(pattern[i%pattern.length])
            if(msg.charAt(i)==p.charAt(i%p.length()))
            {
                c++;
            }
            
        }
        return c;
    }
}
