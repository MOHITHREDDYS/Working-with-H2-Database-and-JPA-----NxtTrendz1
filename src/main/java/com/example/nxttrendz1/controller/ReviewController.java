/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import com.example.nxttrendz1.model.*;
import com.example.nxttrendz1.service.ReviewJpaService;

@RestController
public class ReviewController {
    @Autowired
    public ReviewJpaService reviewService;

    @GetMapping("/products/reviews")
    public ArrayList<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping("/products/reviews")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/products/reviews/{reviewId}")
    public Review getReview(@PathVariable("reviewId") int reviewId) {
        return reviewService.getReview(reviewId);
    }

    @PutMapping("/products/reviews/{reviewId}")
    public Review updateReview(@PathVariable("reviewId") int reviewId, @RequestBody Review review) {
        return reviewService.updateReview(reviewId, review);
    }

    @DeleteMapping("/products/reviews/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") int reviewId) {
        reviewService.deleteReview(reviewId);
    }

    @GetMapping("/reviews/{reviewId}/product")
    public Product getProductByReviewId(@PathVariable("reviewId") int reviewId) {
        return reviewService.getProductByReviewId(reviewId);
    }
}