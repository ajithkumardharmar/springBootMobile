package com.example.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@Column(name = "pk_product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;

	@Column(name = "product_name")
	private String productName;

	private String description;

	@Column(name = "standard_price")
	private double standardPrice;

	@Column(name = "list_price")
	private double listPrice;

	private String url;

	@Column(name = "page_link")
	private String pageLink;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
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

	public double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPageLink() {
		return pageLink;
	}

	public void setPageLink(String pageLink) {
		this.pageLink = pageLink;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", standardPrice=" + standardPrice + ", listPrice=" + listPrice + ", url=" + url + ", pageLink="
				+ pageLink + "]";
	}

	public Products(long productId, String productName, String description, double standardPrice, double listPrice,
			String url, String pageLink) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.standardPrice = standardPrice;
		this.listPrice = listPrice;
		this.url = url;
		this.pageLink = pageLink;
	}

	public Products() {
		super();

	}

}
