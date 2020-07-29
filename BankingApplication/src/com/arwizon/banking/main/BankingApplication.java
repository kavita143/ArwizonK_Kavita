package com.arwizon.banking.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.arwizon.banking.exceptions.MyException;
import com.arwizon.banking.interfaces.CustomerInterfaceImpl;
import com.arwizon.banking.interfaces.CustomerIntreface;
import com.arwizon.banking.model.Customer;
import com.arwizon.banking.util.Utilities;

public class BankingApplication {

	public static void main(String args[]) {

		Scanner scr = new Scanner(System.in);
		System.out.println("please enter the array size");
		int size = scr.nextInt();
		Customer[] arr = new Customer[size];

		System.out.println("press 1 to add new customer " + "\n press 2 to display customers"
				+ "\n press 3 to search the customer details" + "\n press 4 to exit");

		while (true) {
			System.out.println("please enter your option");
			int option = scr.nextInt();

			switch (option) {

			case 1:
				String name= null;
				while (true) {
					System.out.println("enter name");
					name = scr.next();

					try {
						Utilities.nameValidation(name);
						break;
					} catch (MyException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}
				
				String address= null;
				while (true) {
					System.out.println("enter address");
					address = scr.next();

					try {
						Utilities.addressValidation(address);
						break;
					} catch (MyException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}
				System.out.println("enter account Type");
				String accountType = scr.next();

				CustomerIntreface obj = new CustomerInterfaceImpl();
				Customer c1 = obj.createCustomer(name, address, accountType);

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null) {
						arr[i] = c1;
						break;
					}

				}

				break;

			case 2:

				for (Customer c : arr) {
					if (c != null)
						System.out.println(c);
				}

				break;

			case 3:
				if (arr[0] != null) {
					System.out.println("please enter customer name to search");
					String name1 = scr.next();
					boolean flag = false;
					for (int i = 0; i < arr.length; i++) {
						if (name1.equals(arr[i].getName())) {
							System.out.println(arr[i]);
							flag = true;
						}
					}
					if (!flag)
						System.out.println("no customer found");

				}

				break;
			case 4:
				System.exit(1);
			default:
				System.out.println("please enter correct option");

			}

		}

	}

}
