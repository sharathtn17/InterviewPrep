package newconcept;

public class ThreadLocalImp {

	public ThreadLocalImp()
	{
		System.out.println("Thread Local Imp COnstructor");
	}
	public String methodOne()
	{
		System.out.println("Mehtod");
		return "string"
;	}
	 static ThreadLocal<ThreadLocalImp> t=new ThreadLocal<ThreadLocalImp>(){
		
		@Override protected ThreadLocalImp initialValue() {
	         System.out.println("Called Intial Value");
			return new ThreadLocalImp();
	    }
		
		public String toString()
		{
			return "called";
		}
	};
	
	public static void main(String args[])
	{
		
		
		ThreadLocalImp.t.get();
		
		System.out.println((ThreadLocalImp.t.get()).methodOne());
	//	ThreadLocalImp.t.set();
		ThreadLocalImp.t.get();
		
		//System.out.println(ThreadLocalImp.get());
		
	}
}
