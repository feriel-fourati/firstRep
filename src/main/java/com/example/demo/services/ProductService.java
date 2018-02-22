package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Product;
import com.example.demo.domain.ProductForm;

public interface ProductService {

	List<Product> listAll();

	Product getById(Long id);

	Product saveOrUpdate(Product product);

	void delete(Long id);

	Product saveOrUpdateProductForm(ProductForm productForm);

}
