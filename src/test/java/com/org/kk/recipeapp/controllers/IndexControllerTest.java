package com.org.kk.recipeapp.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.mockito.Mockito.*;

import com.org.kk.recipeapp.services.RecipeServiceImpl;

public class IndexControllerTest {
	
	@Mock
	RecipeServiceImpl recipeService;
	
	@Mock
	Model model;
	
	IndexController indexController;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		indexController = new IndexController(recipeService);
	}

	@Test
	public void testGetIndex() {
		
		String viewName = indexController.getIndex(model);
		assertEquals("index", viewName);
		Mockito.verify(recipeService, times(1)).getRecipes();
		Mockito.verify(model, times(1)).addAttribute(eq("recipes"),anySet());
	}

}
