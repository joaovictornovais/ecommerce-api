package br.com.getdripped.ecommere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.getdripped.ecommere.dtos.OrderDTO;
import br.com.getdripped.ecommere.repositories.OrderRepository;

@Service
public class OrderService {
	
	private OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	public List<OrderDTO> findAll() {
		var orders = orderRepository.findAll();
		return orders.stream().map(x -> new OrderDTO(x)).toList();
	}
	
	public OrderDTO findById(Long id) {
		var order = orderRepository.findById(id);
		if (order.isEmpty()) return null;
		else return new OrderDTO(order.get());
	}

}
