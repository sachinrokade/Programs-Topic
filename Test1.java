import java.math.*;
class TestC
{
    int x;
    public void add(int a)
    {
        x=a+1;
    }
    public void add(int a,int b)
    {
        System.out.println( "Value of A is : " +a);
        x=a+2;
    }
}
public class Test1
{
    public static void main(String ar[])
    {
        TestC s=new TestC();
        s.add(6+2,7);
        System.out.println( "Value of X is : " +s.x);

        int n=12;
        int r,d = 0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d=d+r;
            
        }
            
        System.out.println("Math: " +Math.round(4.7));

        
        StringBuilder sb=new StringBuilder("I Like Java");
        System.out.println( "Value of b is : " +sb.charAt(3) );

        //String s=String.format("%06d",4);
        System.out.println(" String "+s);
        System.out.println(" Sum of Digit is "+d);
        System.out.println(Integer.toBinaryString(12));
    }
}
