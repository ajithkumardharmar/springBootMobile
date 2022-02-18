package com.example.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carts_table")
public class Cart {

	@Id
	@Column(name = "cart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name")
	private String productName;

	private String description;

	private double price;

	private String url;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", productId=" + productId + ", productName="
				+ productName + ", description=" + description + ", price=" + price + ", url=" + url + "]";
	}

	public Cart(int cartId, int userId, int productId, String productName, String description, double price,
			String url) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.url = url;
	}

	public Cart(int userId, int productId, String productName, String description, double price, String url) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.url = url;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

}
