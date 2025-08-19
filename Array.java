/*
 Author: Sourav V S
 Date: 19-08-2025
 Description: Java program to read n numbers using an array and find the largest element in the array.
 */

package package1;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int [] array = new int[n];
	
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
		}
	
		System.out.println("The given array: ");
		for(int num:array) {
			System.out.print(num +"\t");
		}

	}
}
