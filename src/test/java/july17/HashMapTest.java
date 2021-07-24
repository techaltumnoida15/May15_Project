package july17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapTest {

	@Test
	public void testHashMap() {
		//Declare Map
		Map<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("Amit", 12345);
		map1.put("Ajay", 65656);
		map1.put("Sam", 9898);
		map1.put("Nitin", 43434);
		map1.put("Rajat", 978232);
		map1.put("Mina", 658787);
		//map1.put("Mina", 545454554);
		map1.put(null, 545454554);  //Can store 1 null key
		map1.put(null, 5111111);
		
		map1.put("A", null);
		map1.put("B", null);
		map1.put("C", null);
		
		//About Duplicate Keys
/*
		System.out.println(map1);

		Set<String> keys = map1.keySet();
		System.out.println(keys);

		System.out.println(map1.containsKey("Sachin"));

		Collection<Integer> collection1 = map1.values();
		collection1.forEach(x -> System.out.println("Value = " + x));
		
		System.out.println(map1.containsValue(99999));
		*/
		
		Set<Entry<String, Integer>> entrySet1 = map1.entrySet();
		
		entrySet1.stream().forEach((k) -> {
			System.out.println(k);
		});

	}
}
