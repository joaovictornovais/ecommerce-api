package br.com.getdripped.ecommere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.getdripped.ecommere.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
