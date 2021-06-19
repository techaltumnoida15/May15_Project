package javaP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassA14 {

	public void method1() {
		String[] arr1 = {"Amit", "Ajay", "Kapil", "Kundan", "Sahil", "Sahil"};
		
		//extract name start with "A", remove duplicates
		
		List<String> myList = Arrays.asList("Amit", "Ajay", "Kapil", "Kundan", "Sahil", "Sahil");
		
		myList.stream()
			.distinct()
			.filter(x -> x.startsWith("A"))
			.collect(Collectors.toList())
			.forEach(y -> System.out.println(y));
	}
	
	
	public static void main(String[] args) {
		ClassA14 obj = new ClassA14();
		obj.method1();
	}

}
