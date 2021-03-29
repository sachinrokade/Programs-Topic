class Hello
{
    static
    {
          System.out.println(" static");
    }
    {
          System.out.println(" Instant");
    }
    public void  Hello()
    {
        System.out.println("COns");
    }
    public static void main(String[] args) 
    {
        Hello h=new Hello();
        // h.Hello();
       //  System.out.println("Main");
    }
    
}