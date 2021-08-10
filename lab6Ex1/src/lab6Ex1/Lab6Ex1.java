//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 6 - Exercise 1

// Write the simplest Java method that would have 𝑂(𝑁^3) time complexity, where 𝑁 is the single
//input parameter to the method.



package lab6Ex1;
import java.util.Scanner; 

import java.util.Scanner;

public class Lab6Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter a value for n: ");
		int n = scan.nextInt(); 
		complexity(n); 
		
		scan.close();

	}
	public static void complexity (int n) {
		//Creating the triple nested loops to create O(n^3)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					
					//prints out O(n^3)
					System.out.println(" O(n^3) = " + k); 
				}
			}
		}
	}

}
