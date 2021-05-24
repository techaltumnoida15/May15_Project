package javaP;

public class ClassA1 {

	int a = 10;
	int b = 15;
	//String s = "Java";
	
	public void method1() {
		//int c = a + b;
		//System.out.println(c);
		
		//System.out.println(a);
		
		a = 8;
		
		System.out.println(a);
	}
	
	public String method2() {
		String s1 = "Hello";
		
		String s2 = "Java";
		
		String s3 = s1 + s2;
		
		//System.out.println(s3);
		
		return s3;
	}
	
	public String method3(String s1, String s2) {
		String s3 = s1 + s2;
		
		return s3;
	}
	
	public void method4() {
		String s = "Learning Java";
		//Calculate Length
		// Find char at index - 4
		System.out.println(s);
	}
	
	public void method5() {
		int t = 5;
		
		//Calculate factorial
	}
	
	public static void main(String[] args) {    //Explain main method in java
		ClassA1 obj = new ClassA1();
		obj.method1();
		
		/*
		ClassA1 obj1 = new ClassA1();
		String a = obj1.method2();
		System.out.println(a);
		
		ClassA1 obj2 = new ClassA1();
		String b = obj2.method3("Java", "Selenium");
		System.out.println(b);
		*/
	}
}


/*
 * public ? - Access Specifier   ? private, protected, default
 * can a method return some value
 * 
 * 
 */
