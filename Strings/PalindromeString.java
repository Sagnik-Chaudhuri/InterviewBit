package com.interviewBit.Strings;

/*
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * 
 * */
public class PalindromeString {
	public int isPalindrome(String a) {
		String str = a.replaceAll("[^0-9A-Za-z]", "").toLowerCase();
		if (str == null || str.length() < 2)
			return 1;
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) == ' ')
				i++;
			if (str.charAt(j) == ' ')
				j--;
			if (str.charAt(i) != str.charAt(j))
				return 0;
			i++;
			j--;
		}
		return 1;
	}
}
