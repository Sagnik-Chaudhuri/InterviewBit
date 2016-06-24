package com.interviewBit.TwoPointers;

import java.util.ArrayList;
import java.util.List;

/*
 *Find the intersection of two sorted arrays. 
 * */
public class IntersectionOfSortedArrays {
	public ArrayList<Integer> intersect(final List<Integer> a,
			final List<Integer> b) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0, j = 0;
		for (; i < a.size() && j < b.size();) {
			if (a.get(i).intValue() == b.get(j).intValue()) {
				list.add(a.get(i));
				i++;
				j++;
			} else if (a.get(i) < b.get(j)) {
				i++;
			} else {
				j++;
			}
		}
		return list;
	}
}
