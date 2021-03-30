
import java.util.Scanner;

public class ArrayDele  
{
    public static void main(String args[])
    {
        int ar[]={10,20,30,50,40,60,80};
        int d=0;
        int p=0;
        int f=0;
            
        Scanner s=new Scanner(System.in);
        System.out.println("Loc = value");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("["+i+"]="+ar[i]);
        }
        System.out.print("enter loc in above list to deleted");
        d=s.nextInt();
        int a=0;
        if(d>=ar.length)
            System.out.print("not is Deleted ");
        
        for(int i=0;i<ar.length;i++)
        {
            if(i==d)
            {
                p=i;
                f=1;
                break;
            }
        }
        if(f==1)
        {
            for(int j=p;j<ar.length-1;j++)
            {
                ar[j]=ar[j+1];
            }
            for(int i=0;i<ar.length-1;i++)
            {
            System.out.println("["+i+"]="+ar[i]);
            }
            System.out.print(ar[p]+" is Deleted");
        }
      }
}
