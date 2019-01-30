package com.org.kk.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.org.kk.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
