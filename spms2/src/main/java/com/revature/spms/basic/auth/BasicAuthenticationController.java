package com.revature.spms.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Step 1: tell Spring that this is a controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthenticationController {
	
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException("Unknown Error Occured: please try again later.");
		return new AuthenticationBean("You are now Authenticated");
	}
	
	
	
	
	
}
