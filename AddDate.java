    import java.text.SimpleDateFormat;
    import java.util.Calendar;
    import java.util.Date;
    
    public class AddDate
    {
     public static void main(String[] args)
     {
        Date dNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        System.out.println("Current Date: " + sdf.format(dNow));

        Calendar c = Calendar.getInstance();
        //c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 02); // Adding 35 days
        String output = sdf.format(c.getTime());
        System.out.println("New Date: "+ output);
     }
    }