package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class OccuranceofElement {

	
	
	public static void main(String args[])
	{
		
		int arr[]={1,3,4,5,6,5,6,7,8,6,5,4,3,6,8};
		
		int[] count=new int[256];
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			count[temp]=count[temp]+1;
		}
		System.out.println(count);
		
		/*Set u=new HashSet();
		u.add(null);
		u.add(null);*/
		
	//	System.out.println(u);
		for(int i=0;i<arr.length;i++)
		{
			int t=arr[i];
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(arr[j]==t) find++;
			}
			if(find==1) System.out.println(t+"  "+count[t]);
		}
		
		characterOcc("catscat");
		
	}
	
	public static void characterOcc(String input)
	{
		int[] count=new int[256];
		int temp;
		
		for(int i=0;i<input.length();i++)
		{
			temp=input.charAt(i);
			count[temp]=count[temp]+1;
		}
		
		for(int i=0;i<input.length();i++)
		{
			Character ch=input.charAt(i);
		
			
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(ch==input.charAt(j))
				{
					find++;
					
				}
				
			}
			if(find==1) System.out.println(ch+" "+count[ch]);
		}
		
	}
}
