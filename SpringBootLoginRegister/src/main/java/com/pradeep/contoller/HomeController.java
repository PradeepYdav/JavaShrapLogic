package com.pradeep.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pradeep.model.Login;
import com.pradeep.model.Register;
import com.pradeep.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userSerice;
	
	
	@RequestMapping("/")
	public String indexpage() {
		return "home.jsp";
	}
	
	@RequestMapping("login")
	public String loginpage() {
		return "login.jsp";
	}
	
	@RequestMapping("register")
	public String registerpage() {
		return "register.jsp";
	}
	
	@RequestMapping(path = "login" ,method = RequestMethod.POST)
	public ModelAndView validateLogin(Login login) {
		ModelAndView md= new ModelAndView();
		if(userSerice.validateUser(login)) {
		md.setViewName("welcome.jsp");
		md.addObject("user", "User Email id :"+login.getEmail());
		}else {
			md.setViewName("login.jsp");
			md.addObject("error", "Email id :"+login.getEmail() +" or pAssword Wrong");
		}
		return md;
	}
	
	@RequestMapping(path = "register",method = RequestMethod.POST)
	public ModelAndView regsiter(Register register) {
		Register reg=userSerice.regsiteruser(register);
		
		ModelAndView md= new ModelAndView("welcome.jsp");
		md.addObject("user", reg.toString());
		return md;
	}
	
}
