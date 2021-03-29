
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sachin
 */
public class Pascal_Trangle 
{
    public int fact(int n)
    {
        int i;
        int f=1;
        for(i=1;i<n;i++)
        {
            f=f*i;
        }
            return f;
        
    }
    public static void main(String args[])
    {
        int a[]={60,60,20,30,10,10,50};
        Pascal_Trangle p=new Pascal_Trangle();
        //p.pass(5);
       // p.diamondPTR(10);
        
        for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
        p.removeDUP(a);
        
    }
    public void removeDUP(int[] arr)
    {
        int len=arr.length;
        
        for(int i=0;i<=len-1;i++)
        {
            for(int j=i+1;j<=len-1;j++)
            {
                if(arr[i]==arr[j])
                {   
                    System.out.println("\nDuplicate is "+arr[i]);
                    arr[j]=arr[len-1];
                
                j--;
                len--;
                }
            }
        }
        int[] copyOf = Arrays.copyOf(arr,len);
        for(int i:copyOf)
        {
            System.out.print(" "+i);
        }
    }
    public void diamondPTR(int row)
    {
        int r,c,space;
        
        space=row-1;
        for(r=1;r<row;r++)
        {
                for(c=1;c<=space;c++)
                        System.out.print(" ");
                
                space--;
                for(c=1;c<=2*r-1;c++)
                        System.out.print("*");
                
                System.out.println();
       }
        space=1;
        for(r=1;r<row;r++)
        {
                for(c=1;c<=space;c++)
                        System.out.print(" ");
                
                space++;
                for(c=1;c<=2*(row-r)-1;c++)
                        System.out.print("*");
                
                System.out.println();
       }
    }
    public void pass(int n)
    {
        
        int i,c;
        for(i=0;i<n;i++)
        {
                for(c=0;c<=(n-i-2);c++)
                    System.out.print(" ");
                
                for(c=0;c<=i;c++)
                    System.out.print("*");//+fact(i)/fact(c)*fact(i-c));
                
                
                System.out.print("\n");
        }
        
    }
    
}
