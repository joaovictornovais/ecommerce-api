package br.com.getdripped.ecommere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.getdripped.ecommere.dtos.ProductDTO;
import br.com.getdripped.ecommere.repositories.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository ProductRepository;
	
	public ProductService(ProductRepository ProductRepository) {
		this.ProductRepository = ProductRepository;
	}
	
	public List<ProductDTO> findAll() {
		var Products = ProductRepository.findAll();
		return Products.stream().map(x -> new ProductDTO(x)).toList();
	}
	
	public ProductDTO findById(Long id) {
		var Product = ProductRepository.findById(id);
		if (Product.isEmpty()) return null;
		else return new ProductDTO(Product.get());
	}

}
