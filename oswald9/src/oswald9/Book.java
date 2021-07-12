//Leah Oswald SPC ID# 2420610
//Data class.

package oswald9;

//Public class.
public class Book {
	//Private fields.
	private String title;
	private String isbn;
	private String arthor;
	private double price;
	private int pages;
	//Static variable to use with all classes.
	public static int numBooks = 0;
	//Constructor that is parameterized.
	public Book(String title, String isbn, String arthor, double price, int pages) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.arthor = arthor;
		this.price = price;
		this.pages = pages;
		
		//Increments.
		numBooks++;
	}
	//Constructor with no arguments.
	public Book() {
		super();
		//Increments.
		numBooks++;
	}
	
	
	//Getters and Setters for all data members.
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getArthor() {
		return arthor;
	}

	public void setArthor(String arthor) {
		this.arthor = arthor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	//toString method that returns the state of all data members of Book instance.
	@Override
	public String toString() {
		return "Book title= " + title + ", isbn= " + isbn + ", arthor= " + arthor + ", price= " + price + ", pages= "
				+ pages;
	}
	
	
	
	

}
