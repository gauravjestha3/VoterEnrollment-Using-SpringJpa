package com.example.voter.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.voter.entity.City;
import com.example.voter.entity.State;

/**
 * @author gaurav
 *
 */
public interface CityRepository extends JpaRepository<City, Long> {
	
	public City findByCityId(Long cityId);

	public List<City> findByState(State state);
}
