package com.example.uberprojectentityservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel {

	@ManyToOne(fetch = FetchType.LAZY)
	private Driver driver;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Passenger passenger;

	@Enumerated(value = EnumType.STRING)
	private BookingStatus bookingStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;
	
	private Long totalDistance;

	@OneToOne(cascade = CascadeType.ALL)
	private ExactLocation startLocation;

	@OneToOne(cascade = CascadeType.ALL)
	private ExactLocation endLocation;
}
