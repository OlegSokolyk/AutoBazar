package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_color")
public class CarColor extends BaseEntity{
	
	@Column(name ="color")
	private String color;
	
	@OneToOne(mappedBy = "carColor")
	private CarModel model;

	public CarColor(String color) {
		this.color = color;
	}

	public CarColor() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
