public class MargeTwoList 
{


                public static void main(String[] args)
                {
                    int arr1[]={4,6, 9, 20, 56};
                    int arr2[]={1, 7, 25, 45, 70};
                    int[] result=merge(arr1, arr2);
                    for (int j=0; j<result.length;j++)
                            System.out.print(result[j]+ " ");
                }

                static int[] merge(int[] arr1, int[] arr2)
                {
                    int arr1_Length=arr1.length;
                    int arr2_Length=arr2.length;
                    int[] result = new int[arr1_Length + arr2_Length];
                    int i=0, j = 0;

                    for(int k = 0 ; k< (arr1_Length + arr2_Length);k++)
                    {
                        if ( i >= arr1_Length )
                        {
                            result[k] = arr2[j];
                            j ++;
                        }
                        else if ( j >= arr2_Length)
                        {
                                result[k] = arr1[i];
                                i ++;
                        }
                        else
                        {
                             if ( arr1[i] < arr2[j]) // step 3
                            {
                                result[k] = arr1[i];
                                i ++;
                            }
                            else
                            {   
                                result[k] = arr2[j];
                                j ++;
                            }
                        }
                    }
                return result;

        }

}