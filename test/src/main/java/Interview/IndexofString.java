package Interview;

public class IndexofString {
	
	public static void main(String args[]){
	String hatchsay="heloll";
	String needle="ll";
    
	int index=0;
	for(int j=0;j<hatchsay.length();j++){
		
		for(int i=0;i<needle.length();i++)
		{
			
				index=hatchsay.indexOf(needle);
			
		}
		fizzbuzz();
		
	}
	System.out.println(index);
	}
	
	public static void fizzbuzz()
	{
		
	}
}
