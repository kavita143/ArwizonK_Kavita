package com.arwizon.banking.main;

import java.io.*;
import java.util.Scanner;

import com.arwizon.banking.exceptions.MyException;

public class BankingMain {
	public static void main(String[] args) {
		String name="abc";
		System.out.println("jkjj");
		try {
			callMe(name);
			
			
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void callMe(String name) throws MyException   {

		
		if(!name.matches("[A-Za-z]+"))
			throw new MyException("name can be only alphabets");
		
		
	}

}
