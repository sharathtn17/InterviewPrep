package testProject.test;

public class OverrideConcept {
	
	public static void main(String args[])
	{
		System.out.println("MainMethod 1");
		try{
			new OverrideConcept().go();
		}catch(Error e){
			System.out.print(e+"Error Catched");
		}
	}
	 void go() {
	      
	    }
}

class or extends OverrideConcept{
	
	public static void main(String args[])
	{
		System.out.println("MainMethod 2");
		
		int x=(int) Math.pow(8, 2);
		System.out.println(x);
	}

}