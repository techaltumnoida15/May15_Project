package javaP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClassA2 {

	public void mapWithStreamAPI() {
		Map<String, Integer> map1 = new HashMap<>();

		map1.put("A", 21);
		map1.put("B", 22);
		map1.put("C", 23);
		map1.put("D", 3);
		//map1.put("D", 5);
		map1.put("T", 7);
		
		System.out.println("map1 is = " + map1);
		
		Set<Entry<String, Integer>> es1 = map1.entrySet();
		
		/*
		 * for(int i = 0; i<es1.size(); i++) { System.out.println(); }
		 */
		
		/*
		for (Entry<String, Integer> entry : es1) {
			System.out.println("entry = " + entry);
			
			System.out.println("key = " + entry.getKey() + ", " + " value is = " + entry.getValue());
		}
		*/
		
		/*
		
		Consumer<Entry<String, Integer>> c1 = (t) -> {

				if(t.getValue() > 5) {
					System.out.println(t.getKey());
				}
				else {
					System.out.println("Nope");
				}
			};
		
		for (Entry<String, Integer> entry : es1) {
			c1.accept(entry);
		}
		*/
		
		Comparator<Entry<String, Integer>> comp1 = new Comparator<Map.Entry<String,Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int t = o1.getValue().compareTo(o2.getValue());
				//System.out.println("t is = " + t);
				return t;
			}
		};
		
		/*
		es1.stream().forEach((t) -> {
			if(t.getValue() > 5) 
				System.out.println(t.getKey());
			else 
				System.out.println("Nope");
		});
		*/
		
		//for (Entry<String, Integer> entry : es1) {
			System.out.println(es1.stream().filter((t) -> t.getValue() > 5).collect(Collectors.toList()));
		//}
		
	}
	
	public void listWithStreamAPI() {
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("C");
		list1.add("B");
		
		List<String> l2 = list1.stream().filter((e) -> e.startsWith("A")|| e.startsWith("C")).collect(Collectors.toList());
		System.out.println(l2);
		
	}
	
	public void arrayWithStreams() {
		int[] arr1 = {2, 4, 1, 6, 7, 9, 10};
		
		//Find Max num
		IntStream intStream = Arrays.stream(arr1);
		int maxItem = intStream.max().getAsInt();
		//System.out.println("Max item in array = " + intStream.max());
		System.out.println("Max item in array = " + maxItem);
		System.out.println("==================================");
		
		//Sort array
		List<Integer> list1 = Arrays.asList(2, 4, 1, 6, 7, 9, 10);
		//System.out.println(list1.stream().sorted().collect(Collectors.toList()));
		
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		System.out.println("==================================");
		
		Object[] sortedArray = sortedList.toArray();
		
		for(int i = 0; i <sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		//obj.mapWithStreamAPI();
		//obj.listWithStreamAPI();
		
		obj.arrayWithStreams();
	}

}









