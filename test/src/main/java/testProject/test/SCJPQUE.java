package testProject.test;

public class SCJPQUE {
	
	
	@SuppressWarnings("null")
	public static void main(String args[]) {
		     Object myObj = new String[]{"one", "two", "three"};{
		          for (String s : (String[])myObj) System.out.print(s + ".");
		      }

		     try {
		            String arr[] = new String[10];
		            arr = null;
		            arr[0] = "one";
		            System.out.print(arr[0]);
		        } catch(NullPointerException nex) { 
		            System.out.print("null pointer exception"); 
		        } catch(Exception ex) {
		            System.out.print("exception");
		        }
}
}
