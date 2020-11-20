package by.htp.homework.taskClasses;

import java.util.List;

public class AirLineView {
	public void print(List<AirLine> obj, String str) {
		System.out.println(str);
		for (AirLine s : obj) {
			System.out.println(s);
		}
	}
}
