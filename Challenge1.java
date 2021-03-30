/*
Programming Challenges Question - 1
Write a program that accepts 10 student records (roll number and score) and prints them in decreasing order of scores. In case there are multiple records pertaining to the same student, the program should choose a single record containing the highest score. The program should be capable of accepting a multi-line input. Each subsequent line of input will contain a student record, that is, a roll number and a score (separated by a hyphen). The output should consist of the combination of roll number and corresponding score in decreasing order of score.
INPUT to program

1001-40
1002-50
1003-60
1002-80
1005-35
1005-55
1007-68
1009-99
1009-10
1004-89

OUTPUT from program

1009-99
1004-89
1002-80
1007-68
1003-60
1005-55
1001-40
*/



import java.io.*;
import java.util.*;
public class Challenge1 
{
 public static void main(String[] args) {
  String Data[] = new String[10];
  int splitData[][] = new int[10][2];

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 10 records...");
  for (int i = 0; i < 10; i++) {
   Data[i] = sc.next();
   String str[] = Data[i].split("-");

   //Copy given data into two-D array

   splitData[i][0] = Integer.parseInt(str[1]);
   splitData[i][1] = Integer.parseInt(str[0]);
  }

  Arrays.sort(splitData, new Comparator < int[] > () {
   public int compare(int[] o1, int[] o2) // Sorting of array
    {
     return o2[0] - o1[0];
    }
  });

  Byte flag = 0;
  System.out.println("Output Result");
  for (int i = 0; i < 10; i++) {
   flag = 0;
   for (int j = i - 1; j >= 0; j--) //Logic to check duplicate roll no
   {
    if (splitData[i][1] == splitData[j][1]) {
     flag = 1;
     break;
    }
   }
   if (flag == 0) {
    System.out.println(splitData[i][1] + "-" + splitData[i][0]);
   }
  }
 }
}