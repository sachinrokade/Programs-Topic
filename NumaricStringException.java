class MyException extends Exception
{
    public MyException(String s)
    {
        try
        {
                for(char c:s.toCharArray())
                {
                    if(!Character.isDigit(c))
                    {  System.out.println(" Simple String "); 
                        break;
                    }
                    else
                     {   System.out.println(" Numaric String Exception ");
                        break;
                     }
                }
        }catch(NumberFormatException e)
        {
            System.out.println(" ");
        }
    }
}
public class NumaricStringException 
{
    public static void main(String args[]) 
    {
        try
        {
            throw new MyException("String");
        }catch(MyException e)
        {
           // System.out.println(" ");
        }
    }
}
