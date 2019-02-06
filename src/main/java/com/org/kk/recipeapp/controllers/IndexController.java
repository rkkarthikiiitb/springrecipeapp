package com.org.kk.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.kk.recipeapp.services.RecipeService;

@Controller
public class IndexController {

	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping({ "", "/", "/index.html" })
	public String getIndex(Model model) {

		model.addAttribute("recipes", recipeService.getRecipes());

		return "index";
	}
}
