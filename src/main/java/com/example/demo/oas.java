package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oas {
	public class Controller {
		@GetMapping(value="/oas")
		
		public String getMsg() {
			return "Sucessfully Joined";
		}

	}


}
