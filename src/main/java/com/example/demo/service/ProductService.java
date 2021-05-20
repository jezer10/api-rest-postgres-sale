package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductService{
	@Autowired
	ProductRepository productRepository;
	public Product read(Long id) {
		return productRepository.findById(id).get();
	}

}
