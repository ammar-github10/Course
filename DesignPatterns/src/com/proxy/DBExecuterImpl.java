package com.proxy;

public class DBExecuterImpl implements DBExecuter {

	@Override
	public void executeDB(String query) throws Exception {
		System.out.println("Going to execute query: "+query);

	}

}
