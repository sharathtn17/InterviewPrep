package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

	
	public static void main(String[] args) {
	    Student stu1 = new Student(23,"Ankith");
	    Student stu2 = new Student(23,"fhdh");
	    Student stu3 = new Student(43,"THor");
	    Student stu4 = new Student(44);
	    System.out.println(stu1);
	//   stu1.
	//   String
	  System.out.println(stu1.hashCode());
	  System.out.println(stu3.hashCode());
	  
	  Map<Student,String> mp=new HashMap<Student,String>();
	  mp.put(stu1, "ab");
	  mp.put(stu2, "bc");
	  System.out.println(mp.containsKey(stu3)+"FALSE");
	 
	  List<Student> sl=new ArrayList<Student>();
	  sl.add(stu1);
	  sl.add(stu2);
	  sl.add(stu3);
	  sl.add(stu4);
	  
	  sl.forEach(n->System.out.println(n));
	  stu1.changeStuName("Caps");
	  sl.forEach(n->System.out.println(n));
	 // stu4.changeStuName("pops");
	  sl.forEach(n->System.out.println(n));
	  
	  
	  System.out.println(sl.size()+" ArrayList");
	  
	  stu1.getClass();
	//  Object o=new Object();
	  
	  System.out.println(mp.size()+" HaspMap");
	  System.out.println(mp+" HaspMap");
       mp.compute(stu1, (key,valu)->(valu==null)?"Abc" :"udpdate");
       mp.forEach((k,v)->System.out.println(k+" "+v));
       
	}
}
