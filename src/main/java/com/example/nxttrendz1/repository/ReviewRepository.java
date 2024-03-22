/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz1.repository;

import java.util.ArrayList;

import com.example.nxttrendz1.model.*;

public interface ReviewRepository {

    ArrayList<Review> getAllReviews();

    Review addReview(Review review);

    Review getReview(int reviewId);

    Review updateReview(int reviewId, Review review);

    void deleteReview(int reviewId);

    Product getProductByReviewId(int reviewId);
}