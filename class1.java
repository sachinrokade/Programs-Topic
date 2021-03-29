import java.util.Scanner;

public class class1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String inpStr = in.nextLine();
        System.out.println("Original String :" + inpStr);
        char temp;
        char[] arr = inpStr.toCharArray();
        int len = arr.length;
        for(int i=0; i<(inpStr.length())/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[len-1];
            arr[len-1] = temp;
            
            len--;
        }

        System.out.println("Reverse String :" + String.valueOf(arr));
    }
}