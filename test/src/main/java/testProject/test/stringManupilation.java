package testProject.test;

public class stringManupilation {
	
	
	public static void main(String args[])
	{
		
		String s1="efsdfsdfb";
		String s2="abcd";
		String s3="";
		String s4="";
		if(s1.length()>=s2.length())
		{   //int i=s1.length();
			
				s3=s1.substring(s2.length(),s1.length()).trim();
				//System.out.println(s3);
				for(int i=0;i<s2.length();i++)
				{
					s4=s4+s2.charAt(i)+s1.charAt(i);
					s4=s4.trim();
					
				}
				//System.out.println(s4);
			
			System.out.println(s4+s3);
		}
		
		if(s1.length()<s2.length())
		{   //int i=s1.length();
			
				s3=s2.substring(s1.length(),s2.length());
			//	System.out.println(s3);
				for(int i=0;i<s1.length();i++)
				{
					s4=s4+s2.charAt(i)+s1.charAt(i);
					s4=s4.trim();
					
				}
				//System.out.println(s4);
			
			System.out.println(s4+s3);
		}
		
	}

}
