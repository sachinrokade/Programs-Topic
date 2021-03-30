/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidhhi
 */
class DivedBy5 extends Exception
{
    public DivedBy5()
    {
        
       // System.out.println("Dived By");
    }
    public String getMsg()
    {
        return "Divied by 5 class";
        
    }
    
}
public class ExecptionM 
{

    /**
     *
     * @param ar
     * @throws DivedBy5
     */
    public static void main(String ar[])throws DivedBy5
    {
        String s1="10fsafas20sssa66";
        int sum=0;
        String[] split = s1.trim().split("[a-zA-Z ]+");
        for (String split1 : split) 
        {
            sum = sum + Integer.parseInt(split1);
            System.out.println("No is found in "+sum);
        }
    }
    
}
