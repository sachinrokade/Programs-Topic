
public class AddWioutPl 
{

    public static void main(String[] args) 
    {
            int a=20;
            int b=10;
            while (b != 0)
            {
            	int carry = (a & b) ;
		a = a ^b;
		b = carry << 1; //shifts carry to 1 bit to calculate sum
            }
       System.out.println(a);
    
       int c[]=new int[5];
       for(int i=0;i<c.length;i++)
       {
           System.out.println(""+c[i]);
       }
    }
}
