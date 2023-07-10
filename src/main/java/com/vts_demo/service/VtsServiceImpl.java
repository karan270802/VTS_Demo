package com.vts_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vts_demo.entity.Product;
import com.vts_demo.repository.VtsRepository;

@Service
public class VtsServiceImpl implements VtsService{

	@Autowired
	private VtsRepository repo;
	
	@Override
	public String getHelloWorldDetails() {
		return "HelloWorld from Service";
	}
	
	@Override
	public Product getProduct(Integer id) {
		Optional<Product> product = repo.findById(id);
		return product.get();
	}
	
	@Override
	public List<Product> getProducts() {
		List<Product> products = repo.findAll();
		for(Product each : products) {
			each.setProductIdentifier("product"+each.getId());
		}
		return products;
	}
	
	@Override
	public List<Product> getTop4Products() {
		List<Product> products = repo.getTop4Products();
		for(Product each : products) {
			each.setProductIdentifier("product"+each.getId());
		}
		return products;
	}
	
	
}
