//Leah Oswald SPC ID# 2420610
//Program that creates a list of books.
//Program will subtract a discount if books isbn starts with 973.
//Displays the information, how many, and total cost of all the books.

package oswald9;

import java.util.ArrayList;
//Public Class.
public class BookTest {
	//Public static void method that take a Book object and a double as its parameters.
	public static void reduceBooks(Book book, double d) {
		//Gets the price of book object and subtracts discount. 
		//Sets new price.
		book.setPrice(book.getPrice() - d);
	}
	
	public static void main(String[] args) {
		//Variable to hold total cost of books.
		double total = 0;
		//Create ArrayList.
		ArrayList <Book> bookList = new ArrayList<>();
		//Create new element in ArrayList bookList and assign data values.
		Book firstBook = new Book("Starting out with Python", "973-0134484692", "Tony Gaddis", 100.99, 963);
		//Add to next index of list.
		bookList.add(firstBook);
		Book secondBook = new Book("C++ Programming", "973-1337117562", "D S Malik", 89.65, 901);
		bookList.add(secondBook);
		Book thirdBook = new Book("Computer Networking", "973-0133594140", "James Kurose", 109.99, 830);
		bookList.add(thirdBook);
		Book fourthBook = new Book("A guilde to SQL", "973-1111527273", "Philip J Pratt", 47.49, 467);
		bookList.add(fourthBook);
		Book textBook = new Book();
		//Use Book class setter method to add values to Book's data method.
		textBook.setTitle("Introduction to JAVA");
		textBook.setIsbn("978-0136520238");
		textBook.setArthor("Y. Daniel Liang");
		textBook.setPrice(24.99);
		textBook.setPages(1218);
		//Add element into the list at index 2.
		bookList.add(2, textBook);
		
		//Foreach that processes the arraylist.
		for(Book i : bookList) {
			//Get the isbn and find if it has an isbn that starts with 973.
			if(i.getIsbn().startsWith("973")){
				//Call reduceBooks method and pass the element and 5.00 as arguments.
				reduceBooks(i, 5.00);
			}			
		}

		
		System.out.println("Some good books...");
		//Foreach loop to display all the books in the list.
		for(Book i : bookList) {
			System.out.println(i);
			//Accumulator to get the price and add the price of the books up.
			total += i.getPrice();
		}
		//Display the number of books on the shelf.
		System.out.println("There are " + Book.numBooks + " books on the shelf");
		//Display the total purchase price fo all the books.
		System.out.println("Total purchase price, all books is $" + total);
	}
}
