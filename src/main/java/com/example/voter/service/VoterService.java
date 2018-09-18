package com.example.voter.service;
import java.util.List;

import org.springframework.http.ResponseEntity;
import com.example.voter.model.VoterMV;
import com.example.voter.model.VoterVM;

/**
 * @author gaurav
 *
 */
public interface VoterService {

	/**
	 * @return
	 */
	public List<VoterMV> getAllUsers();

	public void saveVoter(VoterVM voterVM);

	public ResponseEntity<Object> editVoter(VoterVM voterVM, Long id);

}
