package testProject.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharString {
	
	
	public String duplicaterec(String input)
	{	
		    if (input.length() < 1) return input;
		    if (input.charAt(0) == input.charAt(1))
		        return duplicaterec(input.substring(1));
		    else
		        return input.charAt(0)+duplicaterec(input.substring(1));
	}
	
	public void duplicatechar(String s){
		
		Map<Character,Integer> cmaps=new  HashMap<Character,Integer>();
		
		char[] chars = s.toCharArray();
		
		for(Character c:chars){
			
			if(cmaps.containsKey(c))
			{
				cmaps.put(c, cmaps.get(c)+1);
			}else
			{
				cmaps.put(c, 1);
			}
		}
		System.out.println(cmaps);
		Set<Character> keyset=cmaps.keySet();
		System.out.println(keyset);
		
		for(Character c:keyset)
		{
			//if(cmaps.get(c)==1)
		//	{
				System.out.println(cmaps.get(c)+"---"+c);
			//}
		}
		int max=0;
		Character maxkey=null;
		for(Map.Entry<Character,Integer> c:cmaps.entrySet())
		{
			//if(cmaps.get(c)==1)
		//	{
			    if(c.getValue()>max)
			    {
			    	max=c.getValue();
			    	maxkey=c.getKey();
			    }
				System.out.println(c.getKey()+","+c.getValue());
			//}
		}
		
		System.out.println(max+","+maxkey);
		
		System.out.println(1.1);
		
	}
	
	public void duplicateCharForLoop(String str)
	{
		
		StringBuilder strbul =new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		     
		     i=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{    count++;
					System.out.print("");
				}
			}
			
			System.out.println(str.charAt(i)+" count "+count);
			String d=String.valueOf(str.charAt(i)).trim();
			strbul.append(d);
	        str=str.replaceAll(d,"");
	        count=0;
	   
		}
		
		strbul.append(str.charAt(0));
		System.out.println(strbul);
		
		}
		
	

	
	
	public static void main(String args[])
	{
		DuplicateCharString g=new DuplicateCharString();
		String s="sharjathpruthv";
		g.duplicatechar(s);
		//g.duplicateCharForLoop(s);
	//System.out.println(g.duplicaterec(s));
	}

}
