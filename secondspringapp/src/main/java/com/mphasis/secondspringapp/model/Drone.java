package com.mphasis.secondspringapp.model;

public class Drone {
	private String id;
	private double completionTime;
	private String droneType;
	private String droneName;
	
	public Drone() {
		// TODO Auto-generated constructor stub
	}

	public Drone(String id, double completionTime, String droneType, String droneName) {
		super();
		this.id = id;
		this.completionTime = completionTime;
		this.droneType = droneType;
		this.droneName = droneName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(double completionTime) {
		this.completionTime = completionTime;
	}

	public String getDroneType() {
		return droneType;
	}

	public void setDroneType(String droneType) {
		this.droneType = droneType;
	}

	public String getDroneName() {
		return droneName;
	}

	public void setDroneName(String droneName) {
		this.droneName = droneName;
	}

	@Override
	public String toString() {
		return "Drone [id=" + id + ", completionTime=" + completionTime + ", droneType=" + droneType + ", droneName="
				+ droneName + "]";
	}
	
	
	
	
}
