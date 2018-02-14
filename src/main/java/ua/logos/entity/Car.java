package ua.logos.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends BaseEntity{
	
	@Column(name = "sell_price", columnDefinition = "DECIMAL(9,2)")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "car_seller_id")
	private CarSeller carSeller;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car_make_id")
	private CarMake carMake;

	public Car() {
	}

	public Car(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public CarSeller getCarSeller() {
		return carSeller;
	}

	public void setCarSeller(CarSeller carSeller) {
		this.carSeller = carSeller;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", getId()=" + getId() + "]";
	}
	
	
}
