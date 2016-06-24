package com.interviewBit.BitManipulation;

import java.util.List;

/*
 *Given an array of integers, every element appears twice except for one. Find that single one.

 Note: Your algorithm should have a linear runtime complexity. 
 Could you implement it without using extra memory? 
 * */
public class SingleNumber {
	public int singleNumber(final List<Integer> a) {
		int x = 0;
		for (int find : a) {
			x = x ^ find;
		}
		return x;

	}
}
