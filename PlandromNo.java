/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sroka
 */
public class PlandromNo 
{
     public static void main(String []args)
     {
        int n=535;
        int t=n;
        int re=0;
        int r=0,d=0;
        while(n!=0)
        {
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        //System.out.print("sum "+sum+"and N "+n);
        if(t==re)
            System.out.print("Paln "+t);
        else
            System.out.print("Not Paln "+t);
     }    
}
