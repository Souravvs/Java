package project1;

import java.util.Scanner;

public class Evennum {
	public static void main(String []args) {
		System.out.println("Enter the limit: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		System.out.println("Even numbers upto "+limit+":");
		for(int i=2; i<=limit ; i+=2) {
				System.out.print(i+"\t");
		}
		sc.close();
	}
}


	
