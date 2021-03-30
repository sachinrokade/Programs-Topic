
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin
 */
public class CollArryList1 
{
    public static void main(String args[])
    {
        List<Integer> al=new ArrayList<Integer>();
        
        
        
        al.add(1);
        al.add(2);
        al.add(3);         
        al.add(4);
        
        System.out.println(al);
        try
        {
            while(true)
            {
            Collections.shuffle(al);
            System.out.println("al "+al);
            }
            
        }
         catch(Exception e)
         {
             
         }
        
        
                    
    }
}
