package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_make")
public class CarMake extends BaseEntity{
	@Column(name = "make_title")
	private String title;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car_model_id")
	private CarModel carModel;
	
	@OneToOne(mappedBy = "carMake")
	private Car car;

	public CarMake() {
	}

	public CarMake(String title, int manufactureYear) {
		this.title = title;
		this.manufactureYear = manufactureYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	

}
