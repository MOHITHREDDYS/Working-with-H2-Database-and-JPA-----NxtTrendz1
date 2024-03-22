/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.nxttrendz1.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private int productId;
    @Column(name = "productname")
    private String productName;
    @Column(name = "price")
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getPrice() {
        return this.price;
    }
}