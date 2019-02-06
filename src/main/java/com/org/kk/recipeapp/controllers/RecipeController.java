package com.org.kk.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.kk.recipeapp.services.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RecipeController {
	
	private final RecipeService recipeService;

	/**
	 * @param recipeService
	 */
	public RecipeController(RecipeService recipeService) {
		
		this.recipeService = recipeService;
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/recipe/show/{id}")
	public String showById(@PathVariable String id, Model model) {
		log.debug("Entering show/id call...");
		model.addAttribute("recipe",recipeService.findById(new Long(id)));
		return "recipe/show";
		
	}
	

}
