package com.home;

public class applicationClass {

	public static void main(String[] args) {
       
		simpleClass singleton1 = new simpleClass();
		
		simpleClass singleton2 = new simpleClass();
		singleton1.SingleMethod();;
		singleton2.SingleMethod();

	}

}
