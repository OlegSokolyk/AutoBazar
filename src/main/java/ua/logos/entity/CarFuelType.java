package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "car_fuel_type")
public class CarFuelType extends BaseEntity{
	
	@Column(name = "fuel_type")
	private String fuelType;
	
	@OneToOne(mappedBy = "fuelType")
	private CarModel carModel;

	public CarFuelType() {
	}

	public CarFuelType(String fuelType, CarModel carModel) {
		this.fuelType = fuelType;
		this.carModel = carModel;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	

	
	
}
