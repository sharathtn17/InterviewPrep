package newconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuntionJava8 {
	
	
	
	public static void  main(String args[])
	{
		
		Function<Integer,Integer> Fun=(i)->{
			if(i%2==0)
				System.out.println("EVEN");
			else System.out.println("ODD");
			return i*i;
			};
			
		Function<Integer,Integer> Fun2=(i)->{
				return i-5;
				};

			List<Integer> list1=new ArrayList<>();
			list1.add(10);
			list1.add(9);
			list1.add(8);
			
		for(int a:list1)
		{
			Fun.apply(a);
		}
	//	list1.forEach(i->System.out.println(i*i));
		
		
		System.out.println(Fun.andThen(Fun2).apply(10));
	/*	System.out.println(Fun.compose(Fun2).apply(10));
		System.out.println(Function.identity().apply(Fun.apply(20)));
		*/
		
			
	}
	

}
