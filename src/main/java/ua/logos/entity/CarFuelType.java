package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_fuel_type")
public class CarFuelType extends BaseEntity{
	
	@Column(name = "fuel_type")
	private String fuelType;
}
