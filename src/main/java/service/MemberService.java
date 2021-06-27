package service;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Member;


@Service("memberService")
public class MemberService {
	
	@Autowired
	MemberDAO dao ;

	public MemberService() {
	}

	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}

	// 註冊時間
	public Timestamp registerDate() {
		Timestamp registerDate = new Timestamp(System.currentTimeMillis());
		return registerDate;
	}

	// BMI 計算
	public double calBMI(Member memberBean) {
		double height = memberBean.getHeight();
		double weight = memberBean.getWeight();
		double BMI = weight / Math.pow(height / 100, 2);
		BMI = Math.round(BMI * 100) / 100.0;
		return BMI ;
	}
	
	// insert 會員
	public Member insertMember(Member bean) throws SQLException {
		return dao.insertMember(bean);
	}
}
