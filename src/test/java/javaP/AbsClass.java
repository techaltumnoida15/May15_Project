package javaP;

public abstract class AbsClass {
	
	final int i1 = 10;
	static int j = 11;
	static int i = 0;

	public AbsClass() {
		System.out.println("In cunst");
	}
	
	protected void method1() {
		System.out.println("method1");
	}
	
	public abstract void method2();
	
	public abstract void method3();
	
	public void method4() {   
		System.out.println("abs class method 4");
	}
	
	private static void main(String[] args) {
		//AbsClass obj = new AbsClass();
	}
}


class ClassA14 extends AbsClass{
	
	public ClassA14() {
		super();
	}

	@Override
	public void method2() {    //belongs to AbsClass but implemented here in child class
		System.out.println("method 2");
	}

	@Override
	public void method3() {
		System.out.println("Method3");
	}
	
	@Override
	public void method4() {   //belons to ClassA14
		super.method4();
	}
	
	public static void main(String[] args) {
		ClassA14 obj = new ClassA14();
		
		obj.method4();
	}

}

