package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="car_model")
public class CarModel extends BaseEntity{

	@Column(name ="model_title")
	private String modelTitle;
	
	@OneToOne(mappedBy = "carModel")
	private CarMake make;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id")
	private CarColor carColor;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType fuelType;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "engine_capacity_id")
	private CarEngineCapacity engineCapacity;

	public CarModel() {
	}

	public CarModel(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public CarMake getMake() {
		return make;
	}

	public void setMake(CarMake make) {
		this.make = make;
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

	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", getId()=" + getId() + "]";
	}

}
