package br.com.getdripped.ecommere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.getdripped.ecommere.dtos.UserDTO;
import br.com.getdripped.ecommere.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<UserDTO> findAll() {
		var users = userRepository.findAll();
		return users.stream().map(x -> new UserDTO(x)).toList();
	}
	
	public UserDTO findById(Long id) {
		var user = userRepository.findById(id);
		if (user.isEmpty()) return null;
		else return new UserDTO(user.get());
	}
	
}
