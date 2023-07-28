package br.com.getdripped.ecommere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.getdripped.ecommere.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
