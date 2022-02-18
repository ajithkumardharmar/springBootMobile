package com.example.sample.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.dao.ProductRepository;
import com.example.sample.model.Products;
import com.example.sample.model.Users;

@Service
public class UserService {

	@Autowired
	ProductRepository productRepo;

	public ModelAndView login(Users userDetails, HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		if (userDetails == null) {
			mv.setViewName("index.jsp");
			mv.addObject("loginError", "Invalid User or Password");
		} else {
			if (userDetails.getRole().equals("user")) {
				mv.setViewName("mobilePage.jsp");
				List<Products> productDetails = productRepo.findAll();
				System.out.println(userDetails.getName());
				mv.addObject("productList", productDetails);
				request.getSession().setAttribute("userId", userDetails.getUserId());
				mv.addObject("name", userDetails.getName());
				mv.addObject("wallet", userDetails.getWallet());
			} else if (userDetails.getRole().equals("admin")) {
				mv.setViewName("adminMain.jsp");
			}
		}
		return mv;
	}

}
