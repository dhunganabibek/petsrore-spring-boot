package com.bibekdhungana.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {
	
	@GetMapping("cat")
	public String getCats(Model model) {
		ArrayList<String> favoriteCats = new ArrayList<>();
		favoriteCats.add("Jonny");
		favoriteCats.add("Tetus");
		favoriteCats.add("Kite");
		model.addAttribute("cats", favoriteCats);
		return "index";
	}

}
