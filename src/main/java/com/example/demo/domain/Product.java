package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	private Long _id;
	private String description;
	private BigDecimal price;
	private String imageUrl;

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Product(String description, BigDecimal price, String imageUrl) {
		super();
		this.description = description;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
