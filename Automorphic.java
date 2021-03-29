/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sroka
 */
import java.util.Scanner;
 
/**
* @author computerhives team
*/
public class Automorphic {
 
    // main method begins execution of this class
    public static void main(String args[]) {
 
        int n1, n2, square;
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        // Waiting for the user input
        n1 = sc.nextInt();
        n2 = n1;
        square = n1 * n1;
        int c = 0;
        while (n1 != 0) 
        {
            c++;
            n1 = n1 / 10;
        }
        System.out.println("n1 "+c);
        int n3 = (int) (square % (Math.pow(10, c)));
        System.out.println(n3);
        if (n2 == n3) {
            System.out.println(n2 + " is an automorphic number ");
        } else {
            System.out.println(n2 + " is not an automorphic number ");
        }
 
    } // end method main
}
