/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        //int ar[]={2,5,3,4,6};

       // int max=MaxA.GetLargestSum(ar,2);
        //System.out.print(max);
        
        
    
    }
}
class MaxA
{
    public MaxA()
    {
        
    }
    static int GetLargestSum(int[] array, int n)
    {
    int largestSum = 0;
    int previousSum = 0;

    for (int i = 0; i <=5- n; i++)
    {
        if (i == 0)
        {
            for (int j = 0; j < n; j++)
            {
                largestSum += array[j];
            }

            previousSum = largestSum;
        }
        else
        {
            int currentSum = previousSum - array[i - 1] + array[i + n - 1];
            if (currentSum > largestSum)
            {
                largestSum = currentSum;
            }
            previousSum = currentSum;
        }
    }

    return largestSum;
    }
}