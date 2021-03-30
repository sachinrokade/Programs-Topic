import java.util.TreeMap;
public class TreeMapD
{
    public static void main(String a[])
    {
        TreeMap<String,String> hm = new TreeMap<String,String>();
        TreeMap<String,String> mp2 = new TreeMap<String,String>();
//add key-value pair to TreeMap
        
        hm.put("b","THIRD INSERTED");
        hm.put("c", "FIRST INSERTED");
        hm.put("a", "SECOND INSERTED");
       
        mp2.put("d","FORTH INSRTED");
       
        System.out.println("1 Mp");
        System.out.println(hm);
        
        mp2.putAll(hm);
       System.out.println("2 Mp");
        System.out.println(mp2);
        
        
    }
}