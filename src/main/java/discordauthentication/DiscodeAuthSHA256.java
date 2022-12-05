package discordauthentication;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

public class DiscodeAuthSHA256 implements discordAuth{

	
	@Override
	public String encrypt(LocalDateTime nowTime) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String encrypt(String nowTime) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(nowTime.getBytes());
		
		
		return bytesToHex(md.digest());

	}
	 private String bytesToHex(byte[] bytes) {
	        StringBuilder builder = new StringBuilder();
	        for (byte b : bytes) {
	            builder.append(String.format("%02x", b));
	        }
	        return builder.toString();
	    }
	 
	 
	
	
}
