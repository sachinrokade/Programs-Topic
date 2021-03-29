
import java.util.logging.Level;
import java.util.logging.Logger;

class Te
{
    public static void main(String args[]) 
    {
        EvenT e=new EvenT(10);
        OddT o=new OddT(10);
        
        e.start();
        o.start();
    }
}
class EvenT extends Thread
{
    int n;
    public EvenT(int n)
    {
        this.n=n;
    }
    @Override
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {  
                try {
                    System.out.println("Even "+i);
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(EvenT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
class OddT extends Thread
{
    int n;
    public OddT(int n)
    {
        this.n=n;
    }
    @Override
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {   
                try {
                    System.out.println("odd "+i);
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OddT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}