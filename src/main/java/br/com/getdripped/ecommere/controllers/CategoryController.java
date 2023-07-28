package br.com.getdripped.ecommere.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.getdripped.ecommere.dtos.CategoryDTO;
import br.com.getdripped.ecommere.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	private CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(categoryService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		if (categoryService.findById(id) != null) return ResponseEntity.status(HttpStatus.OK).body(categoryService.findById(id));
		else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category not found");
	}
	
}
