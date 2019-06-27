package ExcelOperation;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

public class Employee implements Comparable {
	
	    @ExcelRow                    
	    public int rowIndex;

	    @ExcelCell(0)                
	    public int Age;     

	    @ExcelCell(1)
	    public String Name;

	    
	    @Override
	    public boolean equals(Object o) { 
	    	
	    System.out.println(this.Age+"***"+((Employee)o).Age);
	    System.out.println(this.Name+"***"+((Employee)o).Name);
	    	
	    	if(/*Integer.compare(Age,((Employee) o).Age)==0*/ this.Age==((Employee) o).Age && Name.equals(((Employee) o).Name))
	    		return true;
			
	    	return false;
	    }


		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			if(Integer.compare(Age,((Employee) o).Age)==0 && Name.equals(((Employee) o).Name))
			{
			System.out.println("rurn true*****");
				return 1;
			}
			return 0;
		}
		

		
}
