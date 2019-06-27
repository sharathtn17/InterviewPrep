package Collection;

public interface InterfaceExp {
	
	public int i=0;
	final int b=0;
	default void iOne()
	{
		System.out.println("This is a default Method");
	};
	
	default void iOSix()
	{
		System.out.println("This is a default six Method");
	};
	static void iTwo(){System.out.println("This is a Static Method");}
	
/*
	 void iThree();
	
	 public void iFour();
	*/	 public void iFive(int a,int b);

}
