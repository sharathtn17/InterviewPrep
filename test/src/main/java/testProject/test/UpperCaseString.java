package testProject.test;

public class UpperCaseString {
	
	
	public static void main(String args[])
	{
		
		String text="ThisIsASentence";
		char[] text1=text.toCharArray();
		String newText="";
		
		for(char c:text1)
		{
			if(!Character.isUpperCase(c))
			{
                 	newText=newText+c;			
			}
			else
			{
				newText=newText+" "+c;	
			}
			
		}
		System.out.println(newText);
		
		
	}

}
