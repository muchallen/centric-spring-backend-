package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue
    private  int id;

    private int quantity;
    private  String productName;
    private  String productCategory;
    private String productSerialNumber;
    private  Double productPrice;

    public Sale() {
    }

    public Sale(int id, int quantity, String productName, String productCategory, String productSerialNumber, Double productPrice) {
        this.id = id;
        this.quantity = quantity;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productSerialNumber = productSerialNumber;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
    /*public Product(
           @JsonProperty("id") UUID id,
           @JsonProperty("productName") String productName,
           @JsonProperty("productDescription") String productDescription,
            @JsonProperty("productCategory") String productCategory,
            @JsonProperty("image") String image,
          @JsonProperty("productPrice") Double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        Image = image;
        this.productPrice = productPrice;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }


    public String getProductCategory() {
        return productCategory;
    }

    public String getImage() {
        return Image;
    }

    public Double getProductPrice() {
        return productPrice;
    }*/
}
