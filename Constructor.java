/*
 * Author: Sourav V S
 * Date: 18-07-25
 * Description: Java program to create a class named Book and print all the details.
 */

package project1;

class Book{
	String title;
	String author;
	double price;
	
	Book(){
		title = "Unknown";
		author = "Not assigned";
		price = 0.0;
	}
	
	public void displayDetails() {
		System.out.println("Title:\t" + title);
		System.out.println("Author:\t" + author);
		System.out.println("Price:\t" + price);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Book book= new Book();
		book.displayDetails();
	}

}
