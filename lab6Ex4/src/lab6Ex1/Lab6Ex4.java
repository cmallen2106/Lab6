//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 6 - Exercise 4

/*Assume a binary search is performed on the following array of integers:
*{1, 14, 15, 24, 55, 59, 73, 90, 94, 99}
*Trace through each iteration of the algorithm, writing the number that will be the middle
*element and the left and right bounds (indexes), when searching for the number 73.
*/

package lab6Ex1;

public class Lab6Ex4 {

	public static void main(String[] args) {
		
				int[] arr = {1, 14, 15, 24, 55, 59, 73, 90, 94, 99};

	}

}
/* Iteration 1: 
 * Left bound: 1 (index 0)
 * Right bound: 99 (index 9)
 * Midpoint: 55 (index 4)
 */

/* Iteration 2: 
 * Left bound: 59 (index 5)
 * Right bound: 99 (index 9)
 * Midpoint: 90 (index 7)
 */

/* Iteration 3: 
 * Left bound: 59 (index 5)
 * Right bound: 73 (index 6)
 * Midpoint: 59 (index 5)
 */

/* Iteration 4: 
 * Left bound: 73 (index 6)
 * Right bound: 73 (index 6)
 * Midpoint: 73 (index 6)
 */
