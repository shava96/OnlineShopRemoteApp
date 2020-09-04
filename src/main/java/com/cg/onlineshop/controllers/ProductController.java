package com.cg.onlineshop.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping(method=RequestMethod.GET, value={"/sayHello"},produces={"text/html"})
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello To All From OnlineShop", HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.GET, value={"/sayHi"},produces={"application/text"})
	public ResponseEntity<String> sayHi(){
		return new ResponseEntity<String>("Hi to All From OnlineShop", HttpStatus.OK);
	}
}
