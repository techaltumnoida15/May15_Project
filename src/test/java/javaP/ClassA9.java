package javaP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClassA9 {

	int i = 3;
	boolean b1 = false;

	public void method1() {
		//System.out.println(++i);
		//System.out.println(i);
		//System.out.println(i++);
		//System.out.println(i);

		int arr[] = {3, 5, 8};

		int t = Arrays.stream(arr).sum();
		System.out.println(t);

		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("B");
		list1.add("C");
		list1.add("T");

		//list1.stream().ma

	}

	public void mirrorImage() {
		String[] arr1 = {"amit", "surbhi", "vijay", "ajay"};

		List<String> l1 = Arrays.asList(arr1);
		System.out.println("l1 is => " + l1);

		//Collections.reverse(l1);
		//System.out.println(l1);

		List<String> l2 = l1.stream()
				.map(x -> new StringBuilder(x).reverse().toString())
				.collect(Collectors.toList());
		
		System.out.println("l2 is => " + l2);
		
		//=================================
		
		
		l1.stream()
				.map(x -> new StringBuilder(x).reverse().toString())
				.collect(Collectors.toList())
				.forEach(y -> {
					if(y.contains("aa")) {
						b1 = true;
					}
				});
		System.out.println(l2);

		//=================================

		List<Integer> l3 = Arrays.asList(123, 456, 789, 124);
		System.out.println(l3);
		Collections.reverse(l3);
		System.out.println(l3);

		List<Integer> l6 = new ArrayList<>();
		l3.stream()
		.map(x -> new StringBuilder(x.toString()).reverse())
		.collect(Collectors.toList())
		.forEach(z -> l6.add(Integer.parseInt(z.toString())));
		
		System.out.println(l6);

	}

	public static void main(String[] args) {
		ClassA9 obj = new ClassA9();
		//obj.method1();
		obj.mirrorImage();
	}
}
