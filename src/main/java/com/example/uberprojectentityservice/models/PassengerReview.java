package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "passenger_review_id")
public class PassengerReview extends Review {

	private String passengerReviewComment;
	
	private Double passengerRating;
}
