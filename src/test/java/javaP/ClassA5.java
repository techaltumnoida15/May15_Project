package javaP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClassA5 {
	
	//collect
	
	public void method1() {
		//Declare array
		
		//dataType[] arrayName = new dataType[size]
		
		int[] arr1 = {2, 1, 4, 6, 9, 7}; // Types to declare array in java?
		
	
		
		//steps
		//sort this array - Assignment
		
		//get me a new array which should have value > 5
		
		//java 8 to do this
		List<Integer> list1 = Arrays.asList(2, 1, 4, 6, 9, 7);
		
		List<Integer> list2 = list1.stream().filter(x -> (x > 5)).collect(Collectors.toList());
		
		System.out.println(list2);
		
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		IntStream abc = Arrays.stream(arr1);
		IntStream sortedArray = abc.sorted();
		
		System.out.println(sortedArray.max().getAsInt());
		
		boolean b1 = abc.equals(sortedArray);
		System.out.println(b1);
		
		//============================================
		
		//int[] arr2 = new int[4];
		
		int[] arr3 = {6, 2, 4, 8, 11, 22, 33};
		
		IntStream s3 = Arrays.stream(arr3);
		System.out.println(s3.max().getAsInt());
		
		//Code
		
		/*
		 * Open flipkart
		 * 
		 * Search "Mobile"
		 * 
		 * Select option "Sort by Price"
		 * 
		 * Get price of mobiles/items, and check if they are sorted by price or not
		 * 
		 */
		
	}
	
	public static void main(String[] args) {
		ClassA5 obj = new ClassA5();
		obj.method1();
	}
}
