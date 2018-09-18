package com.example.voter.model;


import com.example.voter.entity.City;
import com.example.voter.entity.Constituency;
import com.example.voter.entity.State;
import com.example.voter.entity.Ward;

/**
 * @author gaurav
 *
 */
public class VoterVM {
	private String voterName;
	private String fatherName;
	private String email;
	private String phoneNo;
	private java.sql.Date dob;
	private State state;
	private City city;
	private Constituency constituency;
	private Ward ward;

	public String getVoterName() {
		return voterName;
	}

	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}

	public String getFatherName() {
		return fatherName;
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

}
