package testProject.test;

public class Student {
	 
    private String studentName ; // instance variable, specific to a Student
    private int studentCount ; // class variable

   // constructer used to initialise a Student object.
  /* public Student(String studentName) {
             this.studentName = studentName ;
   }
*/
   /* 
   
   Every time you create a Student, incrementStudent( ) method can   
   be invoked to update the studentCount class variable.

   Remember, only  a static method or class method can have access to               a static/class variable.
   
    */
 
  public  static void incrementStudentCount( ) {
          //  studentCount++;
  }
} // end of the class Student