public class FizzBuzzi 
{
    public static void main(String[] args) 
    {   
        for(int i=1;i<=50;i++)
        {
            if(i%(3*5)==0)
                System.out.println("Fizz Buzzi");
            else if(i%3==0)
                System.out.println("Buzzi");
            else if(i%5==0)
                System.out.println("Fizz");
            else
                System.out.println(""+i);
            
        }
        
    }
}
