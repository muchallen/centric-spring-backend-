package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.util.UUID;

@Entity
@Table(name = "products")
//@Data
public class Product {
    @Id
    @GeneratedValue
    private  Long id;

    private  String productNamel;
    private  String productDescription;
    private  String productCategory;
    private  String productImage;
    private  String productModelNumber;
    private String productSerialNumber;
    private  Double productPrice;

    public Product() {
    }

    public Product(Long id, String productNamel, String productDescription, String productCategory, String image,String productModelNumber,String productSerialNumber, Double productPrice) {
        this.id = id;
        this.productNamel = productNamel;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productImage = image;
        this.productPrice = productPrice;
        this.productModelNumber=productModelNumber;
        this.productSerialNumber= productSerialNumber;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productNamel;
    }

    public void setProductName(String productName) {
        this.productNamel = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getImage() {
        return productImage;
    }

    public void setImage(String image) {
        productImage = image;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductModelNumber() {
        return productModelNumber;
    }

    public void setProductModelNumber(String productModelNumber) {
        this.productModelNumber = productModelNumber;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
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
