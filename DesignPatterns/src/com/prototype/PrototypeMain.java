package com.prototype;

import java.util.List;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle a=new Vehicle();
		a.insertData();
		
		Vehicle b=(Vehicle) a.clone();
		List<String> list=b.getVehicleList();
		list.add("Nano");
		
		System.out.println(a.getVehicleList());
		System.out.println(list);
		
		b.getVehicleList().remove("Maruti");
		System.out.println(list);
		System.out.println(a.getVehicleList());

	}

}
