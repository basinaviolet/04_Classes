package by.htp.homework.taskClasses;

import java.util.ArrayList;
import java.util.List;


public class CustomerMain {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();

		
		//(int id, String name, String surName, String middleName, String numCreditCard, String numBankAcc)
		customerList.add(new Customer(11111, "Oscar", "No1", "Wilde", "1111 1111 1111 1111","IBAN 111111"));
		customerList.add(new Customer(123456, "Bram", "No", "Stoker", "2222 2222 2222 2222","IBAN 111111"));
		customerList.add(new Customer(234567, "Mark", "No", "Twain", "3333 3333 3333 3333","IBAN 111111"));
		customerList.add(new Customer(345678, "Richard", "No", "Curtis", "4444 4444 4444 4444","IBAN 111111"));
		customerList.add(new Customer(345678, "Archi", "No", "Curtis", "4444 4444 4444 2222","IBAN 111111"));
		customerList.add(new Customer(456789, "Agatha", "No", "Christie", "5555 5555 5555 5555","IBAN 111111"));
		customerList.add(new Customer(654321, "Jerome", "K", "Jerome", "6666 6666 6666 6666","IBAN 111111"));
		customerList.add(new Customer(765432, "Scott", "No", "Fitzgerald", "7777 7777 7777 7777","IBAN 111111"));
		customerList.add(new Customer(876543, "George", "No", "Orwell", "8888 8888 8888 8888","IBAN 111111"));

	
	CustomerLogic logic = new CustomerLogic();
	CustomerView printList = new CustomerView();
	
	//---sort
	logic.sortByName(customerList);
	printList.print(customerList, "Sort list:");
	
	
	//--list by CC		
	String minCC = "3333 1111 1111 1111";
	String maxCC = "6666 1111 1111 1111";
	List<Customer> customerListAgrByCC = new ArrayList<Customer>();
	
	customerListAgrByCC = logic.agrByCC(customerList, minCC, maxCC);
	printList.print(customerListAgrByCC, "\nCredit card list:");
}
	
}
