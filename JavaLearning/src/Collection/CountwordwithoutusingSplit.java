package Collection;

import java.util.ArrayList;

public class CountwordwithoutusingSplit {

	
  
	      static int wordcount(String string)  
	        {  
	          int count=0;  
	      
	            char ch[]= new char[string.length()];     
	            for(int i=0;i<string.length();i++)  
	            {  
	                ch[i]= string.toUpperCase().charAt(0);
	                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                    count++;  
	            }  
	            return count;  
	        }  
	      public static void main(String[] args) {  
	          String string =" ";  
	         System.out.println(wordcount(string) + " words.");   
	    }  
	}  
