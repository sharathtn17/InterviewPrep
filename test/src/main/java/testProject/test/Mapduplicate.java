package testProject.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapduplicate {

	
	public static void main(String args[])
	{
		
		Map<String, ArrayList> map=new HashMap();
		List<String> list = new ArrayList<>();
		
	//	map.put("a",list.add("adsdf"));
	//	map.get("a").add("ghhghgghhg");
		//map.get("a").add("sdsdsd");
		map.put("b",(ArrayList) list);
		
		System.out.println(map.get("a"));
		
		
	}
	
}
