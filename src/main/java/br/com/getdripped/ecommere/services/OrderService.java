package br.com.getdripped.ecommere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.getdripped.ecommere.entities.Order;
import br.com.getdripped.ecommere.repositories.OrderRepository;

@Service
public class OrderService {
	
	private OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		var order = orderRepository.findById(id);
		if (order.isEmpty()) return null;
		return order.get();
	}

}
