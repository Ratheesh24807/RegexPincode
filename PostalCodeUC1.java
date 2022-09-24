package com.pincodeRegex;

import java.util.regex.Pattern;

public class PostalCodeUC1 {

	public static void main(String[] args) {

		String pinCodeRegex = "^[0-9]{6}$";
		String PostalCode = "400088";
		boolean result = Pattern.matches(pinCodeRegex, PostalCode);
		System.out.println(result);



	}

}