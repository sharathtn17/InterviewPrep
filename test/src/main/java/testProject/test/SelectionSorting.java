package testProject.test;

public class SelectionSorting {
	
	public static int[] SelectionSort(int[] arr)
	{
		int MinIndex,temp;
		for(int i=0;i<arr.length-1;i++)
		{
			MinIndex=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[MinIndex])
				{
					MinIndex=j;
				}
				
				
			}
			
			temp=arr[i];
			arr[i]=arr[MinIndex];
			arr[MinIndex]=temp;
			
		}
		
		return arr;
	}

	
	public static void main(String args[])
	{
		int[] arr={2,3,4,3,7,8,9,0};
		
		arr=SelectionSorting.SelectionSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
