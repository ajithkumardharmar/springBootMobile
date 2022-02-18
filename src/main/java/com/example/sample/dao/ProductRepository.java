package com.example.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
