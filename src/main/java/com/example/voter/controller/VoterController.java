package com.example.voter.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.voter.model.VoterMV;
import com.example.voter.model.VoterVM;
import com.example.voter.service.VoterService;



/**
 * @author gaurav
 *
 */
@RestController
@RequestMapping("/election")

public class VoterController {
	@Autowired
	private VoterService voterService;

	/***
	 * API to retrieve all voters
	 */
	@GetMapping("/voters")
	public List<VoterMV> getAllUsers() {
		return voterService.getAllUsers();

	}

	/***
	 * API to save voter
	 */
	@PostMapping("/save")
	public void saveVoter(@RequestBody @Valid VoterVM voterVM) {
		voterService.saveVoter(voterVM);
	}

	/***
	 * API to edit Voter
	 */
	@PutMapping("/voter/{id}")
	public ResponseEntity<Object> editVoter(@RequestBody VoterVM voterVM, @PathVariable Long id) {
		return voterService.editVoter(voterVM, id);
	}

}
