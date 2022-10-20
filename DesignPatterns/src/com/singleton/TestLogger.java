package com.singleton;

public class TestLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();

		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
	}

}
