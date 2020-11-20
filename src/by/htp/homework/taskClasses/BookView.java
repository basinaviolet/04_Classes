package by.htp.homework.taskClasses;

import java.util.List;

public class BookView {

	public void print(List<Book> obj, String str) {
		System.out.println(str);
		for (Book s : obj) {
			System.out.println(s);
		}
	}
}
