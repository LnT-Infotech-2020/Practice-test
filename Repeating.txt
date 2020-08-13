package com.lti.test;

public class Repeating {

	public static void main(String[] args) {
		
		String firstInput = "996598";
		char secondInput = '8';
		int numbOfOcc = 3;
		int count = 0;
		boolean result = false;
		
		for(int i =0;i<firstInput.length();i++) {
			if(firstInput.charAt(i)==secondInput) {
				count++;
			}
		}
		
		if(numbOfOcc == count) {
			result = true;
		}
		System.out.println(result);

	}

}
