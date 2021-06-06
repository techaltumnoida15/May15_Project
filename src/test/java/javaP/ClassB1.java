package javaP;

public class ClassB1 extends ClassA7{

	public void method1() {
		super.method1();
		
	}

	//In case of overriding - Always base/child class method will be executed. - CONCEPT - OOP
	
	
	//what if I want to execute parent class method?
	public void methodC1() {
		System.out.println("ClassB1 - methodC1()");
	}

	public void methodC2() {
		System.out.println("ClassB1 - methodC2()");
	}

	public static void main(String[] args) {
		ClassB1 obj = new ClassB1();
		obj.method1();
	}

}
