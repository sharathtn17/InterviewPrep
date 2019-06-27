package newconcept;

public class compare {

	public static void main(String args[])
	{
		
	
		String s2="xyzs fsdfd s";
		String s3[]=s2.split(" ");
		String res=null;
		String finala=res.substring(0);
		for(int i=0;i<s3.length;i++)
		{
			
			res=new String(s3[i].toCharArray(),0,1).toUpperCase()+new String(s3[i].toCharArray(),1,s3[i].length()-1);
			//System.out.println(res);
		//	
			if(finala==null)
			{
				finala=res+" ";
			}
			else
			{
				finala=finala+res+" ";
			}
		}
		System.out.println(finala);
	}
}
