package service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyPasswordEncoder  {
	
	// use BCrypt
	public String encryption(String password) {
		// 加鹽次數
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        // 轉換
        String encodePasswod = encoder.encode(password);       
        return encodePasswod ; 
    }
	
}
