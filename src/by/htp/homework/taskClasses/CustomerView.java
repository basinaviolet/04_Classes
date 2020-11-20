package by.htp.homework.taskClasses;

import java.util.List;

public class CustomerView {
	public void print(List<Customer> obj, String str) {
		System.out.println(str);
		for (Customer s : obj) {
			System.out.println(s);
		}
	}

}
