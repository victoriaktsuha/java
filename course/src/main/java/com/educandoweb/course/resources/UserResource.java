package com.educandoweb.course.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;



@RestController
//nome do recurso
@RequestMapping(value = "/users")
public class UserResource {
	
	//método endpoint para acessar usuários
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@mailcom", "123456789","12345");
		return ResponseEntity.ok().body(u);
	}
	
}