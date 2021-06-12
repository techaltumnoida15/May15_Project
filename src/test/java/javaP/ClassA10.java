package javaP;

import org.testng.annotations.Test;

public class ClassA10 {
	
	int i = 10;
	
	//@Test
	public void method1() {
		try {
			int t = i/0;   //=> infinite
			System.out.println(t);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Can not divide by 0");
		}
		
		//Code
		
	}

	public void method2() throws Exception {
		int[] arr = {2, 4, 6, 9};
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == 8) {
				throw new Exception("8 is caught.");
			}
			else {
				System.out.println("NNo no. 8 found");
			}
		}
	}
	
	public void method3() {
		String[] arr1 = {"abc", "pqr", "lmn"};
		
		System.out.println(arr1[1]);
		
		//1.
		try {
			System.out.println(arr1[3]);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			//e.printStackTrace();
			System.out.println("this is e1");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("invalid index used in array.");
		}
		
		//2.
		try {
			int i = 10/0;
		}
		finally {
			System.out.println("I am in finally");
		}
	}
	
	public static void main(String[] args) {
		ClassA10 obj = new ClassA10();
		/*
		 * try { obj.method2(); } catch (Exception e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
		
		obj.method3();
	}

}


/*
 * try{
 * 
 * }
 * catch(Exception e){}
 * Catc(Exception e1)
 * 
 * */


