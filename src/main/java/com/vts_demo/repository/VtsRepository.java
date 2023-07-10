package com.vts_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vts_demo.entity.Product;

@Repository
public interface VtsRepository extends JpaRepository<Product, Integer>{
	
	@Query(value = "SELECT * FROM Product e ORDER BY e.id asc LIMIT 4", nativeQuery=true)
	public List<Product> getTop4Products();
}
