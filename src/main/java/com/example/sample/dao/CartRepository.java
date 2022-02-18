package com.example.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sample.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

	@Query("select productName from Cart where userId=?1 and productId=?2")
	String CheckCart(Integer userId, Integer productId);

}
