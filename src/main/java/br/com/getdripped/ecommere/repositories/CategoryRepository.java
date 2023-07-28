package br.com.getdripped.ecommere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.getdripped.ecommere.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
