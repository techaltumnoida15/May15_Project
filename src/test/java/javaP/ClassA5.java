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
		
		//int[] arr1 = {2, 4, 1, 6, 7, 9, 10};
		
		IntStream streamArray = Arrays.stream(arr1);
		
		streamArray.max();
		
		//Find Max num
		//IntStream intStream = Arrays.stream(arr1);
		//int maxItem = intStream.max().getAsInt();
		//System.out.println("Max item in array = " + intStream.max());
		//System.out.println("Max item in array = " + maxItem);
		
		//IntStream intStream = Arrays.stream(arr1);
		
		//IntStream.
		
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
