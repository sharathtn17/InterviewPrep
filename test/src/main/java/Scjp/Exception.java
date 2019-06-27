package Scjp;

public class Exception {

//	public static void main(String args[])
//	{
//	try{
//		
//		System.out.println(10/0);
//		System.out.println("try after error");
//		System.out.println("try after error2");
//	}
//	
//	finally{
//		System.out.println("finally");
//	}
//	System.out.println("after finally");
//	}
	
	public static void main(String args[]) {
		ExceptionChild b = new ExceptionChild();
		Exception a =  b;
		methodref ec=new Exception()::printHi;
	
			
	    
		
		a.printHi();
		//a=null;
		//b=null;
		
		new Exception();
		
		Runtime.getRuntime().gc();
		
	}
	
	@Override
    // finalize method is called on object once  
    // before garbage collecting it 
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 
	String s1;
	public void printHi(){
		System.out.print("Hi2");
		
	}
	
}

interface methodref
{
	void say();
}
class ExceptionChild extends Exception {
	public void printHi(){
		System.out.print("Hi");
		
	}
	
}

