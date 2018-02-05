package ua.logos.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_make")
public class CarMake extends BaseEntity{
	@Column(name = "make_title")
	private String title;
	
	@Column(name = "manufacture_year")
	private Date manufactureYear;
	
	@ManyToOne
	@JoinColumn(name = "car_model_id")
	private CarModel carModel;
	
	@OneToMany(mappedBy = "carMake")
	private List<Car> cars = new ArrayList<>();

	public CarMake() {
	}

	public CarMake(String title, Date manufactureYear) {
		this.title = title;
		this.manufactureYear = manufactureYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(Date manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


	

}
