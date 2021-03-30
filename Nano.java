    // example  9
    //          9*9=81
    //          8+1=9
public class Nano
{
    
     public static void main(String []args)
     {
        int n=9;
        int sq=n*n;  //81
    
        int r=0,d=0;
        int sum=0;
        while(sq!=0)
        {
            r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        //System.out.print("sum "+sum+"and N "+n);
        if(sum==n)
            System.out.print("Nano "+n);
        else
            System.out.print("Not Namo "+sum);
     }
}
