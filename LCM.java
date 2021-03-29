
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidhhi
 *//*
public class LCM 
{
    public static void main(String ar[])
    {
            int n1,n2,x,y;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter two numbers:");
            n1=sc.nextInt();
            n2=sc.nextInt();
            x=n1;
            y=n2;
            while(n1!=n2)
            {
                if(n1>n2)
                {      n1=n1-n2;
                        System.out.println("X Y= "+n1);
                }
                else
                {      n2=n2-n1;
                        System.out.println("X Y= "+n2);
                }
            
            }
            
            System.out.println("L.C.M= "+x*y/n1);
 
    }
}
*/
import java.util.Arrays;

public class LCM {

    private static double LCM = 1;

    private static int returnMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 1 && array[i] < min) {
                min = array[i];
            }
        }
        return min; //When this returns Integer.MAX_VALUE, we are done
    }

    private static int returnFirstDivisor(int val) {
        if (val == Integer.MAX_VALUE) {
            return -1; //Return -1 to signal end
        } else {
            for (int i = 2; i <= val; ++i) {
                if (val % i == 0) {
                    LCM *= i;
                    System.out.print(i+" ");
                    return i;
                }
            }
        }
        System.err.println("Unnecessary return!");
        return -10;
    }

    public static void main(String[] args) {

        //Your numbers here
        int array[] = new int[]{20,60};

        while (true) {
            int minDivisor = returnFirstDivisor(returnMinValue(array)); 
            if (minDivisor == -1) break; 
            
            for (int i = 0; i < array.length; ++i) {
                if (array[i] % minDivisor == 0) {
                    array[i] /= minDivisor;
                }
            }
            System.out.print(Arrays.toString(array)+"\n");
        }
        System.out.println("LCM = " + LCM); 
        int a=20;
        int b=60;
        
  
    int temp = a;

    while(true)
    {
         if(temp % b == 0 && temp % a == 0)
             break;
        System.out.println("LCM  Temp= " + temp);
         temp++;
         System.out.println("LCM  Temp++= " + temp);
    }

   System.out.println("LCM  Temp= " + temp);
}

}