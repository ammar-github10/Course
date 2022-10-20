package com.builder;

public class PhoneBuilder {
	
	private String processor;
	private int ram;
	private double screen ;
	private int battery;
	
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public PhoneBuilder setScreen(double screen) {
		this.screen = screen;
		return this;
	}
	
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(processor, ram, screen, battery);
		
	}
	
	

}
