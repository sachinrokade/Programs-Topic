/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

public class ReverseWithoutStringAPI
{
    public static void main(String[] args)
    {

      String st="My Name is Earl";

        StringBuffer b=new StringBuffer();

        for(int i=st.length()-1;i>=0;i--){

            b.append(st.charAt(i)); }

        System.out.println("reverse:::"+b);
}
    
}
*/
class StringRev1
{
    public static void main(String args[])
    {
        String str = "I love My India";
        String temp = "";
        String finalString = "";
        for(int i =str.length()-1;i>=0;i--)
        {
            temp +=i!=0?str.charAt(i):str.charAt(i)+" ";
            if(str.charAt(i) == ' '||i==0)
            {
                for(int j=temp.length()-1;j>=0;j--)
                {
                    finalString += temp.charAt(j);
                }
                temp = "";
            }
        }
            System.out.println(finalString);
    }
}