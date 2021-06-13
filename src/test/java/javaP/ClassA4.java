package javaP;

import java.util.ArrayList;
import java.util.List;

public class ClassA4 implements Interface2{

	@Override
	public void method1() {
		System.out.println("Java");		
	}

	@Override
	public void method2() {
		System.out.println("C3#");		
	}

	@Override
	public void method3() {
		List<String> l1  = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<>();
		
	}


	public static void main(String[] args) {
		ClassA4 obj = new ClassA4();
		obj.method1();

		Interface2 I2 = new ClassA4();
		I2.method2();
	}

}
