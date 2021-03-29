/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sroka
 */
public class AddInString 
{
    public static void main(String[] args) 
    {
        String s1 = " 8 7 3";
        String arr[] = s1.trim().split(".*[^0-9].*"); // Please note a space is there after Z ".*[^0-9].*"  "[a-zA-Z ]+"
 
 
        for (int i = 0; i < arr.length; i++)
        {        
 //           sum += Integer.parseInt(arr[i]);
            System.out.println(arr[i]);

        
        }
   //     System.out.println(sum);
    }
}
