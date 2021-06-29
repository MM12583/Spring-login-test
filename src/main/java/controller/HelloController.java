package controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Member;
import service.MemberService;

@Controller
public class HelloController {
	
	@Autowired
	MemberService memberService ;
	
	public HelloController() {
	}

	public HelloController(MemberService memberService) {
		this.memberService = memberService;
	}

	// 首頁
	@RequestMapping("/") 
	public String showMyPage() {
		return "index"; 
	}
	
	// 註冊頁面
	@RequestMapping("/register") 
	public String showRegisterPage(Model model) {
		
		Member member = new Member();
		model.addAttribute("member" ,member) ;
		
		return "/views/register"; 
	}
	
	// 處理註冊頁面
	@RequestMapping("/processRegister")
	public String processForm(
			// 取得Model
			@ModelAttribute("member") Member member) {
		
		// add member info
		member.setRegisterDate(memberService.registerDate());
		member.setBmi(memberService.calBMI(member));
		// 加密
		member.setPassword(memberService.passwordEncoder(member.getPassword()));
		
		// add MySQL
		try {
			memberService.insertMember(member) ;
		} catch (SQLException e) {
			System.out.println("加入失敗 QAQ") ;
			e.printStackTrace();
		}
		return "/views/confirmation" ;
		
	}
	
	
}
