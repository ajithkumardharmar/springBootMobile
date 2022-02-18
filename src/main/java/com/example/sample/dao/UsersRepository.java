package com.example.sample.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.sample.model.Users;



public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	@Query("from Users where email = ?1 and password = ?2")
	Object UserLoginCheck(String email,String password);

}
