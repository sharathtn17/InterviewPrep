package testProject.test;

public class reversSentence {
	
	public static void main(String args[])
	{
		String org="this is a sentence rf";
		String org1="this is a sentence";
		String revrse="";
		
		
		String[] str=org.split(" ");
		//System.out.print(str.length);
		for(int i=0;i<str.length;i++)
		{   if(i%2!=0)
			org1=org1.replace(org1.charAt(i), 'e');
			
		    
		   String s=str[i];
			for(int j=s.length()-1;j>=0;j--)
			{
				if(j==s.length()-1){
				String Upper=(""+s.charAt(j)).toUpperCase();
				
				revrse=revrse+Character.toUpperCase(s.charAt(j));
				
				}
				else
				revrse=revrse+s.charAt(j);
			}
			revrse=revrse+" ";
		}
		
		
		System.out.println(revrse);
		System.out.println(org1);
		System.out.println(Character.isAlphabetic('4'));
	
	}
	

}
