package com.org.kk.recipeapp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	Category category;

	@Before
	public void setup() {

		category = new Category();

	}

	@Test
	public void testGetId() {
		
		Long idVal = 4L;
		category.setId(idVal);
		assertEquals(idVal, category.getId());
	}

	@Test
	public void testGetDescription() {
		String description = "Test Description";
		category.setDescription(description);
		assertEquals(description, category.getDescription());
	}

	@Test
	public void testGetRecipes() {
		fail("Not yet implemented");
	}

}
