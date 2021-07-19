package javaP;

import java.util.*;


/*Using SET 
Approach: 

Take a Set
Insert all array elements in the Set. Set does not allow duplicates and sets like LinkedHashSet maintains the order of insertion so it will remove duplicates and elements will be printed in the same order in which it is inserted.
Print elements of Set.*/

public class RemoveDuplicatesUsingSet {

	
	// Function to remove duplicate from array
	public static void RD (int[] a) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		// adding elements to LinkedHashSet
		
		for (int i = 0; i < a.length; i++)
            set.add(a[i]);
		
		// Print the elements of LinkedHashSet
        System.out.print(set);
	}

     // Driver code
        public static void main(String[] args)
        {
            int a[] = {2,1,1,4,5,5,6,7};
          
            // Function call
            RD(a);
        }
    
	}


