package com.proxy;

public class DBExecutorProxy implements DBExecuter {

	boolean ifAdmin;
	DBExecuterImpl dbExecuter;

	public DBExecutorProxy(String name, String pass) {
		if (name == "Admin" && pass == "Admin@123") {
			ifAdmin = true;
			dbExecuter = new DBExecuterImpl();

		}
	}

	@Override
	public void executeDB(String query) throws Exception {
		if (ifAdmin) {
			dbExecuter.executeDB(query);
		} else {
			if (query.equals("DELETE")) {
				throw new Exception("DELETE not allowed for non-admin users");
			} else {
				dbExecuter.executeDB(query);

			}
		}

	}

}
