package by.htp.homework.taskClasses;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {

		// Book(int id, String name, String autor, String publisher, String year, int
		// quantityPage, int price, String coverType)
		List<Book> listBook = new ArrayList<Book>();
		
		//id !!!!!
		
		listBook.add(new Book(1234, "Java", "MainAutor", "MAHAON", "2014", 300, 400, "softcover"));
		listBook.add(new Book(2345, "C++", "MainAutor", "Eksmo", "2018", 125, 200, "hardcover"));
		listBook.add(new Book(3456, "Pyton", "SecondAutor", "Bombora", "2015", 129, 50, "softcover"));
		listBook.add(new Book(4567, "MS Office", "SecondAutor", "KAPO", "2013", 234, 150, "hardcover"));
		listBook.add(new Book(5678, "Java", "SecondAutor", "MAHAON", "2020", 333, 500, "hardcover"));
		listBook.add(new Book(6789, "MS Office", "SecondAutor", "Eksmo", "2011", 50, 100, "softcover"));
		listBook.add(new Book(7891, "Java", "MainAutor", "MAHAON", "2010", 432, 5000, "hardcover"));
		listBook.add(new Book(8912, "Java", "MainAutor", "Eksmo", "2009", 89, 250, "softcover"));
		listBook.add(new Book(9123, "Java", "MainAutor", "Eksmo", "2017", 12, 5, "hardcover"));
		listBook.add(new Book(4321, "Java", "SecondAutor", "Bombora", "2020", 345, 0, "softcover"));
		listBook.add(new Book(5432, "Java", "MainAutor", "MAHAON", "2019", 76, 20, "softcover"));
		listBook.add(new Book(6543, "Java", "ThirdAutor", "KAPO", "2018", 84, 550, "hardcover"));
		listBook.add(new Book(7654, "Java", "SecondAutor", "Bombora", "2009", 23, 30, "softcover"));
		listBook.add(new Book(8765, "Java", "MainAutor", "Eksmo", "2005", 400, 500, "softcover"));
		listBook.add(new Book(9876, "Java", "SecondAutor", "MAHAON", "2020", 2, 1, "hardcover"));

		BookLogic request = new BookLogic();
		BookView printList = new BookView();

		String autor = "MainAutor";
		List<Book> requestAutor = new ArrayList<Book>();
		requestAutor = request.requestByAutor(listBook, autor);
		printList.print(requestAutor, "\nRequest by autor:");

		String publisher = "Eksmo";
		List<Book> requestPublisher = new ArrayList<Book>();
		requestPublisher = request.requestByPublisher(listBook, publisher);
		printList.print(requestPublisher, "\nRequest by publisher:");

		String year = "2017";
		List<Book> requestYear = new ArrayList<Book>();
		requestYear = request.requestByYear(listBook, year);
		printList.print(requestYear, "\nRequest by year:");

	}
}
