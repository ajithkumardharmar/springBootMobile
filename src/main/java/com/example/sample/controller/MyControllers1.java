package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sample.dao.UsersRepository;
import com.example.sample.model.Users;

@Controller
public class MyControllers1 {

	@Autowired
	UsersRepository usersRepo;

	@RequestMapping("/home")
	public String home() {
		System.out.println("hllo");
		return "home1.jsp";
	}

//	@RequestMapping("/add")
//	public String addAlien(Alien alien){
//		repo.save(alien);
//		return "home.jsp";
//	}
//	
//	@RequestMapping("/getData")
//	public ModelAndView getAlien(@RequestParam int aid){
//		ModelAndView mv=new ModelAndView("viewAlien.jsp");
//		Alien alien=repo.findById(aid).orElse(new Alien());
//		//System.out.println(repo.findByAname("ajith"));
//		mv.addObject("alien",alien);
//		return mv;
//	}
//	
//	@RequestMapping("/updateData")
//	public ModelAndView updateAlien(@RequestParam int aid, String aname){
//		ModelAndView mv=new ModelAndView("viewAlien.jsp");
//		Alien alhimeien=repo.findById(aid).orElse(new Alien());
//		alien.setAname(aname);
//		repo.save(alien);
//		mv.addObject("alien",alien);
//		return mv;
//	}
//	@RequestMapping("/deleteData")
//	public ModelAndView deleteAlien(@RequestParam int aid){
//		ModelAndView mv=new ModelAndView("viewAlien.jsp");
//		repo.deleteById(aid);
//		Iterable<Alien> alien= repo.findAll();
//		
//		mv.addObject("alien",alien);
//		return mv;
//	}

	@RequestMapping("/getAll")
	@ResponseBody
	public List<Users> getAllAlien() {
//		ModelAndView mv=new ModelAndView("viewAlien.jsp"); 
//		Iterable<Alien> alien=repo.findAll();
//		System.out.println(repo.findByLang("java"));
//		System.out.println(repo.findByAidGreaterThan(101));
//		System.out.println(repo.findByLangSorted("java"));
//		mv.addObject("alien",alien);
		return usersRepo.findAll();
	}

}
