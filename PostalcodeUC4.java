package com.pincodeRegex;

import java.util.regex.Pattern;

public class PostalcodeUC4 {

	public static void main(String[] args) {

		String PincodeRegex = "^[0-9]{3}\s{0,1}[0-9]{3}$";
		String PinCode = "400 088";
		boolean result = Pattern.matches(PincodeRegex, PinCode);
		System.out.println(result);
		System.out.println("We can use space in between 3 digits if needed");
	}

}