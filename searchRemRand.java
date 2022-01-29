/*Task 01: Write a Java method that search and removes a random entry from an array until user end the program. 
*/

import java.util.Arrays;	//Importing necessary libraries
import java.util.concurrent.ThreadLocalRandom;

public class searchRemRand {

	static int[] delete(int[] array, int val_to_delete) {
		if (array.length == 0)		//If array is empty
			throw new ArrayIndexOutOfBoundsException("Array is empty");

		int[] array_to_replace = new int[array.length-1];	//Creating new array with one less element as one would be deleted
		int index = 0;

		while (true) {
			if (array[index] == val_to_delete) {	//If value is found which is supposed to be deleted
				index = index + 1;					//Simply not copying that element so now index would be -1 less than that of original array
				break;
			}

			array_to_replace[index] = array[index];		//Simply copying elements
			index = index + 1;
		}

		while (true) {
			if (index == array.length-1) {		//If value to be copied is now last element
				array_to_replace[index-1] = array[index];		//As index would be -1 less than that of original array
				break;
			}
			
			if (index > array_to_replace.length)		//If the value that was deleted was at the end 
				break;

			array_to_replace[index-1] = array[index];		//As index would be -1 less than that of original array
			index = index + 1;
		}
	
		return array_to_replace; 		
 	}


	static int find(int[] array, int value_to_find) { 
        //Will return index if found otherwise would return -1 i.e not found using Binary Search
        int left = 0; 
        int right = array.length - 1; 

        while (left <= right) { 
            int mid = left + (right - left) / 2; 
  
            // If value_to_find is present at mid 
            if (array[mid] == value_to_find) 
                return mid; 
  
            // If value_to_find is greater than mid then ignore left half 
            if (array[mid] < value_to_find) 
                left = mid + 1; 
  
            // If value_to_find is smaller than mid ignore right half 
            else
                right = mid - 1; 
        } 
  
        // If we reach here, then element was not present in array
        return -1; 
    } 


	public static void main(String[] args) {
		System.out.println("Sorted Array is");
		int[] array = {10, 100, 80, 76, 50};		//Initializing Array	
		Arrays.sort(array);		//Sorting Array so later element could be searched using binary search
		System.out.println(Arrays.toString(array));
	
		while (array.length > 0) {

			System.out.println("Do you want to search a random element element and delete it(Type Yes or No)");
			String user_input = System.console().readLine();	//User input

			if ( user_input.equals("Yes") || user_input.equals("yes") ) {
				int random_index = ThreadLocalRandom.current().nextInt(array.length);  //ThreadLocalRandom.current().nextInt(max+1)  range is between 0 and max

				array = delete(array, array[random_index]);
			
				System.out.println("Sorted Array Now is");
				Arrays.sort(array);
				System.out.println(Arrays.toString(array) + "\n");
			}

			else
				break;
		}

	}

}