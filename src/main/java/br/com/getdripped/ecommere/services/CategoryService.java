package br.com.getdripped.ecommere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.getdripped.ecommere.entities.Category;
import br.com.getdripped.ecommere.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> findAll() { 
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		var category = categoryRepository.findById(id);
		if (category.isEmpty()) return null;
		else return category.get();
	}

}
