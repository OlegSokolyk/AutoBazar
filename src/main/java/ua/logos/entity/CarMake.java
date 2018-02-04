package ua.logos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_make")
public class CarMake extends BaseEntity{
	@Column(name = "make_title")
	private String title;
	
	@Column(name = "manufacture_year")
	private Date manufactureYear;

	public CarMake(String title, Date manufactureYear) {
		this.title = title;
		this.manufactureYear = manufactureYear;
	}

	public CarMake() {
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
	
	

}
