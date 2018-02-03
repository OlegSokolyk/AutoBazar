package ua.logos.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends BaseEntity{
	
	@Column(name = "sell_price")
	private BigDecimal price;
}
