
import java.util.Arrays;
import java.util.Scanner;


public class DuplicatesInArray
{
    public static void main(String[] args) 
    {
        
        Scanner s=new  Scanner(System.in);
        System.out.print("Size of arr");
       
        int i=0;
        int j=0;
        int arr[]={1,1,2,2,3,4,5,6,6,7,8,9};
        int as=arr.length;
        for(int k=0;k<=as-1;k++)
        {
                   System.out.print(" "+arr[k]);
        }
        int le=arr.length;
        System.out.println();
        for(i=0;i<=le-1;i++)
        {
            for(j=i+1;j<=le-1;j++)
            {
                if(arr[i]==arr[j])
                {
                      System.out.println("Duplicate is "+arr[i]);
                        arr[j]=arr[le-1];
                        le--;
                        j--;
                }
            }
        }
        int copy[]=new int[le];
        for(int k=0;k<=copy.length-1;k++)
        {
                    copy[k]=arr[k];
       //            System.out.print(" "+copy[k]);
        }
        
       int[] marr=Arrays.copyOf(arr,le);
       Arrays.sort(marr);
       for(int p:marr)
       {
                System.out.print(" "+p);
        }
        
       
    }
}
