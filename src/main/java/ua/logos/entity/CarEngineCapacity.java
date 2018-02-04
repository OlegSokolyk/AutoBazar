package ua.logos.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "car_engine_capacity")
public class CarEngineCapacity extends BaseEntity{
	
	@Column(name = "capacity")
	private BigDecimal capacity;
	
	public CarEngineCapacity() {
	}

	public CarEngineCapacity(BigDecimal capacity) {
		this.capacity = capacity;
	}

	public BigDecimal getCapacity() {
		return capacity;
	}

	public void setCapacity(BigDecimal capacity) {
		this.capacity = capacity;
	}
	
	
	
}
