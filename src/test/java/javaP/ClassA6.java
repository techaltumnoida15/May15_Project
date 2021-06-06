package javaP;

public class ClassA6 {
	
	public ClassA6() {
		System.out.println("PHP");
	}
	
	public ClassA6(String s) {
		System.out.println(s);
	}

	//method overriding
	public void method() {
		System.out.println("Java");
	}
	
	public void method(String s) {
		System.out.println("C#");
	}
	
	public void method3() {
		
	}
	
	public void getCust(int id) {
		System.out.println(id);
	}
	
	public void getCust(String name) {
		
	}
	
	public void getCust(String name, int id) {
		
	}
	
	/*
	 * If there are more then 1 method in a class WITH SAME NAME then this situtation is called as "Method Overloading"
	 * It happens in same class
	 */
	
	public static void main(int[] args) {
		ClassA6 obj = new ClassA6("Hi");
		obj.getCust(123);
	}
	
	public static void main(String[] args) {
		ClassA6 obj = new ClassA6("Hi");
		obj.getCust(123);
	}
	
	//Can we overload main maethod
	//Y - HOW ?
	//N - WHY we can not
}
