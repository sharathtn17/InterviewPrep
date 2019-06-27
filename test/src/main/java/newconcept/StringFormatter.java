package newconcept;

public class StringFormatter {  
public static void main(String args[]){  
    String words[]="this is a sdf".split("[is]");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
     //   sb.reverse();  
        System.out.print(sb.toString()+" ");  
    }  
    System.out.print( reverseWord.trim());  
}  
}  