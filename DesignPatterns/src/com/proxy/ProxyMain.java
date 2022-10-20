package com.proxy;

public class ProxyMain {

	public static void main(String[] args)  throws Exception{
//		DBExecuter nonAdminExecutor=new DBExecutorProxy("NonAdmin", "Admin@123");
//		nonAdminExecutor.executeDB("DELETE");
		
		DBExecuter adminExecutor=new DBExecutorProxy("Admin", "Admin@123");
		adminExecutor.executeDB("DELETE");

	}

}
