package com.payment.controller;

import java.util.Random;

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
		Random rand = new Random();
		
		@RequestMapping(value = "/", method = RequestMethod.GET)		
		@ResponseBody
		public Object index(){
			return processPayment();
		}
		
		private boolean processPayment() {			
//			int lucky = 0;
//			for (int i = 0; i < 100; i++) {
			if (rand.nextInt(100) < 95) {
				System.out.println("Payment was processed successfully!");
			    return true;
			}
			System.out.println("Payment failed!");
			return false;
//			}
//			System.out.println(lucky);
//			return false;
		}
}