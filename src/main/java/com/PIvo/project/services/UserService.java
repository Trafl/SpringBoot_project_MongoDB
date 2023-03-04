package com.PIvo.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PIvo.project.UserRepository;
import com.PIvo.project.domain.User;
import com.PIvo.project.dto.UserDTO;
import com.PIvo.project.services.exeption.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User fromDTO (UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}
}
