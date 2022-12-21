package com.bibekdhungana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DogController {

//	simple path
	@GetMapping("dog")
	@ResponseBody
	public String bark() {
		return "<html><body>" +
			   "<h2>My Dog Page</h2>"+
				"<form action='add' method='post'>"+
				"<input type='text' name='name'>"+
				"<input type='submit' value='Add'"+
				"</form></body></html>";
	}
	
	@PostMapping("add")
	@ResponseBody
	public String respondBack() {
		return "Dog Added successfull";
	}
	
	// path variables
	@GetMapping("dog/{name}")
	@ResponseBody
	public String barkName(@PathVariable String name) {
		return name + " barks";
	}
	
//	//using parameters
//	@GetMapping("dog")
//	@ResponseBody
//	public String barkWithName(@RequestParam String name, @RequestParam int age) {
//		return name +" with age " + age + " barks!!!";
//	}
	
	
}
