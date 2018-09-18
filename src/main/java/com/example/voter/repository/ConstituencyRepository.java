package com.example.voter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.voter.entity.City;
import com.example.voter.entity.Constituency;

/**
 * @author gaurav
 */
public interface ConstituencyRepository extends JpaRepository<Constituency, Long>{
	
	public Constituency findByconstituencyId(Long constituencyId);
	
	public List<Constituency> findByCity(City city);

}
