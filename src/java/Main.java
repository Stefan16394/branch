import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String passowrd ="manager";
        byte[] bytesOfMessage = passowrd.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(bytesOfMessage);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
            sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
        }
        System.out.println(sb.toString());
    }
}
