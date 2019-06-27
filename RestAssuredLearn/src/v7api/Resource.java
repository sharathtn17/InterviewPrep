package v7api;

public class Resource {
	
	
	public static String getMemberPinResource(String version)
	{
		String defalutversion="v7/user/updateMemberPin";
		if(version.equals("v7"))
		return "v7/user/updateMemberPin";
		
		return defalutversion;
			
	}
	
	public static String personalInfoURI(String version)
	{
		String defalutversion="v7/user/personalinfo";
		if(version.equals("v7"))
		return "v7/user/personalinfo";
		
		return defalutversion;
			
	}
    
}
