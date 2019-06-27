package program;

public class ArrayProg {
	
	
	public static void findIndex(int[] arr)
	{
	     int n= arr.length/2;
	     int lhs=0;
	     int rhs=0;
	    
	    do{	
	    	  
	    	 if(n+1>= arr.length || n<0){
				 System.out.println("No element is there around which sume is equal");
				 System.exit(0);
			 }
	    	  lhs=0;
		      rhs=0;
	    	
		 for(int i=0;i<n;i++)
		 {   System.out.println("n is " +n);
			 lhs=lhs+arr[i];
			 System.out.println("LHS "+lhs );
		 }
		 
		 for(int j=n+1;j<arr.length;j++)
		 {
			 rhs=rhs+arr[j];
			 System.out.println("RHS "+rhs );
		 }
		 
		 if(lhs==rhs)
		 {
			 break;
		 }
		 if(lhs<rhs)
		 {		 
			 n++;
			 
		 }else
		 {
			 n--;
		 }
		 
		
		 
	    }
	    while(lhs!=rhs)	;
	     
	    System.out.println("element index is = "+n+" and element is ="+arr[n]);
		
	}

	
	public static void main(String args[])
	{
		int[] arr={2,3,2,1,-1,6,2,1,-1,2,1,1,1};
		//int[] arr={2,3,898};
		
		findIndex(arr);
		
	}
}
