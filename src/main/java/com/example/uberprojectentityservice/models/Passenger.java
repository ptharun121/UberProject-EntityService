package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel{

	private String name;

	private String email;

	private String password;

	private String phoneNumber;
	
	@OneToMany(mappedBy = "passenger")
	private List<Booking> bookings;

	@OneToOne
	private Booking activeBooking;

	@DecimalMin(value = "0.0", message = "Rating must be greater than or equal to 0.0")
	@DecimalMax(value = "5.0", message = "Rating must be less than or equal to 5.0")
	private Double rating;

	@OneToOne
	private ExactLocation lastKnownLocation;

	@OneToOne
	private ExactLocation home;
}
