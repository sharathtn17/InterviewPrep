package Collection;

import java.io.IOException;

import org.w3c.dom.ranges.RangeException;

public class StudentNotValidException 	extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentNotValidException()
	{
		System.out.println("StudentNotValidException");
	}
	
	public StudentNotValidException(Student s1)
	{
		System.out.println(s1.getName()+" StudentNotValidException");
	}
}
