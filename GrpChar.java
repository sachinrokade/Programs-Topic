/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shidhhi
 */
class GrpChar
{
     public static void main(String[] args) 
    {
        String msg ="Sachin";
        int len,i,j;
        
         char[] toCharArray = msg.toCharArray();
         len=msg.length();
         for(i=0;i<len;i++)
         {
             System.out.print(" "+toCharArray[i]);
         }
    }
    
}
