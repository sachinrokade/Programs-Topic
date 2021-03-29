import java.util.*;
import java.io.*;
 public class GrA
 {
   public static void main (String[] args) 
   {
  
          int[] a1={1,2,3,8,7,5,6,4};
           Arrays.sort(a1); // use to sort the array
          int m1=a1[a1.length-1];
          int m2=a1[a1.length-2];
          System.out.println("avg no is ");
          System.out.println(" "+m1);
          System.out.println(" "+m2);
          int b = m1 + m2; //addition of two max number in array
          double avg = b/2;
          System.out.println("Avg "+b);
      }
   }
 