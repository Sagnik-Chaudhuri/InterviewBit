package com.interviewBit.Arrays;

import java.util.HashSet;
import java.util.List;

/*
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using 
 * less than O(n) space and traversing the stream sequentially O(1) times.
 * */

public class DuplicateArray {

	public int repeatedNumber(final List<Integer> a) {
		HashSet<Integer> set = new HashSet<>();

		if (a == null || a.size() == 0) {
			return 0;
		}
		for (int i : a) {
			if (!set.add(i)) {
				return i;
			}
		}
		return -1;
	}

}
