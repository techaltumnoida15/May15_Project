package javaP;

public class ClassA3 {

	//Cunst
	/*
	 * is a special method which execute automatically as soon as object is created.
	 * 
	 * 1. Its name must be same as class name.
	 * 2. It does not have any return type.
	 */
	
	public ClassA3() {     //Can we have cunst as "private" - YES. But tell me in which conditions? Singelton Pattern
		System.out.println("Noida");
	}

	public void method2() {
		
	
		
	}
	
	public void method1() {
		//Logic
		System.out.println("Java");
		
		int i = 10;
		
		System.out.println(i);
	}
	
	//method2
	
	
	/*
	public static void main(String[] args) {
		//ClassA3 obj = new ClassA3();    //what is the object?
		
		//obj will act as an object but it is is not real object.
		//obj.method1();
		
		//================================
		
		new ClassA3().method1();
	}
	*/
}
