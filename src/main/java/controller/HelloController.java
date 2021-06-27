package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import bean.MemberBean;

@Controller
public class HelloController {
	
	// 首頁
	@RequestMapping("/") 
	public String showMyPage() {
		return "index"; 
	}
	
	// 註冊頁面
	@RequestMapping("/register") 
	public String showRegisterPage(Model model) {
		
		MemberBean member = new MemberBean();
		model.addAttribute("member" ,member) ;
		
		return "/views/register"; 
	}
	
	// 處理註冊頁面
	@RequestMapping("/processRegister")
	public String processForm(
			// 取得Model
			@ModelAttribute("member") MemberBean member) {

		return "/views/confirmation" ;
	}
	
	
}
