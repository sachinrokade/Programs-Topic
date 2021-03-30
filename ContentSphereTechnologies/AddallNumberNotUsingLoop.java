package ContentSphereTechnologies;
public class AddallNumberNotUsingLoop  
{
  public static void main(String[] args) 
  {
    String str = "1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5";
    String[] arr = str.split(",");
    int length = arr.length;

    System.out.println(sum(length, arr));
  }
  static int temp = new Integer(0);

  public static int sum(int length, String[] arr) 
  {
    int length_m = length - 1;
    String[] arr_m = arr;
    System.out.println(temp+" arr[length_m] "+arr[length_m]);
    temp=temp+Integer.parseInt(arr[length_m]);
    
    if (length_m != 0) 
    {
      sum(length_m,arr_m);
    } 
    else 
    {
      // temp += Integer.parseInt(arr[0]);
      // System.out.println(temp);
    }
    return temp;

  }
}