package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public class PaymentController {
//	  @Autowired
//	  private CartService cartService;
		
		@RequestMapping(value = "/", method = RequestMethod.GET)		
		@ResponseBody
		public Object index(){ 
			return "Welcome to the payment service!";
		}
}