package com.templatemethod;

public abstract class DataProcessor {
	
	public void readProcessandSave() {
		readData();
		processData();
		saveData();
	}
	
	public  abstract void readData();
	public  abstract void processData();
	
	public void saveData()
	{
		System.out.println("Save data to DB");
	}

}
