package com.interviewBit.TwoPointers;

import java.util.ArrayList;

/*
 *Given an array ‘A’ of sorted integers and another non negative integer k, 
 *find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j. 
 * */
public class DiffK {
	public int diffPossible(ArrayList<Integer> a, int b) {

		int i = 0, j = 1;
		while (i < a.size() && j < a.size()) {
			if (i != j && a.get(j) - a.get(i) == b) {
				return 1;
			} else if (a.get(j) - a.get(i) < b)
				j++;
			else
				i++;
		}
		return 0;
	}
}
