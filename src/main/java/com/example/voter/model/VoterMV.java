package com.example.voter.model;


/**
 * @author gaurav
 *
 */
public class VoterMV {
	private Long voterId;
	private String voterName;
	private String fatherName;
	private String email;
	private String phoneNo;
	private java.sql.Date dob;
	private StateMV stateMV;
	private CityMV cityMV;
	private ConstituencyMV constituencyMV;
	private WardMV wardMV;

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

	public StateMV getState() {
		return stateMV;
	}

	public void setState(StateMV stateMV) {
		this.stateMV = stateMV;
	}

	public CityMV getCity() {
		return cityMV;
	}

	public void setCity(CityMV cityMV) {
		this.cityMV = cityMV;
	}

	public ConstituencyMV getConstituency() {
		return constituencyMV;
	}

	public void setConstituency(ConstituencyMV constituencyMV) {
		this.constituencyMV = constituencyMV;
	}

	public WardMV getWard() {
		return wardMV;
	}

	public void setWard(WardMV wardMV) {
		this.wardMV = wardMV;
	}

}
