package com.interviewBit.TwoPointers;

import java.util.ArrayList;

/*
 * Given a sorted array, remove the duplicates in place such that each element 
 * appear atmost twice and return the new length. Do not allocate extra space 
 * for another array, you must do this in place with constant memory.
 * 
 * */
public class RemoveDupFromSortedArrayVariationOfFirst {
	public int removeDuplicates(ArrayList<Integer> a) {
		int index = 1;
		int count = 1;
		int n = a.size();

		for (int i = 1; i < n; i++) {
			if (a.get(i).intValue() == a.get(i - 1).intValue() && count < 2) {
				a.set(index, a.get(i));
				count++;
				index++;
			} else if (a.get(i).intValue() != a.get(i - 1).intValue()) {
				a.set(index, a.get(i));
				count = 1;
				index++;
			}
		}

		return index;
	}
}
