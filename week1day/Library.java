package week1day;

public class Library {

	public String addBook(String bookTitle)
	{
		System.out.println(bookTitle + " Book added successfully.");
		return bookTitle;
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully.");
		
	}
	
	public static void main(String args[])
	{
		Library lib = new Library();
		lib.addBook("Selenium API");
		lib.issueBook();	
		// TODO Auto-generated method stub

	}

}
