/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class LinesProcInt {
    public static int processData(ArrayList<String> array) throws FileNotFoundException, IOException 
    {
        String msg=null;
        int i=0;
       // System.out.print(""+array.isEmpty())
       // {
            msg=msg+""+array.get(i);
            i++;
        //}
        System.out.print(msg);
       /* String   filename="E:/Users/Shidhhi/Desktop/Output.txt";

			File f=new File(filename);
					FileOutputStream fn=new  FileOutputStream(f);
				
					byte b[]=msg.getBytes();
		
					fn.write(b);
					fn.close();*/
        return 0;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("E:/Users/Shidhhi/Desktop/input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            int retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
