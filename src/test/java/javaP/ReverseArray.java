package javaP;

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[] = new int [] {5,9,7,0,1};
		System.out.println("Original array");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i] );
			
		}
		System.out.println("Reverse array");
		for (int j=array.length-1; j>=0;j--) {
			System.out.println(array[j]);
		}
	}

}
