package testProject.test;

public class MatrixAdd {
	
	
	public static void main(String args[])
	{
	//	int matrix1[][]=new int[3][3];
		int sum[][]=new int[3][3];
		
		
		int matrix1[][]={{1,2,3},{2,3,4},{4,3,2}};
		int marrix2[][]={{1,2,3},{2,3,4},{4,3,2}};
		
		
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<marrix2.length;j++)
			{
				sum[i][j]=matrix1[i][j]+marrix2[i][j];
			}
		}
		
	

	for(int i=0;i<matrix1.length;i++)
	{
		for(int j=0;j<marrix2.length;j++)
		{
			System.out.print(sum[i][j]);
		}
		System.out.println();
	}
	}
}
