package br.com.getdripped.ecommere.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.getdripped.ecommere.entities.Order;
import br.com.getdripped.ecommere.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(orderService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		if (orderService.findById(id) != null) return ResponseEntity.status(HttpStatus.OK).body(orderService.findById(id));
		else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found");
	}
	
}
