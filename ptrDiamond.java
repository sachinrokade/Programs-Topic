/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sachin
 */
public class ptrDiamond 
{
    public static void main(String args[])
    {
	int rows, c, r, space;
	
	rows=5;
        
	space = rows - 1;
	for ( r = 1 ; r <= rows ; r++ ) 
        {
		for ( c = 1 ; c <= space ; c++ )
                                System.out.printf(" ");
		
                
                space--;
		for ( c = 1 ; c <= 2*r-1 ; c++)
			System.out.printf("*");
		System.out.printf("\n");
	}
	// Print second half of the triangle.
	space =1;
	for ( r = 1 ; r <= rows - 1 ; r++ ) 
        {
		for ( c = 1 ; c <= space; c++)
			System.out.printf(" ");
		space++;
		for ( c = 1 ; c <= 2*(rows-r)-1; c++ )
			System.out.printf("*");
		System.out.printf("\n");
	}
    }
}