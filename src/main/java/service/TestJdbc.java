package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hibernatetest?"
				+ "user=root&password=mm12583"
				+ "&useUnicode=true"
				+ "&characterEncoding=UTF-8"
				+ "&serverTimezone=UTC" ;
		
		try {
			System.out.println("Connection to database : " + url);
			Connection con = DriverManager.getConnection(url) ;			
			System.out.println("Connection Success ! ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}















