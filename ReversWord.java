public class ReversWord 
{
    public static void main(String args[]) 
    {
      String s=new String("I am Sachin");
      String s1=new String("Alive is awesome");
      
      
        System.out.println("Manin String  " +s);
        System.out.println("Rev Stantcnce  " +revStantcnce(s));
        System.out.println("Word Stantcnce  " +revWord(s));
      
      System.out.println("--------------------------------------\n\n ");
        System.out.println("Manin String  " +s1);
        System.out.println("Rev Stantcnce  " +revStantcnce(s1));
        System.out.println("Word Stantcnce  " +revWord(s1));
        
    }
    
    public static StringBuilder revStantcnce(String msg) 
    {
        StringBuilder sb=new StringBuilder();
        
      	String w[]=msg.split(" ");
      
      	for(int i=w.length-1;i>=0;i--)
        {
         
          sb.append(w[i]).append(' ');
        }
        //System.out.println("Current date  " +sb);
		return sb;
   }
    public static String revWord(String msg) 
    {
      	 char[] toCharArray = msg.toCharArray();
        String op="";
        for (int j = toCharArray.length-1; j >= 0; j--) 
        {       
            op=op+msg.charAt(j);
        }
        //System.out.println(""+op);
        return op;
        
    }
}