package ua.logos.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_color")
public class CarColor extends BaseEntity{
	
	@Column(name ="color")
	private String color;
	
	@OneToMany(mappedBy = "carColor")
	private List<CarModel> carModel = new ArrayList<>();

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
