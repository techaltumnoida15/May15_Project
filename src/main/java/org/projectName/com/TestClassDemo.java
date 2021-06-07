package org.projectName.com;

public class TestClassDemo {

	public int a = 10;
	
	public void method1() {
		System.out.println("Hi");
	}
	
	
	public static void main(String[] args) {
		TestClassDemo obj1 = new TestClassDemo();
		
		int t = obj1.a;
		System.out.println(t);
		
		obj1.method1();
	}
	
}
