package javaP;

public class ClassA11 extends ClassA12{

	int i;
	String s;
	
	public ClassA11(int i, String s) {
		this.i = i;
		this.s = s;
	
	}
	
	public void show() {
		System.out.println("In Method");
		
		
		
		System.out.println();
		
		System.out.println(i);
		System.out.println(s);
		
		ClassA12.staticMethod();
		//String s2 = ClassA12.;
		
		String s2 = ClassA12.propFile;
		
		
	}
	
	public static void main(String[] args) {
		//1. 
		ClassA11 obj = new ClassA11(10, "Java");
		//obj.me
		
		//2.
		ClassA12 obj1 = new ClassA12();
		
		//ClassA12 obj2 = new ClassA11();
		
		//ClassA11 obj3 = new ClassA12();
	}
}
