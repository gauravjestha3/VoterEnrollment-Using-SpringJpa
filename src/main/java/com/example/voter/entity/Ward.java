package com.example.voter.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author gaurav
 *
 */
@Entity
@Table(name="ward")
public class Ward {
	@Id
	private Long wardId;
	private String wardName;
	@ManyToOne
	private Constituency constituency;

	public Long getWardId() {
		return wardId;
	}

	public void setWardId(Long wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

}
