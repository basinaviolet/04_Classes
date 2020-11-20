package by.htp.homework.taskClasses;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
	
	public List<Book> requestByAutor (List<Book> baseList, String autor) {
		List<Book> newListAutor = new ArrayList<Book>();
		
		for (Book str : baseList ) {
			if (str.getAutor().compareTo(autor) == 0) {
				newListAutor.add(str);
			}
		}
		return newListAutor;
	}
	
	public List<Book> requestByPublisher (List<Book> baseList, String publisher) {
		List<Book> newListPublisher = new ArrayList<Book>();
		
		for (Book str : baseList ) {
			if (str.getPublisher().compareTo(publisher) == 0) {
				newListPublisher.add(str);
			}
		}
		return newListPublisher;
	}
	
	public List<Book> requestByYear (List<Book> baseList, String year) {
		List<Book> newListYear = new ArrayList<Book>();
		for (Book str : baseList ) {
			if (str.getYear().compareTo(year) > 0) {
				newListYear.add(str);
			}
		}
		return newListYear;
	}

}
