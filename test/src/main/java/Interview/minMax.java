package Interview;

public class minMax {
	
	static int count=0;
	public static void main(String args[])
	{
		int arr[]={-4,3,200,5,4,0,500,1,2,8,-5,9,78,34,9,4,0,-6,3};
		//int min=minElement(0,arr.length-1,arr);
		sorting(0,arr.length-1,arr);
		System.out.println("");
		for(int a:arr)
		{
			System.out.print(a+",");
		}
		
		
	}
	
	public static void sorting(int l,int h,int[] arr)
	{   int i=l;
	    int j=h;
		if(l<h)
		{
			
			minElement(l,h,arr);
			l=l+1;
			h=h-1;
			sorting(l,h,arr);
			
			
		}
	}
	public static int minElement(int l,int h,int[] arr)
	{
		int i=l+1;
		int j=h;
		int min=arr[l];
		int max = arr[l];
		int maxi=l;
		int mini=l;
		while(i<j)
		{
			if(arr[i]<min ||arr[j]<min)
			{
				if(arr[i]<min)
				{
					min=arr[i];
					mini=i;
					i++;
				}
				if(arr[j]<min)
				{
					min=arr[j];
					mini=j;
					j--;
				}
				
			}else if(arr[i]>max ||arr[j]>max)
				{
					if(arr[i]>max)
					{
						max=arr[i];
						maxi=i;
						i++;
						
					}
					if(arr[j]>max)
					{
						max=arr[j];
						maxi=j;
						j--;
					}
			}
				// i=l+1;
				// j=h;
				// max=arr[l];
				
				else
				{
					i++;
					j--;
				}
			}
		    count++;
			System.out.println("-"+count+" max "+max);
			System.out.println("-"+count+" min "+min);
			System.out.println();
			if(h-l!=1){
			int tem=arr[l];
			arr[l]=min;
			arr[mini]=tem;
			
			int temp=arr[h];
			arr[h]=max;
			arr[maxi]=temp;
			}else{
				if(arr[l]>arr[h])
				{   int temp=arr[l];
                    arr[l]=arr[h];
                    arr[h]=temp;
				}
			}
			
			
		
		return min;
	}

}
