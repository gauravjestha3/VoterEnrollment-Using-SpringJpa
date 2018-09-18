package com.example.voter.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voter.entity.State;
import com.example.voter.entity.Voter;

import antlr.collections.List;

/**
 * @author gaurav
 *
 */
public interface VoterRepository extends JpaRepository<Voter,Long>{

	public Voter findByVoterId(Long id);

}
