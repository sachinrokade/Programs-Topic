/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shidhhi
 */
public class Test2
{
    public void sawpArray(int a1[],int a2[])
    {
        int l=a1.length+a2.length;
        int t1[]=new int[l];
        System.out.print(" B4 Swaping of Arrey");
        System.out.println("A1 ");
        for(int i=0;i<a1.length;i++)
        {
            System.out.print("\nA1 "+a1[i]+"   A2 "+a2[i]);
        }
       
        System.out.println("\n After Swaping of Arrey");
        
        for(int k=0;k<=t1.length;k++)
        {
            
        /*
            t1[k]=a1[k];
            a1[k]=a2[k];
            a2[k]=t1[k]; */
            a1[k]=a1[k]+a2[k];
            a2[k]=a1[k]-a2[k];
            a1[k]=a1[k]-a2[k];

            System.out.print("\nA1 "+a1[k]+"    A2 "+a2[k]);
            //System.out.print("\nA2 "+a2[k]);
        }
    }
    public void rev(int n)
    {
        
        int r,d;
       
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            System.out.print(" "+r);
        }
    }
    public static void main(String ar[])
    {
        int a[]={10,20,30,40};
        int b[]={50,60,70,80};
       
        String s="sms";
        String L="sms package";
        System.out.print("String Com "+s.compareTo(L));

        
        
        Test2 t=new Test2();
       // t.rev(654);
        t.sawpArray(a,b);
    }
}
