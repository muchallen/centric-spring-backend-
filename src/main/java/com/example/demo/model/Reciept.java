package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


public class Reciept {
    String recieptid;
    int quantity;
    Product product;

    public Reciept() {
    }

    public Reciept(int quantity, Product product) {
        this.recieptid=UUID.randomUUID().toString();

        this.quantity = quantity;
        this.product = product;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getRecieptid() {
        return recieptid;
    }
}
