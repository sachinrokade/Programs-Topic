public class ValidateEmail 
{
     public static void main(String[] args) 
     {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = "srokade918gmail.com";
        Boolean b = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: "+email1+" :Valid = " + b);
        String email2 = "srokade918@gmail";
        b = email2.matches(EMAIL_REGEX);
        System.out.println("is e-mail: "+email2+" :Valid = " + b);
     }
}

/*
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String args[]) {
      List emails = new ArrayList();
      emails.add("sairamkrishna@tutorialspoint.com");
      emails.add("kittuprasad700@gmail.com");
      emails.add("sairamkrishna_mammahe%google-india.com");
      emails.add("sairam.krishna@gmail-indai.com");
      emails.add("sai#@youtube.co.in");
      emails.add("kittu@domaincom");
      emails.add("kittu#gmail.com");
      emails.add("@pindom.com");
      
      String regex = "^(.+)@(.+)$";
      Pattern pattern = Pattern.compile(regex);
      
      for (Object email : emails) {
         Matcher matcher = pattern.matcher((CharSequence) email);
         System.out.println(email + " : " + matcher.matches());
      } 
   }
} 
*/
