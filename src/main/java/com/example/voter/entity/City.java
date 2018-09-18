package com.example.voter.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author gaurav
 *
 */
@Entity
@Table(name="city")
public class City {
	@Id
	private Long cityId;
	private String cityName;
	@ManyToOne
	private State state;

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
