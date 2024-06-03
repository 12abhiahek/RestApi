package com.example.microservice.userDetailsService.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String feedback;

    public String getRatingId() {
        return ratingId;
    }

    public String getUserId() {
        return userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getRating() {
        return rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

}
