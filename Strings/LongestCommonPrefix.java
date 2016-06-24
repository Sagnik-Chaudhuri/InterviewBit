package com.interviewBit.Strings;

import java.util.ArrayList;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

 Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

 As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

 Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
 * */
public class LongestCommonPrefix {
	public String longestCommonPrefix(ArrayList<String> a) {
		if (a == null || a.size() == 0) {
			return "";
		}

		String prefix = a.get(0);

		for (int i = 1; i < a.size(); i++) {
			int j = 0;
			while (j < prefix.length() && j < a.get(i).length()
					&& a.get(i).charAt(j) == prefix.charAt(j)) {
				j++;
			}

			if (j == 0) {
				return "";
			}
			prefix = prefix.substring(0, j);
		}

		return prefix;
	}
}
