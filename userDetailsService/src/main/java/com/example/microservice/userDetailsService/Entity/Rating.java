package com.example.microservice.userDetailsService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Rating")
public class Rating {
    @Id
    @Column
    private String ratingId;
    @Column
    private String userId;
    @Column
    private String hotelId;
    @Column
    private String rating;
    @Column
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
