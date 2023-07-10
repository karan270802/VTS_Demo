package com.vts_demo.service;

import java.util.List;

import com.vts_demo.entity.Product;

public interface VtsService {

	public String getHelloWorldDetails();

	public List<Product> getProducts();

	public Product getProduct(Integer id);

	public List<Product> getTop4Products();
	
}
