//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 6 - Exercise 2

package lab6Ex2;
// Find the time complexity of the following Java method:

public class Lab6Ex2 {
	
		int foo(int N) {
			
			 int result = 0;
			 for (int i=0; i<N; i++)
			 result++;
			 for (int j=0; j<1000000; j++)
			 result+=j;

			 return result;
	}
}
	
	/*
	 * The first loop is size N will be O(N) and the time complexity of the second
	 * loop is of size 1000000 so then the complexity will be only O(N) since it's
	 * only dependent on the first loop since N is greater than 1000000. 
	 * Overall order: O(N) * O(1) = O(N)
	 */