package javaP;


public class ArraySorting {


	public void sortArray()
	{

		int[] array = {5,7,2,6,3,1,9};
		int i, j;
		int temp = 0;

		//Display original array

		for (i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}

		for(i = 0; i<array.length; i++) {
			for(j =i+1; j<array.length; j++) {
				
				if(array[i]>array[j])
				{
					
					temp = array[i];
					array[i]= array[j];
					array[j]= temp;
					
					
				}

			}
			
			for(i=0;i<array.length;i++) {
			System.out.println(array[i]);
			}
		}

}


	public static void main(String[] args) {

		ArraySorting obj = new ArraySorting();

		obj.sortArray();

	}

}
