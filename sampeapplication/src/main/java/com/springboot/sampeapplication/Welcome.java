package com.springboot.sampeapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/javaApi/FEEM")
public class Welcome {
	
	@GetMapping("/HelloWorld")
	public String HelloWorld() {
		return "Hii Narendra Welcome to Rest API SpringBoot Application";
		System.out.println("Heyy Narendra I've got one req...!");
	}
	
	@PostMapping("/Account_GAM")
	public String apiData(@RequestParam(name = "oid") String name, @RequestBody String data) {
		System.out.println(name);
		System.out.println(data);
		return data;
		//return String;
	}

}
