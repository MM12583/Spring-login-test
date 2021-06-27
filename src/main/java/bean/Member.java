package bean;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

//注意 import 種類
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity import hibernate package 須默認 table name == class name
@Entity()
@Table(name = "member")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	// @Id 表示 P.K 一定要有 ; GenerationType.IDENTITY => 取消 Java 端 Null
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; // 編號* auto_increment、Integer 可以NULL
	@Column(name = "account")
	private String account; // 帳號
	@Column(name = "password")
	private String password; // 密碼
	@Column(name = "name")
	private String name; // 姓名
	@Column(name = "email")
	private String email; // 信箱
	@Column(name = "address")
	private String address; // 地址
	@Column(name = "phone")
	private String phone; // 電話
	// sumbit 調用set方法 sql.Date.valueOf() => 可轉換
	@Column(name = "birthday")
	private java.sql.Date birthday; // 生日
	@Column(name = "registerdate")
	private Timestamp registerDate; // 會員登錄日期*
	@Column(name = "picture")
	private Blob head; // 頭貼*
	@Column(name = "height")
	private double height; // 身高
	@Column(name = "weight")
	private double weight; // 體重
	@Column(name = "BMI")
	private double bmi; // BMI*

	public Member() {
	}

	public Member(Integer id, String account, String password, String name, String email, String address,
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberBean [id=");
		builder.append(id);
		builder.append(", account=");
		builder.append(account);
		builder.append(", password=");
		builder.append(password);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", registerDate=");
		builder.append(registerDate);
		builder.append(", head=");
		builder.append(head);
		builder.append(", height=");
		builder.append(height);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", bmi=");
		builder.append(bmi);
		builder.append("]");
		return builder.toString();
	}
}
