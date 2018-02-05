package ua.logos.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="car_model")
public class CarModel extends BaseEntity{

	@Column(name ="model_title")
	private String modelTitle;
	
	@OneToMany(mappedBy = "carModel")
	private List<CarMake> carMake = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "color_id")
	private CarColor carColor;
	
	@OneToOne
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType fuelType;
	
	@OneToOne
	@JoinColumn(name = "engine_capacity_id")
	private CarEngineCapacity engineCapacity;

	public CarModel() {
	}

	public CarModel(String modelTitle, List<CarMake> carMake, CarColor carColor, CarFuelType fuelType,
			CarEngineCapacity engineCapacity) {
		this.modelTitle = modelTitle;
		this.carMake = carMake;
		this.carColor = carColor;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public List<CarMake> getCarMake() {
		return carMake;
	}

	public void setCarMake(List<CarMake> carMake) {
		this.carMake = carMake;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}

	public CarFuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(CarFuelType fuelType) {
		this.fuelType = fuelType;
	}

	public CarEngineCapacity getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(CarEngineCapacity engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	
	
}
