package newconcept;

public class IHasCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		Integer i=10;
    
		System.out.println(a);
		System.out.println(i.hashCode());
		
		System.out.println(System.identityHashCode(a));

		System.out.println(System.identityHashCode(i));
		System.out.println(a==i);
		
		
	}

}
