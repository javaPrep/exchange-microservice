package com.example.test.user.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.test.user.dto.User;
import com.example.test.user.service.UserDaoService;

@RestController(value = "/jpa")
public class UserController {

	@Autowired
	private UserDaoService userDaoService;

	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return userDaoService.findAll();
	}

	@PostMapping(path = "/users")
	public ResponseEntity<Object> create(@Valid @RequestBody User user) {
		User savedUser = userDaoService.create(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

}
