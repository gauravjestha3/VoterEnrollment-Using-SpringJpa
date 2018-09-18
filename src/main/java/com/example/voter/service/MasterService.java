package com.example.voter.service;

import java.util.List;

import com.example.voter.model.CityMV;
import com.example.voter.model.ConstituencyMV;
import com.example.voter.model.StateMV;
import com.example.voter.model.WardMV;

/**
 * @author gaurav
 */
public interface MasterService {

	public List<StateMV> getAllStates();

	public List<CityMV> getAllCities(Long stateId);

	public List<ConstituencyMV> getAllConstituencies(Long cityId);

	public List<WardMV> getAllWards(Long constituencyId);

}
