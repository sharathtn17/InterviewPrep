package Interview;

public class reverseArray {
	
	
	public static void main(String args[])
	{
		int[] ar={1,2,3,4,6,7};
		
		for(int i=0;i<ar.length/2;i++)
		{   int temp=ar[i];
		     ar[i]=ar[ar.length-i-1];
		     ar[ar.length-i-1]=temp;
			
		}
		
		for(int a:ar)
		{
			System.out.print(a);
		}
		
	}

}
