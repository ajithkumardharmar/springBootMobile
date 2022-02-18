package com.example.sample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.dao.ProductRepository;
import com.example.sample.model.Products;
import com.example.sample.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepo;

	@Autowired
	ProductService productService;

	@GetMapping("/MobileInfo")
	public ModelAndView mobileInfo(@RequestParam Long productId) {
		ModelAndView mv = new ModelAndView("mobileInfo.jsp");
		Products selectedProduct = productRepo.findById(productId).orElse(new Products());
		mv.addObject("selectedProduct", selectedProduct);
		return mv;
	}

	@GetMapping("/addCart")
	public String addCart(@RequestParam Integer productId, HttpSession session) {
		Integer userId = Integer.parseInt(session.getAttribute("userId").toString());
		String msg = null;
		System.out.println(userId + " hloo2 " + productId);

		String productName = productService.cart(userId, productId);

		System.out.println(productName + "holl");
		if (productName != null) {
			msg = "Already Item is cart";
			System.out.println("Already Item is cart");

		} else {
			msg = "Cart Successfully";

		}
		return msg;
	}

}
