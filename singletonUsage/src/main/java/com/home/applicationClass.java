package com.home;

public class applicationClass {

	public static void main(String[] args) {
		singletonClass singletonClass1 = null;
		singletonClass singletonClass2 = null;

		/*
		 * simpleClass singleton1 = new simpleClass();
		 * 
		 * simpleClass singleton2 = new simpleClass(); singleton1.SingleMethod();;
		 * singleton2.SingleMethod();
		 */

		 singletonClass1 = singletonClass.getInstance();
		 singletonClass2 = singletonClass.getInstance();

		 
		 System.out.println(singletonClass1 == singletonClass2);
	}

}
