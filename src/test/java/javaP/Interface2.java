package javaP;

public interface Interface2 {
	
	int i = 10;
	
	final int j = 9;
	
	public abstract void method1();
	
	public void method2();
	
	public void method3();
	
	default public void method4() {
		System.out.println("I2 - default method");
	}
	
	public static void method5() {
		System.out.println("I2 - Static method");
	}
}
