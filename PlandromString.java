class PalidromString
{
    @SuppressWarnings("empty-statement")
    public static void main(String arg[])
    {
        String  in="smskkjjk";
        
       // char toCharArray[] = in.toCharArray();q
        int j=1;
        int count=0;
        int le=in.length();
        for(int i=0;i<le/2;i++)
        {
           if(in.indexOf(i)==in.indexOf(le))
                count=0;
            else
            {   count=count+1;
                
            }
        }
        if(count==0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
