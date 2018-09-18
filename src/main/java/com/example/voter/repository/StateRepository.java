package com.example.voter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.voter.entity.State;

/**
 * @author gaurav
 *
 */
public interface StateRepository extends JpaRepository<State, Long> {
	
	public State findByStateId(Long stateId);
	
}
