package com.mukesh.service;

import java.util.Scanner;

import com.mukesh.exceptions.NameExistsException;
import com.mukesh.exceptions.TooLongException;
import com.mukesh.exceptions.TooShortException;

public class Registration {

	public static void main(String[] args) {
		
		Validator validator = new Validator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username:");
		String username = sc.next();
		try {
			boolean valid = validator.validateName(username);
			if(valid) {
				System.out.println("Welcome " + username);
				System.out.println("Enter the Password:");
				String password = sc.next();
				if(validator.validatePassword(password)) {
					System.out.println("You are registered successfully!!!");
				}
			}
		} catch (NameExistsException e) {
			System.out.println("Name already exists");
		} catch (TooLongException e) {
			System.out.println(e.getMessage());
		} catch (TooShortException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
