package com.vts_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vts_demo.entity.Product;
import com.vts_demo.service.VtsService;

@Controller
@RequestMapping("/vts")
public class VtsDemoController {
	
	@Autowired
	private VtsService service;
	
	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("top4Products",service.getTop4Products());
		return "html/index";
	}
	
	@GetMapping("/contact")
	public String getContact() {
		return "html/contact";
	}
	
	@GetMapping("/about")
	public String getAbout() {
		return "html/about";
	}
	
	@GetMapping("/product")
	public String getProduct(Model model) {
		model.addAttribute("products",service.getProducts());
		return "html/product";
	}
	
	@GetMapping("/productDetails")
	public ResponseEntity<List<Product>> getProduct() {
		return new ResponseEntity<List<Product>>(service.getProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/productDetail")
	public String getProductDetail(@RequestParam("index") Integer index , Model model) {
		model.addAttribute("product",service.getProduct(index));
		return "html/productDetail";
	}
	
}
