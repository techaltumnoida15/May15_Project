package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {
	
	public void listTest() {
		int[] arr1 = {2, 3, 4, 5};
		//int[] arr2 = new int[4];
		System.out.println(arr1[1]);
		
		System.out.println("------");
		//Declare list
		//ArrayList<String> l1 = new ArrayList<>();
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("B");
		myList.add("C");
		myList.add("T");
		myList.add("X");
		
		System.out.println(myList);
		
		int listSize = myList.size();

		System.out.println(listSize);
		
		myList.remove(1);
		
		System.out.println(myList.get(3));
		
		System.out.println(myList.size());
		System.out.println(myList);
		
		myList.set(2, "PP");
		
		System.out.println(myList);
		
		
	}
	
	public void setTest() {
		//Declare Set
		Set<String> mySet = new HashSet<>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("B");
		mySet.add("C");
		mySet.add("T");
		mySet.add("X");
		
		System.out.println(mySet);
		
		System.out.println(mySet.size());
		
		//mySet.get
		//mySet.set
		
		
	}
	
	public static void main(String[] args) {
		CollectionTest obj = new CollectionTest();
		obj.setTest();
	}

}
