package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User create(User user) {
		return userRepository.save(user);
	}

	public Optional<User> read(Long id) {
		return userRepository.findById(id);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public Long delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e);
			return (long) 0;
		}
		return (long) 1;

	}

	public List<User> readAll() {
		return (List<User>) userRepository.findAll();

	}
}
