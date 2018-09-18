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
@Table(name="constituency")
public class Constituency {
	@Id
	private Long constituencyId;
	private String constituencyName;
	@ManyToOne
	private City city;

	public Long getConstituencyId() {
		return constituencyId;
	}

	public void setConstituencyId(Long constituencyId) {
		this.constituencyId = constituencyId;
	}

	public String getConstituencyName() {
		return constituencyName;
	}

	public void setConstituencyName(String constituencyName) {
		this.constituencyName = constituencyName;
	}

}
