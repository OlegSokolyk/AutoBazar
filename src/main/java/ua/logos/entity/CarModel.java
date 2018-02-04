package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="car_model")
public class CarModel extends BaseEntity{

	@Column(name ="model_title")
	private String modelTitle;

	public CarModel(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public CarModel() {
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}
	
	
	
	
}
