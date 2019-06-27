package testProject.test;

import java.util.HashMap;

public class AnagramProgram {

	public void Anagram(String s1, String s2)
	{
		
		String copyS1=s1.replace(" ", "").toLowerCase();
		String copyS2=s2.replace(" ", "").toLowerCase();
		
		boolean status=true;
		System.out.println(copyS1);
		StringBuffer sb=new StringBuffer(copyS2);
		
		for(char c:copyS1.toCharArray())
		{
		//	System.out.println(c+" Character");
			int index=sb.indexOf(c+"");
			//System.out.println(index+"index");
			//System.out.println(sb);
			if(index!=-1)
			{
				sb=sb.deleteCharAt(index);
				
				
			}else{
				
				status=false;
				break;
			}
			
			
			
		}
		
			if(status)
			{
				System.out.println("Anagram");
			}else{
				System.out.println("Not AnagramcopyS1");
			}
		
	}
	
	
	public void AnagramwithString(String s1, String s2)
	{
		
		String copyS1=s1.replace(" ", "").toLowerCase();
		String copyS2=s2.replace(" ", "").toLowerCase();
		
		boolean status=true;
		System.out.println(copyS1);
		//StringBuffer sb=new StringBuffer(copyS2);
		
		for(char c:copyS1.toCharArray())
		{
		//	System.out.println(c+" Character");
			int index=copyS2.indexOf(c);
			//System.out.println(index+"index");
			//System.out.println(sb);
			if(index!=-1)
			{
				copyS2=copyS2.substring(0,index)+copyS2.substring(index+1,copyS2.length());
				
				
			}else{
				
				status=false;
				break;
			}
			
			
			
		}
		
			if(status)
			{
				System.out.println("Anagram");
			}else{
				System.out.println("Not AnagramcopyS1");
			}
		
	}
	
	public void anagramWithHashMap(String str1,String str2)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		 str1=str1.replace(" ", "").toLowerCase();
		 str2=str2.replace(" ", "").toLowerCase();
		
		char[] copys1=str1.toCharArray();
		char[] copys2=str2.toCharArray();
		
		/*for(char c:copys1)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
		for(char c:copys2)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)-1);
			}else
			{
				hm.put(c, 1);
			}
		}*/
		
		for(int i=0;i<copys2.length;i++)
		{
			char c=copys1[i];
			char d=copys2[i];
			
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)-1);
			}else
			{
				hm.put(c, 1);
			}
			
			if(hm.containsKey(d))
			{
				hm.put(d, hm.get(d)-1);
			}else
			{
				hm.put(d, 1);
			}
			
		}
		System.out.println(hm);
		
	}
	public static void main(String args[])
	{
		AnagramProgram a=new AnagramProgram();
		//a.Anagram("Mother In Law", "Hitler Woman");
		//a.AnagramwithString("Mother In Law", "Hitler Woman");
		
		a.anagramWithHashMap("Mother In Law", "Hitler Woman");
		
	}
}
