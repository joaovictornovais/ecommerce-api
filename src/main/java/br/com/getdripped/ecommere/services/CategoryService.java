package br.com.getdripped.ecommere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.getdripped.ecommere.dtos.CategoryDTO;
import br.com.getdripped.ecommere.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<CategoryDTO> findAll() {
		var categorys = categoryRepository.findAll();
		return categorys.stream().map(x -> new CategoryDTO(x)).toList();
	}
	
	public CategoryDTO findById(Long id) {
		var category = categoryRepository.findById(id);
		if (category.isEmpty()) return null;
		else return new CategoryDTO(category.get());
	}

}
