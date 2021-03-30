/*
#include <stdio.h>
#include <string.h>
 
void swap(char *x, char *y)
{
    char temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
 
void permute(char *a, int l, int r)
{
   int i;
   if (l == r)
     printf("%s\n", a);
   else
   {
       for (i = l; i <= r; i++)
       {
          swap((a+l), (a+i));
          permute(a, l+1, r);
          swap((a+l), (a+i)); //backtrack
       }
   }
}
 
int main()
{
    char str[] = "abc";
    int n = strlen(str);
    permute(str, 0, n-1);
    return 0;
} 

*/
package ContentSphereTechnologies;

import java.util.Arrays;

/**
 *
 * @author sroka
 */
public class StringSubset
{
       // Print all subsets of given set[]
    static void printSubsets(String str)
    {
        
        int n = str.length();
        char set[]=str.toCharArray();
 
        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0;i<(1<<n); i++)
        {
            System.out.print("");
 
            // Print current subset
            for (int j = 0; j < n; j++)
            {
                    if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
            
            }
            System.out.println("");
        }
    }
    // Driver code
    public static void main(String[] args)
    {
        String set = "abc";
        printSubsets(set);
        
    }
}
