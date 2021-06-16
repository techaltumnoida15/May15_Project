package javaP;

public class ClassA12 {
	
	public int t = 10;
	public static String  propFile = "Java";
	
	static String xlPath;
	static String s2 ;
	static String s3 ;
	static String s4 ;
	
	static {
		xlPath = "C:\\xlReader\\abc.xls";
		propFile = "Java";
		s2 = "Java";
		s3 = "Java";
		s4 = "Java";
	}
	
	public static void staticMethod() {
		System.out.println("In STatic method");
		
		propFile = "Java1";
		
		System.out.println(propFile);
	}
	
	public void method1() {
		System.out.println("Hi");
		
		propFile = "Java2";
		
		//ClassA12.xl
		//Assinment : why cant access static
	}
	
	
	  public static void main(String[] args) { ClassA12.staticMethod();
	  
	  new ClassA12().method1();
	  
	  //ClassA12().xl
	  
	  }
	 
	
}


/*
static - keyword

1. If a var/method is static then it can be access without object, with class name
2. it loads in memory before class initilization

var, method, block, class

*/