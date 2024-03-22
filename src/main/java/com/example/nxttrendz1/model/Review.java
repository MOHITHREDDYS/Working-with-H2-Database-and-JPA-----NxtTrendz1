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

import com.example.nxttrendz1.model.Product;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewid")
    private int reviewId;
    @Column(name = "reviewcontent")
    private String reviewContent;
    @Column(name = "rating")
    private int rating;
    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;

    public Review() {
    }

    public Review(int id, String content, int rating, Product product) {
        this.reviewId = id;
        this.reviewContent = content;
        this.rating = rating;
        this.product = product;
    }

    public void setReviewId(int id) {
        this.reviewId = id;
    }

    public void setReviewContent(String content) {
        this.reviewContent = content;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getReviewId() {
        return this.reviewId;
    }

    public String getReviewContent() {
        return this.reviewContent;
    }

    public int getRating() {
        return this.rating;
    }

    public Product getProduct() {
        return this.product;
    }
}