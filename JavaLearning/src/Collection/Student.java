package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int id;
    public String getName() {
        return name;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Student(){};
public Student(int id)
{
	this.id=id;
	//this.name="";
}

public Student(int id,String Name)
{
	this.id=id;
	this.name=Name;
}

public void changeStuName( String NewName) throws StudentNotValidException 
{
	if(this.name==null)
	{
		throw new StudentNotValidException();
	}
	if(this.name=="")
	{
		throw new StudentNotValidException();
	}
	
	this.name=NewName;
}
@Override
public int hashCode()
{
	
	return this.id;
}
@Override
public boolean equals(Object s)
{
	 Student s1=(Student)s;
	 System.out.println("EQUALS METHO "+this.getName());
	if(name.equals(s1.name)){
		 System.out.println("EQUALS METHO true "+this.getName());
		return true;
	}
		else
			return false;
}
@Override
public String toString()
{
	return  this.name;
}

public static void main(String[] args) {
    Student stu1 = new Student(23);
    Student stu2 = new Student(23);
    System.out.println(stu1);
   
  System.out.println(stu1.hashCode());
  System.out.println(stu2.hashCode());
  
  Map<Student,String> mp=new HashMap<Student,String>();
  mp.put(stu1, "ab");
  mp.put(stu2, "ab");
  System.out.println(mp.size());

}
}

