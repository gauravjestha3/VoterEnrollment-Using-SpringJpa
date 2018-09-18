package com.example.voter.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.voter.entity.Constituency;
import com.example.voter.entity.Ward;

/**
 * @author gaurav
 *
 */
public interface WardRepository extends JpaRepository<Ward, Long> {
	
	public List<Ward> findByConstituency(Constituency constituency);
}
