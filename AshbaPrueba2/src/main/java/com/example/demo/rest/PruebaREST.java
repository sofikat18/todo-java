package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
@RequestMapping("products")

public class PruebaREST {
	
	@GetMapping
	public ResponseEntity<Product> getProduct(){
		
		return ResponseEntity.ok(product);
	}
	
	//@GetMapping //localhost:8080/
	//@RequestMapping(value="hello", method=RequestMethod.GET)
	
	}


