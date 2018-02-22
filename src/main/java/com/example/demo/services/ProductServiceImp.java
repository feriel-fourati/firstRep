package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Product;
import com.example.demo.domain.ProductForm;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductFormToProduct productFormToProduct;

	// Constructor with field
	@Autowired
	public ProductServiceImp(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
		this.productRepository = productRepository;
		this.productFormToProduct = productFormToProduct;
	}

	@Override
	public List<Product> listAll() {

		List<Product> listProducts = new ArrayList<>();
		productRepository.findAll().forEach(listProducts::add);
		return listProducts;
	}

	@Override
	public Product getById(Long id) {

		return productRepository.findOne(id);
	}

	@Override
	public Product saveOrUpdate(Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public void delete(Long id) {
		productRepository.delete(id);

	}

	@Override
	public Product saveOrUpdateProductForm(ProductForm productForm) {
		Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

		System.out.println("Saved Product Id: " + savedProduct.getId());
		return savedProduct;
	}

}
