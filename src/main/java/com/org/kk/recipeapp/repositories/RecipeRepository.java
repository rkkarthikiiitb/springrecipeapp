package com.org.kk.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.org.kk.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
