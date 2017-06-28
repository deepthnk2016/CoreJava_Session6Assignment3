package com.acadgild;

import java.util.Scanner;

/**
 * 
 * Search for a number in an array using Binary Search
 * ***************************************************** 
 * Binary Search Alorithm:
 * ***************************************************** 
 * i. Sort the contents of array 
 * ii. Loop till element is found 
 *     a. Find the mid of the array 
 *     b. If element is less than the value at mid position then search in the left side of 
 *        the array. So, set the upperbound to mid-1 
 *     c. If element is greater than the value at mid position then search in the right side 
 *        of the array. So, set the lowerbound to mid + 1 
 *     d. If element is found at mid position then note the position and exit. 
 * ******************************************************
 */
public class Session6Assignment3 {

	public static void main(String[] args) {
		// initialize the lowerbound and upperbound for search.
		int lowerBound = 0, upperBound = 9, mid;

		// Set the found value to false.
		boolean found = false;

		// Initialize the array of 10 elements.
		int[] myarray = new int[10];

		// Populate the array in ascending order.
		for (int i = 0; i < 10; i++) {
			myarray[i] = i + 1;
		}
		// Display the contents of the array.
		System.out.println("Contents of array are -");
		for (int i = 0; i < myarray.length; i++) {
			System.out.println(myarray[i]);
		}
		
		// Accept the number to be searched.
		System.out.println("Enter number to be searched - ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		// Loop till element is found
		while (found != true) {
			// Exit searching if upperbound becomes less than lowerbound.
			if (upperBound < lowerBound) {
				System.out.println(x + " is not found in the array");
				break;
			}
			
			// Calculate the mid of the array.
			mid = lowerBound + (upperBound - lowerBound) / 2;

			// If value at mid is less than the element to be search then
			// search the element in the right side of array
			if (myarray[mid] < x) {
				lowerBound = mid + 1;
			}

			// If value at mid is greater than the element to be search then
			// search the element in the left side of array
			if (myarray[mid] > x) {
				upperBound = mid - 1;
			}

			// If element is found then note the position.
			if (myarray[mid] == x) {
				System.out.println(x + " is found at position - " + mid);
				found = true;
			}

		}

		s.close();

	}

}
