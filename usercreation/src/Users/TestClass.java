package Users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Arrays;
 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 
import org.apache.commons.codec.binary.Base64;
 
 
 
 
//import com.google.gson.JsonSyntaxException;
 
public class TestClass {
 
                public static void main(String[] args) throws IOException, GeneralSecurityException {
                                //System.out.println(getDecryptedValue("R3ZNXbguJwJ2as4Ztl56BIzHv5poq6yM+Tnuy0Cb8/I="));
                                System.out.println(getEncryptedValue("nmsuser.m@gmail.com"));
 
                }
               
                public static String getEncryptedValue(String value) {
                                System.out.println("Value to be encrypted:" + value);
 
                                String ALGO = "AES";
                                String encryptedValue = "";
 
                                String Searskey = "fdprL5qe2/St1AkzF7jUw3DC00A=";
                                try {
 
                                                // Encryption
                                                byte[] keyBytes = Searskey.getBytes("UTF-8");
 
                                                // trim the key to 128 bit (16 bytes).
 
                                                keyBytes = Arrays.copyOf(keyBytes, 16);
 
                                                Key encryptkey = new SecretKeySpec(keyBytes, ALGO);
                                                Cipher c;
 
                                                c = javax.crypto.Cipher.getInstance(ALGO);
 
                                                c.init(javax.crypto.Cipher.ENCRYPT_MODE, encryptkey);
 
                                                byte[] encVal = c.doFinal(value.getBytes());
 
                                                encryptedValue = Base64.encodeBase64String(encVal);
 
                                                System.out.println("encryptedValue: " + encryptedValue);
 
                                } catch (Exception e) {
                                                System.out.println("Exception occurred while encrypting the value(" + value
                                                                                + "): " + e.getMessage());
                                }
                                return encryptedValue;
                }
               
                public static String getDecryptedValue(String encryptedTxt) {
                                System.out.println("Value to be decrypted: " + encryptedTxt);
                                String ALGO = "AES";
                                String decryptedTxt = "";
                                String Searskey = "fdprL5qe2/St1AkzF7jUw3DC00A=";
 
                                try {
                                                byte[] keyBytes = Searskey.getBytes("UTF-8");
                                                keyBytes = Arrays.copyOf(keyBytes, 16);
                                                Key encryptkey = new SecretKeySpec(keyBytes, ALGO);
                                                Cipher c;
                                                c = Cipher.getInstance(ALGO);
                                                byte[] encryptedValueInput = Base64.decodeBase64(encryptedTxt);
                                                c.init(Cipher.DECRYPT_MODE, encryptkey);
                                                byte[] original = c.doFinal(encryptedValueInput);
                                                decryptedTxt = new String(original);
                                                System.out.println("decryptedTxt: " + decryptedTxt);
                                } catch (Exception e) {
                                                System.out.println("Exception occurred while decrypting the value("
                                                                                + encryptedTxt + "): " + e.getMessage());
                                }
                                return decryptedTxt;
                }
}