/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidhhi
 */
public class ValidateMobileNo 
{
    public static void main(String[] args) 
     {
         // exp. for only 91 starting 
      String EMAIL_REGEX = "^((\\+){0,1}91(\\s){0,1}(\\-){0,1}(\\s){0,1}){0,1}9[0-9](\\s){0,1}(\\-){0,1}(\\s){0,1}[1-9]{1}[0-9]{7}$";
      String email1 = "9183628323";
      Boolean b = email1.matches(EMAIL_REGEX);
      System.out.println("This Mobile No is : "+email1+" :Valid = " + b);
      
      
   }
}

