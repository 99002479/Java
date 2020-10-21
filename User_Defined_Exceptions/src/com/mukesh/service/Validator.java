package com.mukesh.service;

import com.mukesh.exceptions.NameExistsException;
import com.mukesh.exceptions.TooLongException;
import com.mukesh.exceptions.TooShortException;

public class Validator {

	private String[] names = {"Mukesh", "Vijay", "Josh", "Rishi", "Karthi", "Dhanush"};
	
	public boolean validateName(String username) throws NameExistsException{
		  for(String uname: names) {
			  if(uname.equals(username)) {
				  throw new NameExistsException();
			  }
		  }
		  return true;
	}
	
	public boolean validatePassword(String password) throws TooLongException, TooShortException{
		if(password.length()>=15) {
			throw new TooLongException("Password is too long");
		}
		if(password.length()<=5) {
			throw new TooShortException("Password is too short");
		}
		return true;
	}
	
}
