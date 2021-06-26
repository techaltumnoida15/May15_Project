package javaP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClassA16 {

	public void method1() {   //java.util
		List<String> myL = Arrays.asList("Amit", "Amit").stream()
				.filter(t -> t.startsWith("A"))
				.distinct()
				.collect(Collectors.toList());

		System.out.println(myL);
		
		

	}

	public static void main(String[] args) {
		/*
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t.startsWith("A")) {
					System.out.println("Contains A");
					return true;
				}
				else {
					System.out.println("Not Contains A");
					return false;	
				}

			}

		};

		p1.test("Amit");
	}
		 */
		ClassA16 obj = new ClassA16();
		obj.method1();

	}
}
