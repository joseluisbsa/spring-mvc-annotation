package br.com.demomvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.demomvc.dao.HelloWorldDAO;
import br.com.demomvc.entity.HelloWorld;

@RestController
public class HelloWorldController {
	
	@Autowired
	private HelloWorldDAO dao;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping(value= {"/save"}) 
	public void save(HelloWorld hello) {
		dao.save(hello);
	}
	
	@GetMapping("/{id}")
	public HelloWorld findById(@PathVariable Long id) {
		return dao.findById(id);
	}

}
