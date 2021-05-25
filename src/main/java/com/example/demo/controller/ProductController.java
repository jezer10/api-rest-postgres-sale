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

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping("")
	public List<Product> readAll() {
		return productService.readAll();
	}

	@GetMapping("/{id}")
	public Optional<Product> read(@PathVariable Long id) {
		return productService.read(id);
	}

	@PostMapping("/add")
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}

	@PutMapping("/update/{id}")
	public Product update(@PathVariable Long id, @RequestBody Product product) {
		product.setIdproduct(id);
		return productService.update(product);
	}

	@DeleteMapping("/delete/{id}")
	public Long delete(@PathVariable Long id) {
		return productService.delete(id);
	}

}
