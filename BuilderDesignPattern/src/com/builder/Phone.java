package com.builder;

public class Phone {
	
	private String processor;
	private int ram;
	private double screen ;
	private int battery;
	
	
	public Phone(String processor, int ram, double screen, int battery) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.screen = screen;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [processor=" + processor + ", ram=" + ram + ", screen=" + screen + ", battery=" + battery + "]";
	}
	
	
	
	
	

}
