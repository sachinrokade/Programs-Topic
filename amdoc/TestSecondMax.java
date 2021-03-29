package amdoc;

import java.util.Arrays;

public class TestSecondMax 
{
	public static void main(String[] args) {
		
		int arr[]= {21,2,21,33,4,43,3434,54,4,44,3,45};
		System.out.println("factory Method "+factoryMethod(arr));
		System.out.println("custom Method "+customMethod(arr));
	}

	private static int customMethod(int[] arr) 
	{
		int t=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			//System.out.println(arr[j]);
			
		}
		return arr[arr.length-2];
	}

	private static int factoryMethod(int[] arr) 
	{
		Arrays.sort(arr);
		return arr[arr.length-2];
	
	}
}
