package javaP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassA5 {
	
	//collect
	
	public void method1() {
		//Declare array
		
		//dataType[] arrayName = new dataType[size]
		
		int[] arr1 = {2, 1, 4, 6, 9, 7}; // Types to declare array in java?
		
		//sort this array - Assignment
		
		//get me a new array which should have value > 5
		
		//java 8 to do this
		List<Integer> list1 = Arrays.asList(2, 1, 4, 6, 9, 7);
		
		List<Integer> list2 = list1.stream().filter(x -> (x > 5)).collect(Collectors.toList());
		
		System.out.println(list2);
		
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		/*
		 * Open flipkart
		 * 
		 * Search "Mobile"
		 * 
		 * Select option "Sort by Price"
		 * 
		 * Get price of mobiles, and check if they are sorted by price or not
		 * 
		 */
		
	}
	
	public static void main(String[] args) {
		ClassA5 obj = new ClassA5();
		obj.method1();
	}
}
