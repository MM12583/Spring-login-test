package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import bean.Member;


@Service
public class MemberDAO {

	SessionFactory factory;
	Session session;

	// Read config & create session
	public MemberDAO() {
		// 默認 hibernate.cfg.xml 在 src/main 下 (非靜態資源)
		factory = new Configuration()
				.configure("/service/hibernate.cfg.xml")
				.addAnnotatedClass(Member.class)
				.buildSessionFactory();
		session = factory.getCurrentSession();
	}
	
	//insertMember
	public Member insertMember(Member bean) {
		// start transaction
		System.out.println("開始交易");
		session.beginTransaction() ;
		// save the Member object
		System.out.println("儲存會員資料");
		session.save(bean) ;
		// commit transaction ; commit 會印出儲存物件
		session.getTransaction().commit();
		System.out.println("儲存成功 ! ");
			
//		session.close(); // server 啟動後不關閉
		
		return null ;
	}
	
	// retrieve member with P.K (id)
	public Member retrieveMemberId(int id) {
		System.out.println("開始交易");
		session.beginTransaction() ;
		System.out.println("讀取會員資料");		
		Member member = session.get(Member.class, id);
		return member;	
	}
	
	// select all
	public List<Member> selectAll(){
		List<Member> members = session.createQuery("from member").getResultList();
		return members;
	}
}













