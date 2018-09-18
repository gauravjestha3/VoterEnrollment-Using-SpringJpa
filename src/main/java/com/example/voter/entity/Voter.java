package com.example.voter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author gaurav
 *
 */
@Entity
@Table(name="voter")
public class Voter {
	@Id
	@GeneratedValue
	private Long voterId;
	@NotNull
	private String voterName;
	@NotNull
	private String fatherName;
	@Column(unique = true, length = 32)
	@NotNull
	private String email;
	@NotNull
	private String phoneNo;
	@NotNull
	private java.sql.Date dob;
	@ManyToOne
	@NotNull
	@JoinColumn(name = "state_id", referencedColumnName = "stateId")
	private State state;
	@ManyToOne
	@NotNull
	@JoinColumn(name = "city_id", referencedColumnName = "cityId")
	private City city;
	@ManyToOne
	@NotNull
	@JoinColumn(name = "constituency_id", referencedColumnName = "constituencyId")
	private Constituency constituency;
	@ManyToOne
	@NotNull
	@JoinColumn(name = "ward_id", referencedColumnName = "wardId")
	private Ward ward;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Constituency getConstituency() {
		return constituency;
	}

	public void setConstituency(Constituency constituency) {
		this.constituency = constituency;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}


	public String getFatherName() {
		return fatherName;
	}

	public Long getVoterId() {
		return voterId;
	}

	public void setVoterId(Long voterId) {
		this.voterId = voterId;
	}

	public String getVoterName() {
		return voterName;
	}

	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

}
