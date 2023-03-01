
package base64converter;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;

public class Base_64 {

    public static String encrypt(String input) {
        String encodedString = Base64.getEncoder().encodeToString(input.getBytes());
        return encodedString;

    }

    public static String decrypt(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
}
