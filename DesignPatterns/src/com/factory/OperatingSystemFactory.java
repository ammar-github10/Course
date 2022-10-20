package com.factory;

public class OperatingSystemFactory {
	public OS getInstance(String str)
	{
			if(str.equals("Open"))
				return new Android();
			else if(str.equals("Closed"))
				return new IOS();
			else if(str.equals("Used"))
				return new Windows();
			else 
				return null;
		
	}

}
