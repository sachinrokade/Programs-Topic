/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sroka
 */
public class KirshnaMusrtiNumber {
        // example  9
    //          9*9=81
     public static int fact(int n)
     {
         //n=5;
         int f=1;
         
         for(int i=1;i<=n;i++)
         {
              f=f*i;  
         }
         System.out.println("Fact of "+n+"is  Fact "+f);
         return f;
     }
     public static void main(String []args)
     {
        int n=145;
        
        int r=0,d=0;
        int sum=0;
        int t=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+fact(r);
            n=n/10;
        }
       System.out.println("Main sum "+sum+" and N "+t);
        if(sum==t)
            System.out.println("Kshirna "+t);
        else
            System.out.print("Not Kshirna "+t);
     }
}


