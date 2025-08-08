/*
 * Author: Sourav V S
 * Date: 08-08-25
 * Description: Java program to create a class named Book and also create extended class, then print all the details for each classes.
 */

class Book{
	String title;
	String author;
	double price;

	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}

class EBook extends Book{
	Double fileSize;
	
	EBook(String title, String author, double price, double fileSize){
		super(title, author, price);
		this.fileSize = fileSize;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("File Size: " + fileSize + "MB");
	}
}

class PrintedBook extends Book{
	int numberOfPages;
	
	PrintedBook(String title, String author, double price, int numberOfPages){
		super(title, author, price);
		this.numberOfPages = numberOfPages;
	}
	
	public void displayDetails() {
		System.out.println("\n");
		super.displayDetails();
		System.out.println("Pages: " + numberOfPages);
	}
	
}

public class Extended_Class {
	public static void main(String[] args) {
		Book book = new Book("Crime and Punishment", "Fyodor Dostoevsky", 269.00);
		
		EBook ebook = new EBook("Crime and Punishment", "Fyodor Dostoevsky", 269.00, 2.39);
		ebook.displayDetails();
		
		PrintedBook printedbook = new PrintedBook("Crime and Punishment", "Fyodor Dostoevsky", 269.00, 488);
		printedbook.displayDetails();
	}
}
