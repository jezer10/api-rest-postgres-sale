package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("")
	public List<User> readAll() {
		return userService.readAll();
	}

	@GetMapping("/{id}")
	public Optional<User> read(@PathVariable Long id) {
		return userService.read(id);
	}

	@PostMapping("/add")
	public User create(@RequestBody User user) {
		return userService.create(user);
	}

	@PutMapping("/update/{id}")
	public User update(@PathVariable Long id, @RequestBody User user) {
		user.setIduser(id);
		return userService.update(user);
	}

	@DeleteMapping("/delete/{id}")
	public Long delete(@PathVariable Long id) {
		return userService.delete(id);
	}

}
