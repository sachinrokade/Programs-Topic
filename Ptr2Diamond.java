
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sachin
 */
public class Ptr2Diamond 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int noOfRows = sc.nextInt();
 
        //Initializing rowCount with 1
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = 1; i <=noOfRows; i++)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = noOfRows-i; j>=1; j--)
            {
                System.out.print(" ");
            }
 
            //Printing * at the end of each row
 
            for (int j = 1; j<=2*i; j++)
            {
                System.out.print("*");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            
        }
       for ( r = 1 ; r <= rows ; r++ ) 
        {
		for ( c = 1 ; c <= space ; c++ )
                                System.out.printf(" ");
		
                
                space--;
		for ( c = 1 ; c <= 2*r-1 ; c++)
			System.out.printf("*");
		System.out.printf("\n");
	}
}
