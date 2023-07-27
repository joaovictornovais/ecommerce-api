package br.com.getdripped.ecommere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.getdripped.ecommere.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
