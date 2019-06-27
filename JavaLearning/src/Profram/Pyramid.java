package Profram;

public class Pyramid {
	
	
	public static void main(String args[])
	{
		int n=6;
		int k=0;
		for(int i=0;i<n;i++)
		{
			
			
	    
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=n;j>k;j--){
				System.out.print("* ");
			}
			k=k+1;
			System.out.println();
			
			
		}
		
		
	}

}
