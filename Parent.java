package com.Session4.Assignment2;

public class Parent {
	private void method1(){
		System.out.println ("Parent's method1()");
		}
		public void method2() {
		System.out.println ("Parent's method2()");
		method1();
		}

}
