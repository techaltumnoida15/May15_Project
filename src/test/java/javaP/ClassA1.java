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
	
	//Calculate Length of the given string
	
	public void method4() {
		
		String s = "Learning Java";
		
		System.out.println(s);
		
		System.out.println("Length of string: " +s.length());
				
		
		// Find char at index - 4

	}	
	
	//Calculate factorial using for loop -Assignment 
	
		
	public void method5() {
		
             //find the factorial of this number
	        int number = 5;
	        long fact = 1;
	        for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
	        System.out.println("Factorial of "+number+" is: "+fact);
	    }
	   
	//Calculate length of the string
	
	public void method6() {
		
	}
	

	
	public static void main(String[] args) {    //Explain main method in java
		ClassA1 obj = new ClassA1();
		obj.method4();
		
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
