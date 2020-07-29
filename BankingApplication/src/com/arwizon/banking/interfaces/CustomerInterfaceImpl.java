package com.arwizon.banking.interfaces;

import java.util.Scanner;

import com.arwizon.banking.model.Customer;

public class CustomerInterfaceImpl implements CustomerIntreface{

	@Override
	public Customer createCustomer(String name, String address, String accountType) {
			Customer c = new Customer();
			c.setName(name);
			c.setAddress(address);
			c.setAccounType(accountType);
			c.setCustomerId(Customer.getCount());
			return c;
				
	}

}
