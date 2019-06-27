package testProject.test;

public class Star2 {

	
	public static void main(String[] args)
		{ int k=0;
		for(int i=0;i<5;i++)
			
			
			{for(int j=0;j<=i;j++)
			{   // Character.
				System.out.print(" ");
			}
			//k=k-1;
			
			for(int j=5;j>k;j--)
			{
				System.out.print("* ");
			}
			k=k+1;
			System.out.println();
		}
	}
}
