package br.com.getdripped.ecommere.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.getdripped.ecommere.dtos.UserDTO;
import br.com.getdripped.ecommere.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		if (userService.findById(id) != null) return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
		else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	}
	
}
