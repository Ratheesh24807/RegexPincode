package com.pincodeRegex;

import java.util.regex.Pattern;

public class PostalCodeUC2 {

	public static void main(String[] args) {

		String PincodeRegex = "^[0-9]{6}$";
		String Pincode = "400088";
		boolean result = Pattern.matches(PincodeRegex, Pincode);
		System.out.println(result);
		System.out.println("Not possible to enter Albhabetic character at the Begining");

	}

}