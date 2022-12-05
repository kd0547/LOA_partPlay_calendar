package discordauthentication;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

public interface discordAuth {
	/**
	 * 현재 시간으로 
	 * @param nowTime
	 */
	public String encrypt (LocalDateTime nowTime)throws NoSuchAlgorithmException;
	
	public String encrypt (String nowTime)throws NoSuchAlgorithmException;
	
}
