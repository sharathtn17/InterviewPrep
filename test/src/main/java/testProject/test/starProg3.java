package testProject.test;

public class starProg3 {
	
	
	public static void main(String args[])
	{
		
		int n=5;
		int k=n;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<=k;j++)
			{
				System.out.print(" ");
			}
			k=k-1;
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
