package com.vts_demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "Product")
@Data
public class Product {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;	
	@Column(name = "imageFileName")
	String imageFileName;
	@Column(name = "category")
	String category;
	@Column(name = "name")
	String name;
	@Column(name = "details")
	String details;
	@Column(name = "review")
	Double review;
	@Column(name = "rating")
	Double rating;
	@Column(name = "price")
	Double price;
	@Transient
	String productIdentifier;	
}
