package by.htp.homework.taskClasses;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public List<Customer> agrByCC(List<Customer> obj, String min, String max) {
		List<Customer> customersAgr = new ArrayList<Customer>();
		String s;

		for (Customer listItem : obj) {
			s = listItem.getNumCreditCard();
			if (s.compareTo(min) > 0 && s.compareTo(max) < 0) {
				customersAgr.add(listItem);
			}
		}
		return customersAgr;

	}

	public void sortByName(List<Customer> obj) {

		Customer base;
		Customer base1;

		int index = 1;
		int ch;

		while (index > 0) {
			index = 0;

			for (ch = 0; ch < obj.size() - 1; ch++) {
				base = obj.get(ch);
				base1 = obj.get(ch + 1);
				if (base.getSurName().compareTo(base1.getSurName()) > 0) {
					index++;
					obj.set(ch, base1);
					obj.set(ch + 1, base);
				} else if (base.getSurName().compareTo(base1.getSurName()) == 0) {
					if (base.getName().compareTo(base1.getName()) > 0) {
						index++;
						obj.set(ch, base1);
						obj.set(ch + 1, base);
					}
				}
			}

		}
	}

}
