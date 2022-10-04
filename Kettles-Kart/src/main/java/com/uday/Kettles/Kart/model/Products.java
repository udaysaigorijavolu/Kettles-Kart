package com.uday.Kettles.Kart.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productname;
	private String productimage;
	private String productdescription;
	private double productprice;
	private int productstock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductimage() {
		return productimage;
	}
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public int getProductstock() {
		return productstock;
	}
	public void setProductstock(int productstock) {
		this.productstock = productstock;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", productname=" + productname + ", productimage=" + productimage
				+ ", productdescription=" + productdescription + ", productprice=" + productprice + ", productstock="
				+ productstock + "]";
	}
	
	
	
	
	
	
}
