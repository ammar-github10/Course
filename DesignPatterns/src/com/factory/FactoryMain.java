package com.factory;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		
		OS os=osf.getInstance("Closed");
		os.specs();

	}

}
