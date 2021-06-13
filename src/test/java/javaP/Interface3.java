package javaP;

@FunctionalInterface
public interface Interface3 {

	int i = 10;
	
	public void method1();
	
	default public void method4() {
		System.out.println("I2 - default method");
	}
	
	public static void method5() {
		System.out.println("I2 - Static method");
	}
	
}


//Assinmnt:
//coa.com
//Handle toggle button