package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public Product create(Product product) {
		return productRepository.save(product);
	}
	
	public Product update(Product product) {
		return productRepository.save(product);
	}
	
	public Long delete(Long id) {
		try {
			productRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e);
			return (long) 0;
		}
		
		return (long) 1;
		
	}

	public Optional<Product> read(Long id) {
		return productRepository.findById(id);
	}
	
	public List<Product> readAll() {
		return (List<Product>) productRepository.findAll();
	}

}
