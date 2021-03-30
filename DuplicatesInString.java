import java.util.Scanner;
public class DuplicatesInString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] input = str.toCharArray();
        int count = 0;
        for(int i =0 ; i<=input.length-1; i++)
        {
           if(input[i]=='a')
           {
               count++;
               
           }
        }
        System.out.println("Number of duplicate character is "+count);
    }
}