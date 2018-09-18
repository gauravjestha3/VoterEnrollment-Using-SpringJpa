package com.example.voter.service;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import javax.mail.internet.InternetAddress;
import static com.google.common.collect.Lists.newArrayList;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.voter.entity.Voter;
import com.example.voter.model.CityMV;
import com.example.voter.model.VoterMV;
import com.example.voter.model.VoterVM;
import com.example.voter.repository.VoterRepository;
import com.example.voter.service.VoterService;

import it.ozimov.springboot.mail.service.EmailService;

/**
 * @author gaurav
 *
 */
@Service
public class VoterServiceImpl implements VoterService {
	@Autowired
	private VoterRepository voterRepository;
	// To map model voter entity with model view
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	public EmailService emailService;
	private static final Logger log = LoggerFactory.getLogger(VoterServiceImpl.class);

	/***
	 * Function to retreive voters
	 */
	@Override
	public List<VoterMV> getAllUsers() {
		log.info("Entered voter service");
		List<Voter> voters = voterRepository.findAll();
		Type listType = new TypeToken<List<VoterMV>>() {}.getType();
		List<VoterMV> voterMVs = modelMapper.map(voters,listType);
		return voterMVs;
	}

	/***
	 * Function to Save Voter
	 */
	public void saveVoter(VoterVM voterVM) {
		log.info("Entered voter service");
		Voter voter = modelMapper.map(voterVM, Voter.class);
		voterRepository.save(voter);
		
			try {
				sendEmail(voter);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

	/***
	 * Function to Edit Voter
	 */
	@Override
	public ResponseEntity<Object> editVoter(VoterVM voterVM, Long id) {
		log.info("Entered Voter Service");
		Voter voterOptional = voterRepository.findByVoterId(id);
		log.info(voterOptional.toString());
		Voter voter = modelMapper.map(voterVM, Voter.class);
		voter.setVoterId(id);
		voterRepository.save(voter);
		return ResponseEntity.noContent().build();
	}

	/***
	 * Function to send email
	 */
	public void sendEmail(Voter voter) throws UnsupportedEncodingException {
		// Generating unique id using UUID
		String uniqueID = UUID.randomUUID().toString();
		log.info("Sending email");
		final Email email = DefaultEmail.builder().from(new InternetAddress("gauravjes3@gmail.com", "Gaurav Jestha"))
				.to(newArrayList(new InternetAddress(voter.getEmail(), voter.getVoterName())))
				.subject("Enrollment Successfull")
				.body("Hello " + voter.getVoterName() + " your unique id is " + uniqueID).encoding("UTF-8").build();
		emailService.send(email);
		log.info("email sent");
	}


}
