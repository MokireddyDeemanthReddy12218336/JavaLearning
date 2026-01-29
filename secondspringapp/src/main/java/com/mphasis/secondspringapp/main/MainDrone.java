package com.mphasis.secondspringapp.main;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.secondspringapp.model.Drone;
import com.mphasis.secondspringapp.service.DroneService;

public class MainDrone {
	
	public static void main(String[] args) {
		Drone d1=new Drone("1",12.3,"d1","fastest");
		Drone d2=new Drone("2",34.3,"d1","fastest");
		Drone d3=new Drone("3",12.3,"d1","fastest");
		Drone d4=new Drone("4",16.3,"d1","fastest");
		Drone d5=new Drone("5",10.3,"d1","fastest");
		
		List<Drone> drones = new ArrayList<Drone>();
		drones.add(d1);
		drones.add(d2);
		drones.add(d3);
		drones.add(d4);
		drones.add(d5);
		
		DroneService droneService = new DroneService();
		List<Drone> fastestDrones= droneService.getFastestDrones(drones);
		for(Drone d : fastestDrones) {
			System.out.println(d);
		}
		//System.out.println("Hello World");
	}
	
}
