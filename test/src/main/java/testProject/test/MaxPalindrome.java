package testProject.test;

public class MaxPalindrome {

	
	
	public static void main(String args[])
	{
		String str="madmadamoroxyz";
		String str2="";
		int max=0;
		for(int i=0;i<str.length()-1;i++)
		{   
			//str2=str2+str.charAt(i);
			String s3=str.charAt(i)+"";
			for(int j=i+1;j<str.length()-1;j++)
			{
				 s3=s3+str.charAt(j);
				//System.out.println(str2);
				if(s3.length()!=1)
				{
					
					if(reverse(s3).equals(s3))
					{
						if(s3.length()>max)
						{
							max=s3.length();
						}
						System.out.println(s3+" MAX "+max);
					}
					
				}
				
			}
			
		}
		
		
		
		
	}
	
	public static String reverse(String str)
	{    String newStr="";
		for(int j=str.length()-1;j>=0;j--)
		{
			newStr=newStr+str.charAt(j);
			
		}
		return newStr;
	}
}
