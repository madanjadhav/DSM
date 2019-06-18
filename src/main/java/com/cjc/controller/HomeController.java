package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Address;
import com.cjc.model.Student;
import com.cjc.serviceInterface.SrviceInterface;

@Controller
public class HomeController {
	
	@Autowired
	SrviceInterface s;
	@RequestMapping("/")
	public String loginpage(){
		System.out.println("inside controller login page");
		return "login";
		
	}
	
	@RequestMapping("/regiterpage")
	public String registerpage(){
		return "register";
		
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute Student stud,Address address){
		stud.setAddress(address);
		s.register(stud);
		return "login";
		
	}
	
	@RequestMapping("/login")
	public String logincheck(@ModelAttribute Student stu,Model m){
		
		List<Student> list=s.logincheck(stu);
		boolean flag=false;
		for(Student s:list){
			if(s.getUsername().equals(stu.getUsername()) && s.getPassword().equals(stu.getPassword())){
				flag=true;
			}
		}
		if(flag==true){
			m.addAttribute("list", list);
			return "success";
		}
		else{
			m.addAttribute("msg", "User Name or password is incorrect");
			return "login";
		}
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int rollno,Model m){
		List<Student> list=s.delete(rollno);
		m.addAttribute("list", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam int rollno, Model m){
		System.out.println("inside edit to display user");
		Student stud=s.getstudnet(rollno);
		System.out.println(stud.getName());
		m.addAttribute("stud", stud);
		return "update";
		
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student stud,Address address,Model m){
		stud.setAddress(address);
		List<Student> list=s.update(stud);
		m.addAttribute("list", list);
		return "success";
		
	}

}
