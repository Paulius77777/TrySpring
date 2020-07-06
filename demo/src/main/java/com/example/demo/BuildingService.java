package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {
	
	@Autowired
	private RestRepository restRepository;
	
	public List<Building> getAllBuildings(){
		//
		List<Building> buildings = new ArrayList<>();
		restRepository.findAll()
		.forEach(buildings::add);
		return buildings;
		
	}
	
	public void addBuilding(Building building) {
		restRepository.save(building);
	}
	
	public void updateBuilding(Long id,Building building) {
		restRepository.save(building);
	}
	
}