package ContentSphereTechnologies;
import java.util.Random; 
public class TranformMatrix90 
{
    public static void main(String ar[]) 
    {
    	int matrix[][]={
                            {28, 66,73},
                            {67,21,63},
                            {87,54,59},
                        };
        
        
    printMatrix(matrix);
    matrix90(matrix);
    printMatrix(matrix);
    }
    private static void matrix90(int[][] matrix)
    {
    	int m = 3;
        int n = 3;
    	// Transpose the matrix
        for( int i = 0; i < m; i++ ) 
        {
            for(int j = i + 1; j < n; j++ ) 
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        
        // Swap the columns
        for(int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n/2; j++ ) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = tmp;
            }
        }

    }
	private static void printMatrix(int[][] matrix) 
	{
		int m = 3;
        int n = 3;
	       System.out.println();
		for ( int i = 0; i < m; i++ ) 
		{
	        for ( int j = 0; j < n; j++ ) 
	        {
	            System.out.print(matrix[i][j]+" ");
	        }
	       System.out.println();
	    }
	}
	
}
