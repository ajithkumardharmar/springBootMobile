package com.example.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.dao.CartRepository;
import com.example.sample.dao.ProductRepository;
import com.example.sample.model.Cart;
import com.example.sample.model.Products;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;

	@Autowired
	CartRepository cartRepo;

	public String cart(Integer userId, Integer productId) {
		String cart = null;
		Long productIds = (long) (productId);
		try {
			cart = cartRepo.CheckCart(userId, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (cart == null) {
			Products selectedProduct = productRepo.findById(productIds).orElse(new Products());
			Cart carts = new Cart(userId, productId, selectedProduct.getProductName(), selectedProduct.getDescription(),
					selectedProduct.getListPrice(), selectedProduct.getUrl());
			cartRepo.save(carts);
		}
		return cart;
	}

}
