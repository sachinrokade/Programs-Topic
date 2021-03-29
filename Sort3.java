/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidhhi
 */
public class Sort3 
{
            static int[] arr = {12, 8, 4, 17,46};

            public static void main(String[] args)
            {
               // System.out.println("Minimum is :" + findMin(arr));
                int[] arr = {12, 8, 4, 17,46};
                int sum=0;
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]%2==0)
                        sum=sum+i;
                }
                    System.out.println("Raja Soft:"+sum);
               // else
                    
                
            }

            public static int findMin(int[] iArray)
            {
                    if(arr.length == 0) 
                     {
                            System.err.println("Please Pass An Array With At Least 1 Element.");
                            return (Integer) null;
                    }
                    else 
                        return findMinFromArray(iArray, 0, iArray[0]); //call method with starting parameters ie index = 0 & min = iArray[0]
            }
            private static int findMinFromArray(int[] iArray, int index, int min) 
            {
                int max=0;
                        if(index <= (iArray.length - 1))
                        {
                            if(iArray[index] < min)
                            {
                                min = iArray[index];
                            }
                            min=min;
                            findMinFromArray(iArray, index + 1, min);
                        }
                        max=max+1;
                        System.out.println("Min = " + min+"Max=  "+max);
                return min;
            }
}
