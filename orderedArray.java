/*Task 02 Write a program the orderedArray.java in which you have to insert() and delete() elements,
 as well as find(), use a binary search. Test your class in main method.
*/

import java.util.Arrays; 

public class orderedArray {
	
	static int[] insert(int[] array, int value_to_insert, int at_index) {
		if (at_index > array.length || at_index < 0)	//If index is greater than length or If index is negative then raise exception
			throw new ArrayIndexOutOfBoundsException("Index is out of bound");

		int[] array_to_replace = new int[array.length+1];	//Creating new array with one more element than original
		int index = 0;

		while (true) {
			if (index == at_index) {	//If the index where to insert is found 
				array_to_replace[index] = value_to_insert;     //Now inserting so now index would be +1 more than that of original
				index = index + 1;
				break;
			}
			array_to_replace[index] = array[index];		//Simply copying 
			index = index + 1;
		}

		while (true) {		//Now as element is inserted so need to insert remaining elements
			if (index == array_to_replace.length-1) {		//If the index is now of last element
				array_to_replace[index] = array[index - 1];		//As value is inserted so index would be +1 more than that of original
				break;
			}
			
			if (index > array.length)		//If index is greater than length of original array,it happens when value_to_insert is at end and 
				break;

			array_to_replace[index] = array[index - 1];		//As value is inserted so index would be +1 more than that of original
			index = index + 1;
		}
	
		return array_to_replace;
 	}

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
        //Will return index if found otherwise would return -1 i.e not found
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
		//-------------inserting

		// int[] x = {1};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 2, 0);
	 // 	System.out.println(Arrays.toString(x));
 	 
		// int[] x = {1};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 2, 1);
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 4, 1);
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 4, 2);
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 4, 3);
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 4, 0);
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 4, 4);   //Will raise exception
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3};
		// System.out.println(Arrays.toString(x));		
		// x = insert(x, 4, -1);	//Will raise exception
	 // 	System.out.println(Arrays.toString(x));

		// //----------------deleting
		// int[] x = {1};
		// System.out.println(Arrays.toString(x));		
		// x = delete(x, 1);    //If array is of one length
	 // 	System.out.println(Arrays.toString(x));
	
		// int[] x = {1};
		// System.out.println(Arrays.toString(x));		
		// x = delete(x, 3);    //It will throw an exception if you give it an element to delete which is not present in array
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3, 4};
		// System.out.println(Arrays.toString(x));		
		// x = delete(x, 1);    
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3, 4};
		// System.out.println(Arrays.toString(x));		
		// x = delete(x, 3);    
	 // 	System.out.println(Arrays.toString(x));

		// int[] x = {1, 2, 3, 4};
		// System.out.println(Arrays.toString(x));		
		// x = delete(x, 4);    
	 // 	System.out.println(Arrays.toString(x));

		//---------Finding through binary search
		int[] x = {50, 4, 5, 100};
		Arrays.sort(x);   //Its prereque for array to be sorted before using binary search
		System.out.println(Arrays.toString(x));
		System.out.println(find(x, 5));		

	}

}