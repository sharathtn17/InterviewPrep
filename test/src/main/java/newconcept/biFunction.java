package newconcept;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class biFunction {
	
	public static void main(String args[])

	{
		BiFunction<Integer,Integer,Integer> s=(a,b)->(a==1)?5:a+1;
		
		System.out.println(s.apply(2, 2));
		
		System.out.println();
		
		Consumer<Integer> cm=i->System.out.println(i*i);
		cm.accept(9);
		int a;
		
		BiConsumer<Integer,Integer> cm2=(i,j)->System.out.println(i*j);
		cm2.accept(9,8);
	}
}