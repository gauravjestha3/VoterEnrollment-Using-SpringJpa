package com.example.voter.service;
import java.lang.reflect.Type;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.voter.entity.City;
import com.example.voter.entity.Constituency;
import com.example.voter.entity.State;
import com.example.voter.entity.Ward;
import com.example.voter.model.CityMV;
import com.example.voter.model.ConstituencyMV;
import com.example.voter.model.StateMV;
import com.example.voter.model.WardMV;
import com.example.voter.repository.CityRepository;
import com.example.voter.repository.ConstituencyRepository;
import com.example.voter.repository.StateRepository;
import com.example.voter.repository.WardRepository;
import com.example.voter.service.MasterService;

/**
 * @author gaurav
 *
 */
@EnableAutoConfiguration
@Service
public class MasterServiceImpl implements MasterService {
	
	private static final Logger log = LoggerFactory.getLogger(MasterServiceImpl.class);

	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private ConstituencyRepository constituencyRepository;
	@Autowired
	private WardRepository wardRepository;

	@Autowired

	private ModelMapper modelMapper;

	public List<StateMV> getAllStates() {
		log.info("entered service");
		List<State> states = stateRepository.findAll();
		Type listType = new TypeToken<List<StateMV>>() {}.getType();
		List<StateMV> stateMVs=modelMapper.map(states, listType);
		return stateMVs;

	}

	public List<CityMV> getAllCities(Long stateId) {
		log.info("entered service");
		State state = stateRepository.findByStateId(stateId);
		List<City> cities = cityRepository.findByState(state);
		Type listType = new TypeToken<List<CityMV>>() {}.getType();
		List<CityMV> cityMVs = modelMapper.map(cities, listType);
		return cityMVs;
	}

	@Override
	public List<ConstituencyMV> getAllConstituencies(Long cityId) {
		log.info("entered service");
		City city = cityRepository.findByCityId(cityId);
		List<Constituency> constituencies = constituencyRepository.findByCity(city);
		Type listType = new TypeToken<List<CityMV>>() {}.getType();

		List<ConstituencyMV> constituencyMVs = modelMapper.map(constituencies,listType);
		return constituencyMVs;
	}

	@Override
	public List<WardMV> getAllWards(Long constituencyId) {
		log.info("entered service");
		Constituency constituency =constituencyRepository.findByconstituencyId(constituencyId);

		List<Ward> wards = wardRepository.findByConstituency(constituency);
		Type listType = new TypeToken<List<CityMV>>() {}.getType();

		List<WardMV> cityMVs = modelMapper.map(wards, listType);
		return cityMVs;
	}

}
