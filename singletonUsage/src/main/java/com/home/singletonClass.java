package com.home;

// singleton class lazy loading
public class singletonClass {
	
	private static singletonClass singletonClass = null;
	
	private singletonClass() {
		System.out.println("Called constructor of SingleTon");
	}
	
	public static singletonClass getInstance() {		
		if (singletonClass == null)
			singletonClass= new singletonClass();
		
		return singletonClass;
	}

}
