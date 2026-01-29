package com.mphasis.secondspringapp.service;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.secondspringapp.model.Drone;

public class DroneService {
	
	private List<Drone> drones = new ArrayList<>();

	
	public Drone addDrone(Drone drone) {
		drones.add(drone);
		return drone;
	}

	
	public List<Drone> getAllDrones() {
		return drones;
	}
	
	public Drone findDroneById(String id) {
		for(Drone d : drones) {
			String did=d.getId();
			if(did.equals(id)) {
				return d;
			}
		}
		return null;
	}
	
	public List<Drone> getFastestDrones(List<Drone> drones){
		 List<Drone> fastestDrones = new ArrayList<Drone>();
		// Drone drone=drones.get(0);
		 Double min=Double.MAX_VALUE;
		 for(Drone d :drones) {
			 if(d.getCompletionTime() <= min) {
				 min=d.getCompletionTime();
				 if(fastestDrones.isEmpty()) {
					 fastestDrones.add(d);
				 }
				 else {
					 if(fastestDrones.get(0).getCompletionTime()==min)
					 fastestDrones.add(d);
					 else {
						 fastestDrones.clear();
						 fastestDrones.add(d);
					 }
				 }
			 }
		 }
		 //12,13,12,11
//		 for(Drone d: drones) {
//			 if(d.getCompletionTime()==min) {
//				 fastestDrones.add(d);
//			 }
//		 }
		 return fastestDrones;
	}
	
}
