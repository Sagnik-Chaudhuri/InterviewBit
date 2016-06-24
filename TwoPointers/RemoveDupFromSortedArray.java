package com.interviewBit.TwoPointers;

import java.util.ArrayList;

/*
 * Remove duplicates from Sorted Array.Given a sorted array, 
 * remove the duplicates in place such that each element 
 * appears only once and return the new length
 * */
public class RemoveDupFromSortedArray {
	public int removeDuplicates(ArrayList<Integer> a) {
		int index = 1;

		if (a == null || a.size() == 0)
			return 0;

		for (int i = 1; i < a.size(); i++) {

			if (a.get(i).intValue() != a.get(i - 1).intValue()) {

				a.set(index, a.get(i));
				index++;
			}
		}

		return index;

	}
}
