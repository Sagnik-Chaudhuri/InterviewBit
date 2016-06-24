package com.interviewBit.TwoPointers;

import java.util.ArrayList;

/*
 * Given an array and a value, remove all the instances of that value in the array. 
 * Also return the number of elements left in the array after the operation.
 * It does not matter what is left beyond the expected length.
 * 
 * */
public class RemoveElementFromArray {
	public int removeElement(ArrayList<Integer> a, int b) {
		int count = 0;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == b) {
				count++;
			} else {
				a.set(i - count, a.get(i));
			}
		}
		for (int i = 0; i < count; i++) {
			a.remove(a.size() - 1);
		}
		return a.size();

	}
}
