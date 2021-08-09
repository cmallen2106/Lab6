//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 6 - Exercise 3

package lab6Ex3;

//Find the time complexity of the following Java method:

public class Lab6Ex3 {

		int bar(int N) {
			 int result = 1;
			 for (int i=1; i<N; i*=2)
			 result+=2;

			 return result;
			}
}

/* The time complexity is O(logN) because as i increases exponentially, the number of loops
 * will decrease. To further explain, the number of loops required for i to be greater than 
 * or equal to N increases logarithmically as N increases because i increases exponentially. 
 */