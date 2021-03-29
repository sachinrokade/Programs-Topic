import java.util.Scanner; 
class SortArray2
{ 
    public static void main(String []args) 
    { 
        int num, i, j = 0, temp; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the number of integers to sort:"); 
        //num = input.nextInt(); 
       // int array[] = new int[num]; 
        int array[] = {10,20,35,45,50,60,70,80,90,100};
       // System.out.println("Enter " + num + " integers: "); 
        //for (i = 0; i < num; i++) 
        //{
        //    array[i]= input.nextInt(); 
        //}
            for (i = 0;i<array[j+1];i++)
            {
                temp = array[j]; 
                array[j] = array[j+1]; 
                array[j+1] = temp; 
            }
        System.out.println("Sorted list of integers:"); 
        for (i = 0; i < array.length; i++) 
        {
            System.out.println(array[i]); 
        }
    
    
    } 
    
} 
