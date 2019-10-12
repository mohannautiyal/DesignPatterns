package com.home;

public class applicationClass {

	public static void main(String[] args) {
       
		SingletonClass singleton1 = new SingletonClass();
		
		SingletonClass singleton2 = new SingletonClass();
		singleton1.SingletonMethod();
		singleton2.SingletonMethod();

	}

}
