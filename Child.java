package com.Session4.Assignment2;

public class Child extends Parent {
	public void method1() {
		System.out.println ("Child's method1()");
		}
		
		public static void main(String args[]) {
		Parent p = new Child();
		p.method2();

		/* the answer is c coz in methodTwo of Parent Class methodOne is Called 
		so it prints both statements*/
		
}
}
