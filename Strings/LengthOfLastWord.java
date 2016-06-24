package com.interviewBit.Strings;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.
 * */
public class LengthOfLastWord {
	public int lengthOfLastWord(final String a) {
		if (a == null || a.length() == 0)
			return 0;
		String str = a.trim();
		String[] arr = str.split(" ");

		if (str.length() == 0) {
			return 0;
		} else {
			return arr[arr.length - 1].length();
		}
	}
}
