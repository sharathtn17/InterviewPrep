package testProject.test;


import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
 
import org.apache.commons.codec.binary.Base64;
public class DTS {
                public static void main(String[] args) {
                                String ts = null;
        try {
               DateFormat formatter = new SimpleDateFormat(
                            "yyyy-MM-dd'T'HH:mm:ss'Z'");
               ts = formatter.format(new java.util.Date());
        } catch (Exception e) {
               e.printStackTrace();
        }
       
        String sig = null;
        String sid = "3";
        try {
        	  String key ="fdprL5qe2/St1AkzF7jUw3DC00A=";
        	//String key = "ayQBtl6YD67xxLv4paZfVsdbKkc";
               String data = "sid=" + sid + "ts=" + ts;
               SecretKeySpec signKey = new SecretKeySpec(key.getBytes(),
                            "HmacSHA1");
               Mac mac = Mac.getInstance("HmacSHA1");
               mac.init(signKey);
               byte[] rawData = mac.doFinal(data.getBytes());
 
               String base64Data = Base64.encodeBase64String(rawData);
               sig = URLEncoder.encode(base64Data, "UTF-8");
        } catch (Exception ex) {
               System.err.println(ex);
        }
 
        String names[] = new String[] { "sid", "sig", "ts" };
        String values[] = new String[] { sid, sig, ts };
 
        StringBuffer authQuery=new StringBuffer();
        for (int j = 0; j < values.length; j++) {
               authQuery.append(names[j]).append("=").append(values[j]).append("&");
        }
        System.out.println(authQuery);
                }
}
