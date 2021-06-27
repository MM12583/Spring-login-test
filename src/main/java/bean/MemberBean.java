package bean;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

public class MemberBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;   				// 編號*
	private String account;   			// 帳號	
	private String password;   			// 密碼
	private String name;       			// 姓名
	private String email;       		// 信箱	
	private String address;    			// 地址
	private String phone;     			// 電話
	// sumbit 調用set方法 sql.Date.valueOf() => 可轉換
	private java.sql.Date birthday;	// 生日	
	private Timestamp registerDate;	// 會員登錄日期*	
	private Blob head;					// 頭貼*
	private double height;				// 身高
	private double weight;				// 體重
	private double bmi;					// BMI*
	
	public MemberBean() {
	}

	public MemberBean(String id, String account, String password, String name, String email, String address,
			String phone, java.sql.Date birthday, Timestamp registerDate, Blob head, double height, double weight,
			double bmi) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.birthday = birthday;
		this.registerDate = registerDate;
		this.head = head;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}
	
	// sumbit 調用set方法 sql.Date.valueOf() => 可轉換
	public void setBirthday(String birthday) {
		Date date = Date.valueOf(birthday);
		this.birthday = date;
	}

	public java.sql.Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(java.sql.Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	public Blob getHead() {
		return head;
	}

	public void setHead(Blob head) {
		this.head = head;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	
}
