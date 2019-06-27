package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	
	public static void main(String args[]){
	/*ArrayList<String> List=new ArrayList<String>();
	
	List.add("B");
	List.add(1,"e");
	List.add(2,"f");

	List.add(1,"k");
	for(String s:List)
	{
		System.out.print(s);
	}
	*
	*
	*/
		
		int a[]={3,8,4,7};
		int b=6;
		int[] c=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			if(i!=1)
			{
				c[i]=a[i];
			}
			else{
				for(int j=i-1;j<c.length-1;j++)
				{   int k=i+1;
				   
					c[k]=a[j];
					
				}
				c[i]=b;
			}
		}
		for(int d:c)
		{
			System.out.print(d);
		}
		
		
		
		
		
	}
	

}
