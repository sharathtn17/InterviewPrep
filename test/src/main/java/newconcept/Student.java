package newconcept;

class Student{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Student(int rollno, String name, String city){  
	 
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public String toString(){
		return "RollNo: "+rollno+" Name:"+name+" City:"+city; 
	 }
	 public boolean equals(Object o){

            Student s=(Student)o;
            if(this.rollno==s.rollno && this.name==s.name)
            	return true;
            	else return false;
		 }
	 
	 public int hashCode()
	 {
		 return this.rollno;
	 }
	 
	 public static void main(String args[]){  
	   Student s1=new Student(101,"Raj","lucknow");  
	   Student s2=new Student(101,"Raj","lucknow");  
	     
	   System.out.println(s1.name+s1.rollno);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	   System.out.println(s2.hashCode());
	   System.out.println(s1.hashCode());
	   System.out.println(s1.equals(s2));
	   System.out.println(s1==s2);
	   System.out.println(System.identityHashCode(s1));
	   System.out.println(System.identityHashCode(s2));
	 }  
	}  
