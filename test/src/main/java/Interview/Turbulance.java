package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Turbulance {

	
	public static void main(String args[])
	{
		int[] arr={8,12,14,15,16,1,2,1,4,5};
		int turbulance=0;
		int maxturb=0;
		int max=0;
		Set<Integer> MaxTurb=new LinkedHashSet<Integer>();
		Set<Integer> turb=new LinkedHashSet<Integer>();
		int i=0;
		//Integer i;
		while(i<arr.length)
		{
			if(i+1<arr.length && i+2<arr.length)
			{
				
				if(arr[i]>arr[i+1] && arr[i+1]<arr[i+2])
				{
					i=i+2;
					maxturb++;
					System.out.print(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
					System.out.println(maxturb);
					
				}else if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2])
				{
					i=i+2;
					maxturb++;
					System.out.print(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
					System.out.println(maxturb);
					
				}else if(arr[i]==arr[i+1] ||arr[i+1]<arr[i+2]||arr[i]>arr[i+1] )
				{
					System.out.println(maxturb);
					max=maxturb;
					maxturb=0;
					i++;
				}else{i++;}
			/*if(arr[i]>arr[i+1])
			{
				if(arr[i+1]<arr[i+2])
				{
					turb.add(arr[i]);
					turb.add(arr[i+1]);
					turb.add(arr[i+2]);
					i=i+2;
				}else
				{
					i++;
				}
				
				
			}else if(arr[i]==arr[i+1])
			{
				MaxTurb.addAll(turb);
				maxturb=turb.size();
				turb.clear();
				i=i+2;
			}else{
			i++;
			}
			System.out.println(MaxTurb+""+maxturb);*/
			
		}else{
			break;
		}
			
	}
		if(max*3-1>=0)
		{
			System.out.println(max*3-1);
		}
		else{
			System.out.println(0);
		}
		//System.out.println(max*3-1+"MAXXXXXTURB");
	}
}
