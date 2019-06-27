package v7api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class PostBody {

	
	public static JSONObject postPersonalInfoBody()
	
	{
        JSONObject requestParams = new JSONObject();
		requestParams.put("userId", "10636666"); // Cast
		requestParams.put("sywNo", "7081327672217159");
		requestParams.put("fname", "Saritappa");
		requestParams.put("lname", "Patilappa");
		requestParams.put("birthDay", "01-01-1986");
		requestParams.put("anniversary", "01-01-1111");
		requestParams.put("annivPreferenceId", "null");
		return requestParams;
	}
	
	public static String generateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
}
