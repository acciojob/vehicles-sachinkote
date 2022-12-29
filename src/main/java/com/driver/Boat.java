package com.driver;

public class Boat implements WaterVehicle {
    
	private String name;
	private int capacity;
	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getVehicleCapacity() {
		// TODO Auto-generated method stub
		return capacity;
	}

	public Boat(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

}
